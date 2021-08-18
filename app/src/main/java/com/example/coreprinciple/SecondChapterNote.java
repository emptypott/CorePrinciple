package com.example.coreprinciple;

public class SecondChapterNote {


    // Java의 입문서 등에는 Java에는 포인터가 없다는 말이 자주 등장한다.
    // 이것만큼 Java 입문자의 머릿속을 혼란스럽게 하는 말도 없을 것이다. Java는 포인터가 없기는 커녕 프리미티브형을 제외하면
    // 포인터밖에 없는 언어이다. 그러나 Java 에서는 포인터에 상당하는 것을 참조라고 부른다.

    // C/ C++ 등의 언어에서 포인터를 마스터한 사람의 눈에 Java의 참조는 포인터 자체로 보일 것이다. C++ 의 참조는 Java 의 참조와는
    // 다른 것이며, Java의 참조는 어디까지나 C++ 의 포인터에 상당한다. 그러나 Java의 참조는 C/C++ 의 포인터에 비하면
    // 어느정도 기능이 제한되어 있다.

    // Java는 참조, 즉 C/C++ 에서 말하는 포인터를 강하게 의식하지 않으면 구사하기 어려운 언어이다.
    // 이 장에서는 Java는 강하게 포인터를 의식해야 하는 언어이다 라는 관점에 입각하여 혼동하기 쉬운 점에 대하여 정리해 보겠다.

    // C 나 C++ 을 모르는 사람의 입장에서 보면 포인터든 참조든 아무런 상관이 없을지도 모른다. 그러나 어쨌든 무언가를 가리키는 것은
    // Java를 배우는 데 있어 피해갈 수 없는 개념이다.

    // -> **** mainactivity
    // Point2D를 복사하려고 했는데 가리키는 값 밖에 복사되지 않아 엉뚱한 객체의 필드가 교체되어 버릴 수도 있기 때문이다.

    // C/ C++ 에서는 자바와 달리 Point2D의 실체를 넣을 수 있는 변수를 직접 선언할 수 있다.

    // C 의 경우... (이하 생략)

    // Java 에는 이와 동일한 의미를 나타내는 "*" 가 없다. Java에 포인터가 없어서가 아니라 클래스형에 관한 한
    // Java에는 포인터밖에 없어 굳이 "*"를 붙이지 않아도 포인터임을 알 수 있기 때문이다.
    // Java에는 변수의 포인터가 없으므로 포인터의 포인터를 선언할 필요가 없기 때문이기도 하다.
    // -- 이하 생략
    // Java -> 라는 연산자가 없어 항상 p.x 라고 쓴다.
    // Java에 포인터가 없어서 -> 가 없는 것이 아니라, 클래스형에 관한 한 Java에는 포인터밖에 없기 때문에
    // 구별할 필요가 없는 것이다. // 즉 Java의 p.x는 C/ C++ p-> x 와 동일한 의미를 갖는다.

    // Java에서 클래스형의 변수는 전부 포인터이다.

    // 지금까지 설명했듯이 Java는 포인터가 없기는 커녕 클래스형에 관한 한 포인터밖에 없는 언어이다.
    // Java에는 포인터가 없다는 속설은 뿌리깊게 존재하고 있는 것이 사실이다.

    // 포인터의 차이점도 있다.

    // 1. 포인터 연산 기능이 없다.
    // 2. 변수의 포인터를 취할 수 없다. (& 연산자가 없다.)
    // 3. 포인터의 캐스트가 제한되어 있다.

    // 참조형, Reference Type -> Class, Interface, Array
    // 자바는 어중간한 객체 지향 언어라고 볼 수 있지만, 그것은 차치하기로 하고 여기서 중요한 것은,
    // Java에서 변수로는 프리미티브 또는 참조만 넣을 수 있다.

    // 대입이나 비교등도 프리미티브 또는 참조를 단위로 할 수 밖에 없다.
    // Java 에는 객체나 배열과 같은 커다란 덩어리를 일괄적으로 취급하는 기능은 존재하지 않는 것이다.
    // Java에서 한꺼번에 취급할 수 잇는 것은 프리미티브와 포인터뿐이다.

    // 보충설명

    // 참조값이 무언가를 가리키기 위한 값이라면, Hoge라는 클래스의 인스턴스를 가리키기 위한 값도,
    // Piyo라는 클래스의 인스턴스를 가리키기 위한 값도 결국 동일한 것 아니냐고 생각하는 사람이 있을지도 모르겠다.
    // 실제로 참조값을 넣는 변수에 형식의 구별이 없는 언어도 있다.
    // 그러나 Java에서 참조형 변수는 그것이 어떤 클래스를 가리키기 위한 변수인지를 확실히 지정하여 선언해야 한다.
    // 이러한 언어를 정적인 형식 부여가 있다고 한다.
    // 정적인 형식 부여가 있느 ㄴ언어는 번거로울 것 같지만, 대규모 프로그램에서 부정한 대입등이 컴파일 에러가 되고
    // 소스 안에 형식이 명시되어 있어 가독성이 향상될 수 있다.
    // 또한 정적인 형식은 필드 참조와 메소드 호출의 효율화에도 기여한다. 1장에서 다음과 같은 메소드의 호출은

