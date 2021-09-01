package graphicTest;

public class Explain {

}

/*

					<Graphic>
 윈도우에 그래픽을 표시하려면 panel 또는 JPanel 클래스를 상속받고
paint()메소드를 override해서 그래픽을 구현 후 작성한 클래스의 윈도우(Frame, JFrame)에 추가하면된다
 
 
 drawString(str, x, y) : 윈도우 좌표 x, y에 str을 그린다.;
 drawLine(x1, y1, x2, y2) : x1, y1(시작점)부터 x2, y2(끝점)까지 직선을 그린다.;
 setColor(Color); : 도형의 색을 변경한다.
 drawRect(x, y, width, height); : 사각형 그리기
 drawObal(x, y, width, height); : 사각형에 내접하는 원을 그린다.


 Color 클래스 생성자 4번쨰 인수 : 투명도 (r, g, b, 투명도)
범위는 0 ~ 255 사이의 숫자, 기본값이 255, 숫자가 작을수록 투명도 낮아짐
 
repaint(): 화면에 표시할 그래픽의 내용이 변경되면 반드시 repaint()메소드로
		 paint() 메소드를 다시 실행해서 변경된 내용으로 다시 그려줘야한다.

 Panel 클래스를 상속받아 작성한 그ㄴ래픽을 다시 그릴 경우 기존의 내용을 모두 지우고 다시 그리기 때문에
컴퓨터의 성능이 낮은 경우 화면이 깜빡거리는 현상이 발생할 수도 있다.

 JPanel 클래스를 상속받아 작성한 그래픽을 다시 그리면 기존의 내용을 지우지 않고 다시 그리기 때문에
깜빡거리는 현상이 발생되지 않는다.

-----------------------------------------------------------------------------

					<ActionListener>
					
 컴포넌트 단위로 ActionListener를 걸어주려면 컴포넌트에서 addActionListener()메소드를 실행하고
메소드의 인수로 actinoListener라는 인터페이스 객체를 익명으로 구현하면 actinoPerformed() 메소드에
실행할 기능을 구현한다.

 여러 컴포넌트에 일괄적으로 ActionListener를 걸어주려면 ActionListener 인터페이스를 구현하고
actionPerformed() 메소드를 override해서 실행할 기능을 구현한다.

버튼 위에 글씨가 없으면 getActionCommand() 메소드를 사용할 수 없다.
어떤 컴포넌트에서 ActionListener가 실행될지 모르기 때문에 자바의 최상위 Object클래스 타입으로
받아서 사용할 컴포넌트로 형변환 시켜서 사용한다.
getSource() : Listener가 실행된 컴포넌트의 정보를 얻어온다.

addActionListener(this)로 actionPerformed() 메서드가 호출되면 ActionListener가 실행된 컴포넌트의 정보가
actionPerformed() 메서드의 인수 ActionEvent 클래스 객체 e로 넘어온다.






*/