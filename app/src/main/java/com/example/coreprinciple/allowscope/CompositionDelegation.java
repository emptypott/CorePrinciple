package com.example.coreprinciple.allowscope;

public class CompositionDelegation {

    // 상속에서는 슈퍼 클래스가 허용하고 있는 조작을 서브 클래스에서 모두 허용해야 하지만,
    // 컴포지션과 위임에서는 조작을 제한할 수 있다. (스택의 예를 떠올릴 것)
    // 클래스는 결코 변경할수 없지만, 컴포지션하고 있는 객체는 자유롭게 변경할 수 있다. 학생이 취직하여 사회인이 될 수 있다.

    // 결점으로는 위임을 위해 단순히 다시 호출만 하는 메소드를 작성하는 것은 번거롭다는 것을 들 수 있다.

    // Shape의 경우도 다음과 같이 하면 상속을 사용하지 않고 실현할 수 있다.

    // Shape를 내용을 구현한 ShapeImpl 클래스를 만든다.

    // Polyline이나 Circle 클래스에서 ShapeImpl 을 컴포지션하고 메소드를 위임한다.
    // ShapeImpl 클래스의 메소드를 추출한 Shape 인터페이스를 작성하고 Polyline이나 Circle에서 그것을 implements 한다.

    // 타원에 대하여 가로세로 비를 변경하는 조작을 허용하는 경우 circlr 을 ellipse의 서브 클래스로 해서는 안된다.
    // 서브 클래스는 슈퍼 클래스의 모든 조작을 허용해야 하는데, Circle의 가로세로 비를 변경하면 그것은 이미 Circle이라고 할 수

    // 없기 때문이다.

    // 원에 대하여 어떤 조작을 행하여 타원으로 만들 수 있다면 타원과 원의 클래스를 나눠서는 안된다.
    // 클래스는 변경할 수 없기 때문이다.

    private void linkedListStudy() {

    }

}
