package com.example.coreprinciple.accessstudy;

public class AccessControlHow {

    // 4.2.1 멤버의 액세스 제어에서 설명한 액세스 제어는, 클래스가 단위로 적용된다.

    // 인스턴스 단위는 아니다.

    // 1. 액세스 제어는 static 멤버에 대해서도 적용된다.

    // private static 멤버는 그 클래스의 어떤 인스턴스에서도 액세스 가능하며, (동일한 클래스)
    // 반대로, static 메소드에서는 그 클래스의 모든 인스턴스의 private 멤버에 액세스 할 수 있다.


    private int numberThree = 3;

    private static void methodNumberOne() {
        AccessControlHow accessControlHow2 = new AccessControlHow();

        int jeongsu = 0;

        jeongsu = accessControlHow2.numberThree;

        // 이런식으로 access 가 가능하다는 이야기인가.

    }

    // 2. 동일한 클래스이면 인스턴스가 달라도 private 멤버에 액세스 할 수 있다.

    // 역자주!

    // 위에서의 설명은 동일한 클래스 내에서 적용되는 설명인 것 같다. 아래의 예제에서 보듯이 동일 클래스 내부에서
    // 해당 클래스의 인스턴스를 생성하는 경우의 예이다.

    // ClassA에서 ClassB 인스턴스를 만들 경우, 설명한 1번 항목처럼, private static 멤버를 Access 할 수 없다.

    // static 멤버는 차치하고, 인스턴스의 멤버에 대하여 private 인데도, 다른 인스턴스에서 간섭할 수 있다는 데
    // 위화감을 느끼는 사람이 많을 것이다.

    // 그러나 어떤 클래스를 코딩하고 있는 프로그래머에게 그 클래스의 상세 구현을 은폐해서도 안된다.

    // 동일한 클래스이면, 인스턴스가 달라도, private 멤버를 엿볼 수 있다는 특성을 이요하면,
    // clone() 메소드와 같은 메소드를 만들 때 특히 편리하다.

    // 다른 인스턴스에서의 private 멤버에 대한 액세스를 금지했기 때문에, 액세서로 구멍을 뚫어야 한다면,
    // 그야 말로 본말이 전도된 이야기가 될 것이다.

    // 4.2.3 클래스의 액세스 제어

    // public 무지정

    // 인터페이스 멤버긔 경우

    // interface 멤버는 필드, 메소드 불문하고 모두 public 인 것이다.

    // interface 멤버에 protected 나 private 를 지정할 수는 없다.

    // JLS java language specification

    // 인터페이스의 메소드에 대하여 public 수식자를 지정하는 것이, 허용되고 있지만, 스타일로서는 전혀 권장할 수 없다.

    // 제임스 고슬링

    // public 이 아닌 멤버를 인터페이스에 갖게 하는 것은 의미가 없다. 인터페이스의 멤버에 대한 액세스 제어에
    // 인터페이스 자신의 액세스 제한을 적용하는 것은 의미가 있다.

    // 즉 멤버는 전부 public 이지만, 다른 패키지에 숨기고 싶으면 인터페이스 자체에 public 이외의 것을 적용하면 된다.
    // 는 것이다.

    // 멤버별로 제어할 수 없으므로 불편한 면도 있지만, 나름대로 그럴듯 한 규칙이다.

    // 그러나 인터페이스의 멤버가 항상 public 이기 때문에, 인터페이스를 implements 한 측의 클래스에에서도
    // 멤버를 public 해야 한다.
    // 오버라이드한 경우 액세스 제어는 확대할 수밖엥 ㅓㅂㅅ다.
    // 는 것은 좀 납득이 가지 않는다.
    // interface는 그렇다고 쳐도 public이 아닌 클래스에 public 메소드가 있다는 것은 아무래도...


}
