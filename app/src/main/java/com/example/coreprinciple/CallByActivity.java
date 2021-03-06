package com.example.coreprinciple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.coreprinciple.nowinheritence.TwoMoreInter;
import com.example.coreprinciple.returnpointer.PassObject;

public class CallByActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_by);

        // 2.3 파라미터(인수) 건네주기

        // C 등의 다른 프로그래밍 언어를 어느정도 알고 있는 사람이라면 이 말만 들어도 모든 것을 이해할 수 있을텐데,
        // Java의 파라미터는 항상 값 건네주기 이다. (Call by Value) 이다. 즉, C와 똑같다.

        // Java 프로그램을 어느 정도 만들 줄 아는 사람이라도 파라미터 건네주기에 대해서는 오해하고 있는 부분이
        // 적지 않은 듯한데, 여기서는 그것을 정리해 보도록 하겠다.

        // 값 건네주기 (Call by value)


        // 콜바이밸류란 파라미터를 건네줄 때, 실인수 값만을 가인수에 건네주는 방법을 말한다.
        // 이 경우 가인수는 처음부터 값이 설정된 변수와 같이 사용할 수 있다.

        // **** -> 포인터를 되돌린다.

        // 앞에서는 int 라는 프리미티브형을 파라미터로 건네주는 경우를 생각했다. 여기서는 클래스나 배열등의 포인터를 건네주는
        // 경우를 살펴보자.
        // 결론부터 말하자면 포인터를 건네주는 경우도 프리미티브를 건네주는 경우와 똑같다. 즉 포인터를 값 건네주기 하는 것이다.

        // -- 중간 생략

        // 이것을 보면 onCreate 측에서 설정한 p.x, p.y 의 값이 p를 파라미터로 sub() 를 호출함으로써 변경되어 버렸다.
        // 그러나 이것 때문에, 뭐야 프리미티브형 때와는 움직임이 다르잖아 라고 오해해서는 안된다.

        // 객체를 파라미터로 건네줄 때 클래스형 변수라는 것은 결국 전부 포인터이므로 포인터를 값 건네주기 하게 된다.
        // 따라서 sub() 측에서 아무리 노력해도 main() 측의 p의 값을 변경할 수는 없다.
        // 그러나 p가 가리키는 객체의 값은 사정이 다르다.
        // 포인터는 값 건네주기이므로 p와 subP는 다른 변수지만, 그것이 가리키는 곳에 있는 객체는 공통된 것이므로
        // sub() 측의 변경 내용을 main 측에서 볼 수 있는 것이다.

        Point2D jP = new Point2D();
        jP.x = 10;
        jP.y = 10;

        PassObject.sub(jP);
        System.out.println("jP.x : " + jP.x);
        System.out.println("jP y : "  + jP.y);

        // Java에서는 swap() 을 만들 수 없다.
        // 메소드에서 여러 개의 값을 결과로 반환하고 싶을 때.

        // 역자주 2개 베껴쓰기

        // Java 에서는 앞에서 보았듯이 호출하는 측과 호출되는 측이 변수를 공유하지 않는다.
        // 그래서 Java 는 call by value만 사용할 수 있다고 하는데, 일부 책에서는 call by reference 도 가능하다고
        // 설명되어 있는 경우도 있다. 이는 객체의 포인터는 변경하지 못해도 포인터가 가리키는 값은 변경할 수 있기 때문에 나온 말이며
        // C, C++ 에서 말하는 call by reference 와는 다른의미이다.

        // Java에서도 위에서의 call by reference가 여전히 존재한다. 앞에서 설명한 클래스에 대한 인수를 넘겨주는 방식이
        // call by value 라고 하는데 그 값이 바로 해당 객체의 reference 가 되기 때문에 어떤 의미에서는 call by reference
        // 가 되고 만다.

        // 위의 double 값을 여러개 반환하는 경우에는 예를 들기 어렵지만 클래스 타입의 값을 여러개 반환하는 메소드의 경우
        // call by reference의 특징을 이용하면 위와 같이 불필요한 배열을 생성할 필요는 없다.

        // 위의 예제에서도 프리미티브 데이터 타입인 double 대신 클래스인 Double 을 사용하여 구현할 수 있지만,
        // Double 클래스의 경우 immutable 클래스 이기 때문에 메소드에서 파라미터로 받은 Double 객체의 값을 변경할
        // 수 없기 때문에 구현하기 어렵지만 값의 변경이 가능한 경우 call by reference 의 특징을 이용하여 다음과 같이 구현할 수 있다.


        TwoMoreInter twoMoreInter = new TwoMoreInter(this);
    }

    // Java 의 메모리 모델

    // 어플리케이션 프로그램을 만들 때는 메모리나 어드레스와 같은 낮은 수준 (보다 하드웨어에 가까운) 이라는 의미
    // 낮은수준의 사항을 너무 의식해서는 안된다.
    // 그런 것을 의식하지 않는 언어일수록 고급 언어이며, 어쨌든 Java도 그러한 고급언어에 속한다고 할 수 있다.
    // 그러나 Java를 확실히 이해하려면 Java 의 메모리 사용법을 어느정도 숙지하고 있는 편이 유리할 것이다.

    // Stack, Static, Heap

    // Java Stack
    // 스택이란 일반적으로 무언가를 쌓아올려 가는 데이터 구조를 가리킨다. Java 스택은 프레임을 쌓아올려 가는 곳이다.
    // 프레임은 메소드를 호출할 때마다 하나씩 확보된다.
    // 프레임 안에는 로컬 변수의 영역과 오퍼랜드 스택이 확보된다. 오퍼랜드 스택은 계산 중의 값 등을 잠시 쌓아두는 곳이다.
    // 로컬 변수의 영역이 프레임 안에 있다는 것은 다음과 같은 것을 의미한다.

    // 메소드를 빠져나오면 로컬 변수의 영역은 해방된다.
    // 재귀 호출이 가능해진다.

    // Java 스택은 thread 별로 독립되어 있다.

    // static 필드용 영역
    // static 필드용 영역 (이 책의 조어? 다음 페이지의 주의 참조) 에는 각 클래스의 static 필드가 확보된다.
    // Java에서 클래스는 일반적으로 dynamic linking
    // 즉, Java의 클래스 파일은 처음에 한꺼번에 메모리에 읽혀지는 것이 아니라, 그것이 필요해졌을 때 읽혀지고 링크되는 것이다.

    // 링크된다는 의미는 클래스가 메모리에 로딩될 때 특정 메모리 번지에 로딩되는데 이 메모리 번지는 로딩될 때마다 다른 번지수에
    // 로딩되게 된다.

    // C++ 에서는 객체의 실체를 취급할 수 있으므로 당연히 객체를 대입할 수도 있다.

    // 기본적으로 객체의 대입은 단순히 h2 메모리 이미지를 그대로 h1 으로 옮긴다는 것을 의미한다.

    // 이것은 Java의 디폴트 clone() 메소드와 같은 shallow copy 이므로 hoge 가 안에 포인터를 포함하고 있는 경우
    // 문제가 발생하게 된다.

    // Java에서는 이럴 때 clone() 메소드를 오버라이드 하지만 6.5 클론과 clonable을 참조.

    // c++ 에서는 "=" 연산자를 오버로드 한다.

    // 이 책은 c++ 에 관한 책이 아니므로 구체적인 방법은 설명하지 않겠지만, 그것도 나름대로 타당한 방법이라고 할수 있다.


}