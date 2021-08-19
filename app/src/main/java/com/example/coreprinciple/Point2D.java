package com.example.coreprinciple;

public class Point2D {
    // 다음에는 Java의 클래스형의 경우에 관하여 생각해 보자.
    // 앞장에서 다룬 X-draw와 같은 프로그램에서는 List 2.1의 Point2D와 같이 2차원 좌표 값을 나타내는 클래스가 필요하다.
    // Point2D 에는 double 형의 값을 2개 넣을 수 있으므로, 그림으로 표현하면 --
    // double 형의 값이 들어가는 상자 2개를 내장할 수 있는 형식이 되는 것이다.
    public double x;
    public double y;

    Point2D copy() {
        Point2D newPoint = new Point2D();

        newPoint.x = this.x;
        newPoint.y = this.y;

        return newPoint;
    }


}
