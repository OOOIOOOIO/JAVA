package java_class_2;

public abstract class Shape {
	double area;
	public abstract void draw(double weight, double height);
	
	final static  void function() { // ������ ���ϰ� ����
		System.out.println("�߻� Ŭ������ �Ϲ� �޼��� �Դϴ�.");
		
	}
}



class Rect extends Shape{
	

	@Override
	public void draw(double weight, double height) {
		System.out.println("���簢�� �� 4�� ����");
		area = weight * height;
		System.out.println("���� : " + area +"\n");
	}
	

}


class Tri extends Shape{
	
	@Override
	public void draw(double weight, double height) {
		System.out.println("�ﰢ�� �� 3�� ����");
		area = (weight * height) / 2;
		System.out.println("���� : " + area);
		
	}
}