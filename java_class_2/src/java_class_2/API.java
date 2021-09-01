package java_class_2;

public class API {

}
/*
			<API : Application Programming In>
 자바 시스템을 제어하기 위해서 자바에서 제공하는 명령어들을 의미한다.abstract
선배 개발자들이 java에서 코딩을 쉽게 할 수 있도록 만들어 놓은 것

ex)
java.lang : 자바 프로그래밍을 위한 가장 기본적인 패키지와 클래스를 포함하고 있다
java.utill : 프로그램을 제어하기 위한 클래스와 데이터를 효율적으로 저장하기 위한 클래스
			들을 담고 있다
java.io : 키보드, 모니터, 프린터, 파일 등을 제어할 수 있는 클래스들의 모음
java.net : 통신을 위한 기능들을 담고있다.

https://docs.oracle.com/en/java/javase/15/ -> API Documents

API의 종류는 굉장히 많고 다양하기 때문에 모두 외우는 것은 불가능하다
그렇게 때문에 처음 보는 API라도 설명을 잘 읽고 맞는 목적으로 사용하는 방법을 알아야 한다

javadoc(클래스, 메서드에 대한 도움말)

JAVA API문서는 jacadoc로 만들어진 문서라고 볼 수 있다.


@auther 개발자
@exception : 메소드에서의 예외 확인
@param : 메소드의 매개변수
@return : 메소드의 반환값
@see : 다른 주제에 관한 링크 지정(관련있는 주제)
@serial : 직렬화 필드						-> 이런식으로 알려줌

하지만 주석을 작성해도 자동으로 javadoc 문서가 만들어지지 않는다
*/

/** -> 파란색 주석이 달림, 메서드나 클래스를 설명할 때 사용
*/