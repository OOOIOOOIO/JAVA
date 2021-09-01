package collectionFramework;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class WhyUseTheSet {
	public static void main(String[] args) {
		final int SIZE = 10_000_000;
		final List<Integer> arrayList = new ArrayList<Integer>(SIZE);
		final Set<Integer> hashSet = new HashSet<Integer>(SIZE);
		final int data = 9_000_000;
		
		// 순차 병렬 집계연산
		IntStream.range(0,SIZE).forEach(value->{
			arrayList.add(value);
			hashSet.add(value);
		});
		
		
		//끝시간 - 시작시간 = 걸린시간
		Instant start = Instant.now();
		arrayList.contains(data);
		Instant end = Instant.now();
		long eTime = Duration.between(start, end).toMillis();
		System.out.println("array list search time : " + (eTime/1000.0) + "초");
		
		start = Instant.now();
		hashSet.contains(data);
		end = Instant.now();
		eTime = Duration.between(start, end).toMillis();
		System.out.println("hash set search time : " + (eTime/1000.0) + "초");
		
	}
}

/*
 set은 검색의 목적이 있기 때문에 순서 정보를 관리할 필요가 없어서
데이터 크기에 상관없이 검색에 걸리는 시간이 매우 짧다
 반면 list는 index를 관리해야 하기 때문에 상대적으로 시간이 오래 걸린다.
 
 그러므로 기능적 차이가 없다면 hashSet을 써야한다.
 */