    // win.drawLine(x1, x2, y1, y2);

    // 결국 컴파일러가 다음과 같이 바꿔 읽는 것과 같다고 설명했다.

    // drawLine(win, x1, x2, y1, y2);

    // 이 때 호출해야할 메소드를 구분할 수 있는 것은 win 이 정적인 형식을 갖고 있기 때문이다.
    // 그러나 상속이 개입되면 다소 이야기가 복잡해지는데, 그에 관해서는 3장 상속에서 설명하겠다.

    // 지금까지 설명했듯이 Java에서 클래스형 변수는 결국 전부 포인터로, 어떤 객체를 가리키기 위한 값이 들어있다.
    // 그러나 포인터에는 아무것도 가리키지 않는 상태도 있다.
    // null
    // null 은 연결 리스트와 같은 데이터 구조로 가리키는 곳에는 아무것도 없다는 사실을 표현하기 위해 사용한다.

    // Java에서는 포인터를 넣는 변수에 형식의 구별이 있어 가령 Point2D를 가리켜야 할 클래스형 변수에
    // String을 가리키는 포인터(참조값)를 대입하려 하면 컴파일러가 체크를 하지만
    // null 만은 모든 참조형을 상대로 하여 대입 또는 비교할 수 있다.

    // 연결리스트란 다음 요소를 순서대로 가리키는 데이터 구조를 말한다.
    // 배열과 달리 요소수가 처음부터 결정되어 있지 않아 도중의 추가/삭제가 용이하다는 이점이 있다.

    // 보충 생략

    // 중요한 내용만

    // 참조값 (때로는 단순히 참조(reference) 라고도 불린다) 은 이러한 객체의 포인터나 어떤 객체도 참조하지 않는 특수한 참조가 된다.

    // 와 같이 어떤 객체도 참조하지 않는다고 단정하고 있다.

    // == -> 실행시 오퍼랜드의 값이 양쪽 모두 null 이거나 동일한 객체 또는 배열을 참조하고 있는 경우 true, 아니면 false

