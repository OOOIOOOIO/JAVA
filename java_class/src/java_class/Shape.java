package java_class;

public abstract class Shape {
	double area;
	
	
	abstract void showArea(double w, double h); 
	//�߻� �޼���, �ڽ� Ŭ�������� ������ �ʼ�
	
	
	final void function() { 
		// final : ��� -> �ڽ�Ŭ�������� ������ �Ұ�, ��븸 ����
		System.out.println("�߻� Ŭ������ �Ϲ� �޼����Դϴ�.");
	}
}	

class Ret extends Shape{ // abstract class�� ��� �޾ƾߵ�
	
	@Override
	void showArea(double w, double h) {
		area = w*h;
		System.out.println("���� : " + area);
		
	}
	
}

class Tri extends Shape{ // abstract class�� ��� �޾ƾߵ�
	
	@Override
	void showArea(double w, double h) {
		area = (w * h) / 2;
		System.out.println("���� : " + area);
	
	
	}
}
