package com.example.coreprinciple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.coreprinciple.another2.TwoPointTwoNote;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 이것은 int 형 변수 hoge를 선언하고 거기에 10을 대입하는 조작이다.
        int hoge;
        hoge = 10;
        // 프로그래밍 입문서 등에서는 일반적으로 변수란 값을 넣는 상자와 같은 것이라고 설명하고 있다.
        // --

        // -- Point2D class 작성
        // 그러면 Point2D 형식의 변수를

        Point2D point2D;

        // 와 같이 선언하면 어떤 일이 일어날까?
        // 변수의 선언 자체는 int hoge; 와 비슷하다.
        // --
        // Point2D의 경우 위의 선언만으로는 Point2D(double 형 2개분) 를 넣을수 있는 상자가 준비되지 않는다.
        // 여기서 준비되는 것은 어디까지나 Point2D를 "가리키기 위한 값" 을 넣을 수 있는 상자이다.
        // 가리키기 위한 값 이란 즉 포인터이다.
        // 그러나 Java 의 경우 포인터라고 하지 않고 참조라고 부른다.

        // Point2D를 넣을 수 있는 상자를 준비하려면 다음과 같이 객체를 new 생성 해줄 필요가 있다.

        Point2D point2DSecond;
        point2DSecond = new Point2D();

        // new는 Point2D의 객체를 새로 생성하고 그 참조값을 되돌린다. 그리고 그것을 point2DSecond에 대입하는 것이다.

        // 이처럼 객체의 실체를 확보해야 비로소
        point2DSecond.x = 10;
        point2DSecond.y = 20;
        // 사용할 수 있게 되는 것이다. 이 마침표를 -> 로 바꿔 읽기 바란다.

        // Java에서는 클래스형 변수의 선언과 객체의 new를 1행에 작성하는 경우가 많다.

        // 이러한 작성 방식을 기억해두면 point2DSecond가 Point2D를 가리키기 위한 값을 넣는 상자든
        // Point2D 그 자체이든 상관없다고 여길지도 모른다.
        // 그러나 둘 사이에는 결정적인 차이점이 있다.
        // 다음과 같은 변수를 복사하면 그 차이점이 뚜렷해진다.

        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D();
        p1.x = 10.0;
        p1.y = 20.0;

        p2 = p1; // 여기서 변수를 복사

        p1.x = 15.0;
        System.out.println("p2.x.." + p2.x);

        // 소스에서는 p2 필드만 변경되어 있는 것처럼 보이는데, 실제로는 p2가 가리키는 곳의 내용도 변경되어 버렸다.
        // 이것은 p1과 p2가 동일한 것을 가리키고 있기 때문이다.
        // 이것은 매우 무서운 일이다. 2.1.10 immutable 객체에서 다시 하겠다.

        // 중요한 문구
        // 어떤 것도 이쪽의 Point2D를 가리키고 있지 않다.

        // 가리키기 위한 값이라는 말에 구체성이 없어 이해하기가 어려울지도 모르겠다.
        // C / C++ 에서는 포인터의 값이라고 하면 대부분의 실행환경에서
        // 어드레스 -> 메모리의 주소값
        // 어드레스를 의미한다. (C의 규격에 직접적인 규격이 있는 것은 아니다.)
        // Java의 경우 포인터값(참조값)은 어드레스일 수도 있고 그렇지 않을 수도 있다.
        // Sun 의 실행환경 (JVM)에서는 전에는 객체 핸들 이라는 것을 사용했으나,
        // JDK 1.3에서 도입된 HotSpot에서는 어드레스를 직접 사용하게 되었다.

        // 이때 구체적인 구현 수단은 신경 쓸 필요가 없으며 중요한 것은

        // Point2D point2d; 와 같은 선언으로 얻을 수 있는 것은 Point2D를 가리키기 위한 값을 넣는 상자이지
        // Point2D를 넣을 수 있는 상자는 아니다.

        // 는 점이다.

        // 이것을 의식하지 않고 Java의 프로그램을 만드는 것은 매우 위험한 일이다.
        // ****-> SecondChapterNote로 이동

        Line2D line = new Line2D();

        // 처음에는 null 로 초기화 되어 있다.

        TwoPointTwoNote twoPointTwoNote = new TwoPointTwoNote();

        // jeongsu is not public --> default.
        twoPointTwoNote.jeongsu();

    }
}