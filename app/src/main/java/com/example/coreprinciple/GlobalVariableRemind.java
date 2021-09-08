package com.example.coreprinciple;

public class GlobalVariableRemind {
    // C 등의 언어에는 글로벌 변수라는 것이 있다.
    // 글로벌 변수는 프로그램의 어디에서든 참고할 수 있는 변수이다.

    // Java에는 글로벌 변수가 없다고 주장하는 사람들이 있다.

    // 분명히 Java의 언어 사양에는 글로벌 변수라는 단어는 등장하지 않는다.
    // 그러나 Java에서도 C등의 글로벌 변수와 같은 변수를 만들 수는 있다.

    public static int globalVariableNumber1;

    public void globalVariableFind() {
//        GlobalVariableRemind.globalVariableNumber1

        // GlobalVariableRemind.globalVariableNumber1 이라고만 쓰면
        // 이 필드는 프로그램 안의 어디에서는 참조할 수 있게 된다.

        // 즉, 글로벌 변수와 동일해 지는 것이다.

        // 그러나 public 이 아닌 private 로 하면 다른 클래스에서는 참조할 수 없게 된다.

        // 이것은 C로 말하면 static(이 static은 java의 static과는 전혀 의미가 다르다)을 붙여
        // 다른 소스 파일에서 참조할 수 없게 하는 변수에 상당한다.

        // static 을 붙인 필드를 Java에서는 클래스 필드라고 부른다.


    }

    // global variable.. 과연 안좋을까요?

    // 최긍네 객체 지향과 함께 자주 언급되는 개념이 바로 디자인 패턴이다.
    // 객체 지향 설계의 정석집이자 디자인 패턴의 바이블이라고 할 수 있는 객체 지향에 있어
    // 활요도를 높이기 위한 디자인 패턴 -> GoF 본 이라고 불리는 경우도 있다.

    // Singleton 패턴이라는 것이 있다.
    // 이것은 어플리케이션 실행 중에 어떤 클래스의 인스턴스 객체를 한개만 생성되게 보증하는 테크닉으로,

    // private static 필드가 가리키는 곳에 유일한 객체를 생성함으로써 실현한다.

    // "인스턴가 유일" -> Singleton 패턴이 글로벌 변수와 동일하다는 의미이다.

    // 인스턴스가 진정으로 하나여도 된다. 그러나 앞의 워드프로세서의 예와 같이 설계 -> 확장?
    // 사양이 달라지게 되는 경우도 많다.

    // 역자주 중요

    // Singleton 패턴은 JSP, Servlet 등을 이요한 웹 시스템 구축시, 데이터 베이스에 접속하는
    // 커넥션을 관리하는 역할을 수행하는 객체를 생성할 때 많이 사용되고 있다.
    // 이러한 웹 시스템에서는 일반적으로 데이터베이스 연결을 관리하는 객체를 전체 시스템에서
    // 하나만 생성한 후 이를 통해 Connection 을 가져오고 반납 처리를 하게 된다.



}