    private void copyStart() {
        // 2.1.1 객체의 생성에서 보았듯이, 클래스형 변수는 모두 포인터이므로 다음과 같이 변수만 대입하여 복사해도
        // 2개의 포인터가 동일한 객체를 가리키게 될 뿐 객체 자체는 복제되지 않는다.
        // 객체 자체를 복제하고 싶으면 다음과 같이 직접 새로운 객체를 new 하고 내용을 베껴쓴다.

        // 그러나 Point2D를 복사할 때마다 일일이 이렇게 작성해야 한다면 너무 번거로울 것이다.
        // 또한 이처럼 필드를 하나씩 일일이 복사하면 Point2D에 필드를 추가한 경우 여기저기를 고치며 돌아다녀야만 한다.
        // --

        // 객체 지향의 개념 중에 캡슐화가 있다.
        // 캡슐화란 클래스의 내부 정보는 클래스 안에 은폐하고 외부에서는 공개된 인터페이스만 조작하도록 한다는 개념이다.
        // 따라서 객체 지향적으로 생각하면 Point2D를 복사하는 작업은 Point2D 자신에게 시켜야 할 것이다.

        // Point2D를 복제하고 싶은 측에서는 다음과 같이 copy 메소드를 호출하면 된다.

        // Java의 객체에는 처음부터 clone() 이라는 메소드가 준비되어 있다.

        // clone() 은 표준적인 메소드이므로 클래스의 범용성을 높이기 위해서도 clone() 을 사용하는 편이 낫다.
        // 그러나 Java의 clone() 은 매우 사용하기가 어렵기 때문에
        // 필자는 사실 copy() 와 같은 메소드를 애용하고 있다.

        // test 생략

        // 엥? str은 hoge가 아닌가? 쪽이 표시된다.

        // str == "hoge" 라는 비교는 결국 포인터의 비교지 내용의 비교가 아니기 때문이다.

        // 포인터(포인터값)란 객체를 가리키기 위한 값이다. 2개의 포인터 변수가 동일한 객체를 가리키고 있을 때
        // 가리키기 위한 값을 같아진다.
        // 서로 다른 객체를 가리키고 있으면 포인터는 같지 않다.

        // Point2D와 같이 직접 만든 클래스의 경우 equals() 메소드는 필요하다면 직접 기술해야 한다.
        // equals() 메소드느 Object 클래스에 선언되어 있으므로 직접 기술하는 경우 오버라이드하게 된다.

        // String 클래스의 intern() 메소드를 사용하면 프로그램 실행 중에 생성된 문자열을

        // 리터럴 과 마찬가지로 JVMM 의 풀의 관리 영역에 집어넣을 수 있다.

        // intern() 은 풀 안에 동일한 내용의 문자열이 있으면 그 문자열의 포인터를 되돌리므로,
        // intern() 에 의해 얻은 포인터끼리라면 == 로 비교해도 된다.
        // 따라서 단순히 문자열은 equals() 로 비교해야 한다고 기억해도 별 지장은 없을 것이다.

        // 동일한 String 타입을 가진다 하더라고 문자열 리터럴과 객체로 생성된 문자열을 메모리 상에서 다르게 위치하게 된다.

        // 참조형 필드

        // 가령 직선을 표현하는 클래스로 다음과 같은 클래스가 있다고 하자.

        // Java 에서 클래스형은 포인터 밖에 없으므로.

        // Line2D의 의미를 생각하면 Point2D를 2개 포함하는 형태로 표혆나느 편이 자연스러운 것 같지만, 그러기 위해서는
        // Point2D의 포인터가 아니라 Point2D의 실체를 필드로 하는 편이 좋은데, Java에서는 불가능한 일이다.

        // 포인터와 캡슐화

        // 앞에서 설명한 Line2D의 샘플에서는, startPoint, endPoint에 대하여 특별히 private나 public을 지정하지 않았기 때문에
        // 디폴트의 동일한 패키지 안에서 전부 볼 수 있다.

        // Java 에서는 객체의 필드가 다른 객체를 직접 포함할 수 없다.
        // 다른 객체의 포인터를 포함하는 것은 가능하다.

        // 2차원 직선을 표현하는 클래스

        // 시점 좌표, 종점 좌표
        // setStartPoint() 가 호출되지 않는 한 Line2D의 시점 좌표는 절대로 변경되지 않을 것이라고 안심해서는 안된다.
        // --

        // 따라서 getStartPoint() 에서 시점을 표현하는 Point2D의 포인터를 다른 누군가에게 건네주면
        // 좌표 정보에 대한 액세스 제어는 Point2D에 맡겨지게 되어 Line2D와 상관없이 변경이 가능하게 된다.

        // 만일 Point2D()의 x, y 라는 필드가 public으로 되어 있으면, getStartPoint() 에 의해
        // 시점 좌표의 포인터를 입수한 사람은 누구든 Line2D의 시점 좌표를 변경할 수 있게 된다.
        // 필드가 private이라도 public setter가 제공되어 있으면 마찬가지이다.

        // 이러한 사태를 방지하고 싶으면 getStartPoint() 메소드에서 startPoint를 그대로 되돌리지 말고
        // startPoint가 가리키는 곳의 Point2D를 복제하여 되돌려야 한다.
        // 포인터를 되돌리는 getter를 만들면 캡슐화가 파괴될 가능성이 있다.

        // 객체 복사. shallow copy

        // deep copy 다 바꿔버려

        // 2.1.5 객체의 복사에서 Java 의 객체에는 clone() 이라는 메소드가 준비되어 있으므로
        // 범용성을 높이기 위해 그것을 사용하는 편이 낫다고 기술했는데, clone() 에 의한 디폴트의 복사는 shallow copy 이므로
        // deep copy 가 필요하면 직접 기술해야 한다. 그 방법에 관해서는 6.5 에서 설명하겠다.

        // immutable 객체 --> so important

        // 1. 모든 필드를 생성자의 파라미터를 이용하여 초기화 한다.

        // 2. 모든 필드를 private으로 하고, getter 메소드는 써도 setter 메소드는 기술하지 않는다.

        // 이러한 클래스의 객체는 한번 new 하면 다시는 값을 변경할 수 없다.

        // immutable 객체의 경우 객체를 복사하고 싶을 때 참조만 복사하든 실체를 복제하든 마찬가지이다.
        // 참조 관계가 아무리 복잡하게 얽혀 있어도 변경할 수 없으므로 다른 포인터를 경유한 의도하지 않은 변경은
        // 일어날 수 없기 때문이다.

        // 값을 변경하기 위해서는 새로운 객체 생성

        // 객체의 new 처리를 너무 자주 하면 속도가 느려지게 된다. 또한 많은 필드를 가진 큰 객체를
        // immutable로 만들어 버리면 특정 필드만을 변경하고 싶은 경우에도 어쩔수 없이 전체를 new 한 후 값을 복사해야 한다.
        // 게다가 여러 개의 포인터가 가리키고 있는 객체는 전체를 new 한 후 그것을 가리키고 있는 모든 포인터를 갱신해야 한다.

        // 반대로 복사는 자주 하지만, 내용 변경은 하지 않을 때는 immutable 쪽이 유리하다.
        // Point2D와 같은 클래스가 immutable이 아닌 경우 복사할 때 새 객체를 new 하지 않으면

        // 누군가 무심코 변경할지도 모르므로 위험하지만, immutable 인 경우 포인터만 복사하면 된다.

        // immutable 은 용도와 상황에 맞게 활용해야 할 것이다.



    }


}
