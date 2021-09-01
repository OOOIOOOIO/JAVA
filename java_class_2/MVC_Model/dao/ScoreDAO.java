package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import dto.StudentVO; // StudentVO가 다른 패키지에 있으니까 import

public class ScoreDAO {
	public final int SUBJECT_SIZE = 3;
	public Scanner sc = new Scanner(System.in);
	
	private ArrayList<StudentVO> arStudent = null; // StudentVO를 객체로 받아버림
	
	// 국 영 수 +a -> ArrayList
	private ArrayList<Integer> arScore = null; //매번 초기화 되어야 하니까 null
	
	private LinkedHashMap<StudentVO, ArrayList<Integer>> smsMap = new LinkedHashMap<>(); 
	// StudentVO랑 arScore를 키랑 밸류로 받음. 순서를 위해 링크드해쉬맵 사용
	
	public void index() {
		// 메인 view단 -> 컨트롤러에 쓰는 게 훨씬 편함
		int choice = 0;
		do {
			System.out.println("학생 관리 시스템");
			System.out.println("1. 등록");
			System.out.println("2. 검색");
			System.out.println("3. 삭제");
			System.out.println("4. 수정");
			System.out.println("5. 나가기");
			choice = sc.nextInt();
			sc.nextLine(); // 엔터 먹이기
			if(choice == 5) break;
			
			switch(choice) {
			case 1 :
				join();
				break;
			case 2 :
				search();
				break;
			case 3 :
				delete();
				break;
			default :
				System.out.println("잘못입력하셨습니다.");
			}
		} while(true);
	}
	
	// 클래스 들이 들어가니까 StudentVo 클래스, arStudent는 객체명이니 랩퍼클래스인 ArrayList<classtype>를 써줌
	
	public void join() {
		String isQuit = ""; // 나가기
		
		do {
			System.out.println("===============[학생정보입력(종료하기 q)]===============");
			System.out.print("이름 : ");
			String name = sc.nextLine(); //엔터 주의하기
			System.out.println("나이 : ");
			int age = sc.nextInt(); // 애는 엔터 취급 안함
			sc.nextLine(); // next에서 친 엔터 먹어주기
			StudentVO std = new StudentVO(name, age); // 초기화. name이랑 age 넣어줌
			arStudent = new ArrayList<StudentVO>(); // 초기화
			arScore = new ArrayList<Integer>(); // 초기화
			
			arStudent.add(std); // arStudent 학생 추가
			
			System.out.println("국어 영어 수학 점수를 입력하세요\nex) 100 90 20");
			for (int i = 0; i < SUBJECT_SIZE; i++) {
				arScore.add(Integer.parseInt(sc.next())); //점수 담기, 띄어쓰기로 하나씩 받음				
			}
			smsMap.put(std, arScore);
			System.out.println("종료할거야?");
			sc.nextLine(); // for 문에서 친 next 엔터 먹어주기
			isQuit = sc.nextLine();
			
			System.out.println();
		}
		while(isQuit.intern() != "q"); // ''문자는 같다 써도 되느데 ""문자열은 값으로 비교하면 안됨
		list(smsMap);
		
	}
	
	
	public void list(LinkedHashMap<StudentVO, ArrayList<Integer>> db) {
		int size = smsMap.size();
		Set<Entry<StudentVO, ArrayList<Integer>>> set = db.entrySet();
		Iterator<Map.Entry<StudentVO, ArrayList<Integer>>> iter = set.iterator();
		
		if(size == 0) {
			System.out.println("등록된 학생이 없습니다.");
		}
		else {
			System.out.println("==============[가입목록]==============");
			while(iter.hasNext()) {
				// HashMap : FILO (first in last out -> arraylist에 넣고 reverse해줘야됨
				Entry<StudentVO, ArrayList<Integer>> temp = iter.next();
				
				temp.getKey().show();
				System.out.println("	국어		영어		수학");
				System.out.print("	");
				for (int score : temp.getValue()) {
					System.out.print(score + "점		");
				}
				System.out.println("\n");
			}			
		}
	}
	
	
	public void search() {
		Set<StudentVO> scoreSet = smsMap.keySet();
		Iterator<StudentVO> iter = scoreSet.iterator();
		
		String name = null;
		System.out.println("검색할 학생의 이름");
		name = sc.nextLine();
		
		System.out.println("================[검색결과]================");
		while(iter.hasNext()) {
			StudentVO std =iter.next();
			if(name.equals(std.getName())) {
				std.show();
				System.out.println("	국어		영어		수학");
				System.out.print("	");
				for(int score :smsMap.get(std)) {
					System.out.print(score + "점		");
				}
				System.out.println("\n");	
			}
		}
	}
	
	
	public void update() {
		list(smsMap);
		int num = 0;
		int choice = 0;
		boolean isUser = false;
		Iterator<StudentVO> iter = smsMap.keySet().iterator();
		//해쉬맵 smsMap을 Set으로 객체화 하지 않고 바로 iterator했음 smsMap.keySet을 set값으로 볼 줄 알아야됨
		
		System.out.println("수정할 학생의 번호 : ");
		num = sc.nextInt();
		
		while(iter.hasNext()) {
			StudentVO std = iter.next();
			if(num == std.getNumber()) {
				isUser = true;
				System.out.println("1. 정보수정\n2. 점수수정");
				choice = sc.nextInt();
				sc.nextLine();
				switch(choice) {
				case 1 :
					System.out.println("이름과 나이를 순서대로 입력하세요");
					std.setName(sc.next()); // 이름 바꾸기
					std.setAge(Integer.parseInt(sc.next())); // 이름 바꾸기
					sc.nextLine(); // 엔터 먹이기
					System.out.println("수정 성공");
					break;
				case 2 :
					System.out.println("국어 영어 수학 점수를 순서대로 입력하세요");
					for (int i = 0; i < SUBJECT_SIZE; i++) {
						smsMap.get(std).set(i, sc.nextInt()); 
						//smsMAp.get() 까지를 ArrayList로 볼 줄 알아야한다
						// 학생의 점수 : 해쉬맵의 밸류값 get(key)로 value값 가져올 수 있다. set(index, 수정값)으로 수정하기
					}
					sc.nextLine();
					System.out.println("수정 성공");
					break;
				default :
					isUser = false;
					System.out.println("수정 실패");
				}
			}
			
		}
		if(!(isUser)) {
			System.out.println("수정하실 학생의 번호가 존재하지 않습니다.");
		}
		list(smsMap);
	}
	
	
	public void delete() {
		// Iterator로 검색(번호)
		int num = 0;
		StudentVO delStd = null;
		System.out.println("삭제하실 학생의 번호를 입력하세요");
		num = sc.nextInt();
		sc.nextLine(); // 엔터키 먹이기
		
		Iterator<StudentVO> iter = smsMap.keySet().iterator();
		//해쉬맵 smsMap을 Set으로 객체화 하지 않고 바로 iterator했음 smsMap.keySet을 set값으로 볼 줄 알아야됨
		
		while(iter.hasNext()) {
			StudentVO std = iter.next();
			if(num == std.getNumber()) {
				delStd = std;
			}
		}
		if(delStd == null) {
			System.out.println("입력하신 번호의 학생이 없습니다");
		}
		else {
			smsMap.remove(delStd);
			System.out.println("삭제 완료");
			list(smsMap);
		}
	}
	
	
}







