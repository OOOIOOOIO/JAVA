package layoutTest;

public class Explain {

}
/*

						<BorderLayouy>
 BorderLayout은 영역을 잡아서 여러 컨테이너와 컴포넌트를 배치할 수 있도록해준다.
컨테이너를 5개 영역으로 나누고 각각의 영역에 컴포넌트를 배치하는 레이아웃 매니저이다.

쓰는법
add(컴포넌트, 방향) : 방향을 생략시 CENTER가 기본값
add(label, border.SOUTH)
add(laber, BorderLayout.NORTH)
add("South", label) : 방향을 넘겨줄 때 문자열로 할 경우 첫 문자만 대문자

한 컨테이너에 여러개의 컴포넌트를 올릴 때 panner, JPanel에 컴포넌트를 배치 후 컨테이너에 올리면 좋다.

				
				
				
				
				
				
						<FlowLayout>
						
FlowLayout은 컨테이너(Frame, JFrame)에 컨테이너(Panel, JPanel), 컴포넌트(Label, JLabel)를 원래 크기로
차례차례 배치하는 레이아웃 매니저이다. 여러개의 컴포넌트를 하나의 컨테니어 추가할 때 겹치지 않고 각자의
크기로 순서대로 붙일 수 있도록 해준다


쓰는 법
setLayout(new FlowLayout());

label.setBackground(Color) : Label의 배경색을 변경
label.setForeground(Color) : Label의 글자색을 변경
label.setAlignment(Label) : Label의 텍스트 정렬 방식을 변경

FlowLayout 객체를 생성할 때 컨테이너의 정렬 방식을 지정할 수 있다.

new FlowLayout(FlowLayout.CENTER);
new FlowLayout(FlowLayout.LEFT);
new FlowLayout(FlowLayout.RIGHT);

add(객체, 객체.CENTER or FlowLayout.CENTER);

수평정렬
label.setHorizontalAlignment(JLabel.LEFT)

수직정렬
label.setVerticalAlignment(JLabel.LEFT)

-----------------------------------------------------------------------------
Font 클래스

Label에서는 글꼴이 한정적이다.(JLabel은 한글 글꼴 사용가능)
name : Serif, SansSerif, Monospaced, Dialog, DialogInput(이 글꼴들만 사용가능)
style : Font.BOLD : 굵게, Font.ITALIC : 기울임, FONT.PLAIN : 보통모양

add(label) : 컨테이너에 컴포넌트 추가한다

JLabel객체의 배경색을 변경하려면 setOpaque(true)를 실행해서 배경을 투명하게 변경시켜야 한다.

setPreferredSize(new DImension(size, size)); // 컴포넌트의 크기변경


-----------------------------------------------------------------------------
 						< GridLayout>
 						
 GridLayout은 컨테이너를 격차(grid, 바둑판) 모양으로 나누고 컴포넌트를 나눠진 구역에
순서대로 배치하는 레이아웃 매니저이다.

GridLayout grid = new GridLayout(4, 4);  --> 여백 없는 4행 4열짜리 GridLayout
GridLayout grid = new GridLayout(4, 4, 3, 0);  --> 세로 여백이 3인 "
GridLayout grid = new GridLayout(4, 4, 0, 3);  --> 가로 여백이 3인 "
GridLayout grid = new GridLayout(4, 4, 3, 3);  --> 모든 여백이 3인 "

컴포넌트(버튼) 공통점
setEnable(false) : 컴포넌트를 비활성화 시킨다
setVisible(false) : 컴포넌트를 컨테이너를 표시하지 않는다.

버튼 위에 글씨가 있을 때
getActionConmmand() : 버튼 위의 문자를 얻어온다.

버튼 위에 글씨가 없을 때
setName() : 컴포넌트에 이름을 넣어준다
getName() : 컴포넌트의 이름을 얻어온다









*/