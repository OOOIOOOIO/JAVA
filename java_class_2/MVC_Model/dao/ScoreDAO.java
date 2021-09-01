package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import dto.StudentVO; // StudentVO�� �ٸ� ��Ű���� �����ϱ� import

public class ScoreDAO {
	public final int SUBJECT_SIZE = 3;
	public Scanner sc = new Scanner(System.in);
	
	private ArrayList<StudentVO> arStudent = null; // StudentVO�� ��ü�� �޾ƹ���
	
	// �� �� �� +a -> ArrayList
	private ArrayList<Integer> arScore = null; //�Ź� �ʱ�ȭ �Ǿ�� �ϴϱ� null
	
	private LinkedHashMap<StudentVO, ArrayList<Integer>> smsMap = new LinkedHashMap<>(); 
	// StudentVO�� arScore�� Ű�� ����� ����. ������ ���� ��ũ���ؽ��� ���
	
	public void index() {
		// ���� view�� -> ��Ʈ�ѷ��� ���� �� �ξ� ����
		int choice = 0;
		do {
			System.out.println("�л� ���� �ý���");
			System.out.println("1. ���");
			System.out.println("2. �˻�");
			System.out.println("3. ����");
			System.out.println("4. ����");
			System.out.println("5. ������");
			choice = sc.nextInt();
			sc.nextLine(); // ���� ���̱�
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
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		} while(true);
	}
	
	// Ŭ���� ���� ���ϱ� StudentVo Ŭ����, arStudent�� ��ü���̴� ����Ŭ������ ArrayList<classtype>�� ����
	
	public void join() {
		String isQuit = ""; // ������
		
		do {
			System.out.println("===============[�л������Է�(�����ϱ� q)]===============");
			System.out.print("�̸� : ");
			String name = sc.nextLine(); //���� �����ϱ�
			System.out.println("���� : ");
			int age = sc.nextInt(); // �ִ� ���� ��� ����
			sc.nextLine(); // next���� ģ ���� �Ծ��ֱ�
			StudentVO std = new StudentVO(name, age); // �ʱ�ȭ. name�̶� age �־���
			arStudent = new ArrayList<StudentVO>(); // �ʱ�ȭ
			arScore = new ArrayList<Integer>(); // �ʱ�ȭ
			
			arStudent.add(std); // arStudent �л� �߰�
			
			System.out.println("���� ���� ���� ������ �Է��ϼ���\nex) 100 90 20");
			for (int i = 0; i < SUBJECT_SIZE; i++) {
				arScore.add(Integer.parseInt(sc.next())); //���� ���, ����� �ϳ��� ����				
			}
			smsMap.put(std, arScore);
			System.out.println("�����Ұž�?");
			sc.nextLine(); // for ������ ģ next ���� �Ծ��ֱ�
			isQuit = sc.nextLine();
			
			System.out.println();
		}
		while(isQuit.intern() != "q"); // ''���ڴ� ���� �ᵵ �Ǵ��� ""���ڿ��� ������ ���ϸ� �ȵ�
		list(smsMap);
		
	}
	
	
	public void list(LinkedHashMap<StudentVO, ArrayList<Integer>> db) {
		int size = smsMap.size();
		Set<Entry<StudentVO, ArrayList<Integer>>> set = db.entrySet();
		Iterator<Map.Entry<StudentVO, ArrayList<Integer>>> iter = set.iterator();
		
		if(size == 0) {
			System.out.println("��ϵ� �л��� �����ϴ�.");
		}
		else {
			System.out.println("==============[���Ը��]==============");
			while(iter.hasNext()) {
				// HashMap : FILO (first in last out -> arraylist�� �ְ� reverse����ߵ�
				Entry<StudentVO, ArrayList<Integer>> temp = iter.next();
				
				temp.getKey().show();
				System.out.println("	����		����		����");
				System.out.print("	");
				for (int score : temp.getValue()) {
					System.out.print(score + "��		");
				}
				System.out.println("\n");
			}			
		}
	}
	
	
	public void search() {
		Set<StudentVO> scoreSet = smsMap.keySet();
		Iterator<StudentVO> iter = scoreSet.iterator();
		
		String name = null;
		System.out.println("�˻��� �л��� �̸�");
		name = sc.nextLine();
		
		System.out.println("================[�˻����]================");
		while(iter.hasNext()) {
			StudentVO std =iter.next();
			if(name.equals(std.getName())) {
				std.show();
				System.out.println("	����		����		����");
				System.out.print("	");
				for(int score :smsMap.get(std)) {
					System.out.print(score + "��		");
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
		//�ؽ��� smsMap�� Set���� ��üȭ ���� �ʰ� �ٷ� iterator���� smsMap.keySet�� set������ �� �� �˾ƾߵ�
		
		System.out.println("������ �л��� ��ȣ : ");
		num = sc.nextInt();
		
		while(iter.hasNext()) {
			StudentVO std = iter.next();
			if(num == std.getNumber()) {
				isUser = true;
				System.out.println("1. ��������\n2. ��������");
				choice = sc.nextInt();
				sc.nextLine();
				switch(choice) {
				case 1 :
					System.out.println("�̸��� ���̸� ������� �Է��ϼ���");
					std.setName(sc.next()); // �̸� �ٲٱ�
					std.setAge(Integer.parseInt(sc.next())); // �̸� �ٲٱ�
					sc.nextLine(); // ���� ���̱�
					System.out.println("���� ����");
					break;
				case 2 :
					System.out.println("���� ���� ���� ������ ������� �Է��ϼ���");
					for (int i = 0; i < SUBJECT_SIZE; i++) {
						smsMap.get(std).set(i, sc.nextInt()); 
						//smsMAp.get() ������ ArrayList�� �� �� �˾ƾ��Ѵ�
						// �л��� ���� : �ؽ����� ����� get(key)�� value�� ������ �� �ִ�. set(index, ������)���� �����ϱ�
					}
					sc.nextLine();
					System.out.println("���� ����");
					break;
				default :
					isUser = false;
					System.out.println("���� ����");
				}
			}
			
		}
		if(!(isUser)) {
			System.out.println("�����Ͻ� �л��� ��ȣ�� �������� �ʽ��ϴ�.");
		}
		list(smsMap);
	}
	
	
	public void delete() {
		// Iterator�� �˻�(��ȣ)
		int num = 0;
		StudentVO delStd = null;
		System.out.println("�����Ͻ� �л��� ��ȣ�� �Է��ϼ���");
		num = sc.nextInt();
		sc.nextLine(); // ����Ű ���̱�
		
		Iterator<StudentVO> iter = smsMap.keySet().iterator();
		//�ؽ��� smsMap�� Set���� ��üȭ ���� �ʰ� �ٷ� iterator���� smsMap.keySet�� set������ �� �� �˾ƾߵ�
		
		while(iter.hasNext()) {
			StudentVO std = iter.next();
			if(num == std.getNumber()) {
				delStd = std;
			}
		}
		if(delStd == null) {
			System.out.println("�Է��Ͻ� ��ȣ�� �л��� �����ϴ�");
		}
		else {
			smsMap.remove(delStd);
			System.out.println("���� �Ϸ�");
			list(smsMap);
		}
	}
	
	
}







