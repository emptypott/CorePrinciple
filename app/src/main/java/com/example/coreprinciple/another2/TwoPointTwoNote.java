package com.example.coreprinciple.another2;

import com.example.coreprinciple.Point2D;

public class TwoPointTwoNote {

    // Java에서 객체는 모두 포인터를 경유하여 취급할 수 밖에 없다.
    // 또한 Java에서는 배열도 객체이다.
    // 따라서 Java에서는 배열도 포인터를 경유하여 취급할 수 밖에 없다.

    // 프리미티브형 배열
    // 우선 프리미티브형 배열에 관하여 살펴보자.

    // 가령 int 형 배열을 사용하고 싶을 때 Java 에서는 다음과 같이 배열형 변수를 선언한다.

    // make jeongsu public!
    public void jeongsu() {
        int[] hoge;
        // [] 안에 요소 수가 없는 이유는 클래스형 변수가 포인터였듯이 배열형 변수 역시 포인터이기 때문이다.
        // 실제로 배열로 사용할 수 있는 영역을 확보하기 위해서는 new 로 배열을 생성하여 포인터로 그곳을 향하게 해야한다.
        // 배열의 요소 수는 이 시점에 결정한다.

        hoge = new int[10];

        // int[] hoge; 라는 선언에 의해 준비된 "상자"
        // new int[] 에 의해 확보된 배열
        // 이 하나 하나가 int 형 값을 넣을 수 있는 "상자"

        // 1행에 한꺼번에 쓸 수도 있다.

        int[] hoge2 = new int[10];

    }

    public void classTypeArray() {
        // 가령 드로우 도구에서 폴리라인(꺾은 선) 을 표현하기 위해서는 점의 배열이 필요하다.

        // 이미 Point2D를 점(좌표)을 표현하는 클래스로 만들어 두었으므로 이것을 배열로 하면 될 것이다.

        // 다음과 같이 Point2D의 배열을 확보하고

        Point2D[] polyLine = new Point2D[10];

        // 다음과 같이 0번째 요소의 x 좌표, y 좌표를 설정하려 하면
        // -- 중간 생략

        // 이 선언에서 확보되는 것은 Point2D 의 포인터의 배열이지 Point2D의 실체의 배열이 아니기 때문이다.

        // -- 중간 생략

        // 따라서 다음과 같은 프로그램을 작성해야 한다
        for (int i = 0; i < 10; i++) {
            polyLine[i] = new Point2D();
        }

        // 중요한 문구 -> 그러나 Java 에서는 그러한 객체의 실체의 배열을 만들 수 없다.
        // Java에서 클래스형은 항상 포인터이기 때문이다.

        // 중요한 문구2 -> Java에서 객체의 배열은 객체의 포인터의 배열이 된다.

        // 다차원 배열


    }
}
