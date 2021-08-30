package com.example.coreprinciple.nowinheritence;

public class Inheritance {

    // 상속은 객체 지향의 기본적인 개념 중 하나이다.

    // 물론 Java 에도 상속은 있다. 대부분의 정의에 의하면 상속이 없는 언어는 객체 지향 언어라고 인정되지 않는다.

    // 최근 들어 클래스의 상속이라는 종류의 상속은 완전히 악당 취급을 받고 있는 것 같은데, 잘만 활용하면 편리한 점이 많다.

    // 여기서는 상속의 기본에 대하여 설명하겠다.

    // 드로우 도구의 데이터 모델

    // 이 중 직선은 구성하는 점이 2개밖에 없는 폴리라인으로 취급할 수 있으므로 클래스로 만들어야 한느 것은
    // 폴리라인, 원, 직사각형 3가지가 된다.

    // 어떤 데이터를 유지해야 하는지 생각해보자.

    // 우선 모든 도형에 공통적인 데이터로는 다음과 같은 것이 있다.

    // 색, 선 종류 (실선, 파선 등)

    // 각 도형의 고유 데이터는 다음과 같다.

    // 폴리라인, 좌표의 배열
    // 원, 중심의 좌표, 반지름
    // 왼쪽 위 좌표, 오른쪽 아래 좌표

    // 이것을 그림으로 나타내면

    // 폴리라인만 취급하는 드로우 도구라면 이렇게 해도 되겠지만, 대량의 도형을 관리하기 위해
    // 우선은 배열을 사용하기로 하자. 실제로는 이러한 경우 연결 리스트 등을 사용하는 경우가 많다.
    // 취급하는 도형이 폴리라인 뿐이라면, 다음과 같이 폴리라인의 배열을 준비하면 된다.

//    Polyline[] polyline;

    // 세개의 배열을 준비하면 어떨까?

    // 이것으로 대충 만족할지도 모르지만, 가령 모든 도형을 다시 그릴 대는 어떻게 해야할까?

    // 처음에는 모든 폴리라인을 그리고, 다음에는 모든 원을 그리고... 이런식으로 그려야 할까?

    // 1행의 extends Shape 는 Polyine 이 Shape 를 상속한 클래스 임을 의미한다.

    // 이 때 Shape 를 Polyline 의 superclass Polyline은 Shape의 서브 클래스 라고 한다.
    // 이 호칭은 언어에 따라 다른데, 슈퍼 클래스를 부모 클래스, 서브 클래스를 자식 클래스라고 부르는 언어도 있고.
    // C++ 에서는 각각을 기저 클래스, 파생 클래스라고 부른다.

    // Java 의 경우 슈퍼 클래스와 서브 클래스가 언어 사양에 정의된 올바른 용어지만,

}