package swing;

public class AWT_SWING {

}
/*
				<AWT>
 운영체제의 특징에 따라 화면을 구성한다.
 (운영체제마다 다른 느낌으로 구현된다.)
 
 				<SWING>
 자바에서 지정되는 look&feel을 적용하여 모든 운영체제에서
 동일하게 구현됨
 
 Container : 창을 컨테이너라고 함. 반드시 한 개 이상이 존재하며, 컨테이너 위에 컴포넌트가 올라간다.
 			Frame, Panel, Window ( AWT)
 			JFrame, JPanel ( swing)
 
 Component : 실제로 컨테이너 위에 올라간 후 화면 구성을 담당하는 것들.
 			Button, TextField, TextArea, ...
 			JButton, Label, ...
 
 LayoutManagerf : 컨테이너 위에 컴포넌트를 올릴 때 위치 크기 등을 지정하는 것들
 				 BorderLayout, GridLayout
 
 Frame 클래스 객체를 생성해서 윈도우 만들기
 
 Frame window = new Frame(); --> 제목없는 윈도우 만든다.
 Frame window = new Frame(제목); --> 제목있는 윈도우 만든다.
 
 window.setTitle("새로운 제목"); --> 윈도우 제목을 변경
 window.setSize(width, height); --> 윈도우의 크기를 변경
 window.setLocation(x, y); --> 윈도우의 위치를 변경
 window.setBounds(x, y, width, height); --> 윈도우의 크기와 위치를 변경한다.
 window.setBackground(bgcolor); --> 윈도우의 배경색을 변경 
 
 	Frame 클래스를 사용해서 생성한 윈도우 닫기
 	
 윈도우 닫기 버튼을 클릭하면 자동으로 실행되는
 windowClosing()메소드를 override해서 윈도우를
 닫는 코드를 넣어준다.
 
 System.exit(0); --> 프로그램을  강제로 종료. 모든 윈도우가 닫힘 
 Window.dispose(); --> 윈도우가 사용하는 자원을 시스템에게 반납한다. 현재 윈도우(그 객체)만 닫는다
 Window.setVisible(true); --> 윈도우를 화면에 표시한다.
 
 
 Dimension : 모니터 해상도와 윈도우 크기에 대한 작업을 할 경우 사용
 
 Toolkit : 모니터 해상도, 디스크에 저장된 이미지 파일을 읽을 때 사용
 
 모니터 정가운데로 윈도우창 위치시키는 법
 setLocation((모니터 해상도.width - 윈도우 크기.width)/2, (모니터 해상도.height - 윈도우 크기.height)/2);
 
 
 
 
 
 
 
 
*/
