package com.example.coreprinciple.nowinheritence;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.InputQueue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.security.interfaces.DSAPrivateKey;

public class TwoMoreInter {

    Context mContext;

    public TwoMoreInter(Context context) {
        mContext = context;
    }

    // Java 에서 각 클래스의 슈퍼 클래스는 하나밖에 허용되지 않는다.
    // 말하자면, extends 의 뒤에 클래스 이름은 하나밖에 쓸 수 없지만, 인터페이스에서는
    // implements 뒤에 여러 개의 인터페이스를 콤마로 구분하여 나열하면 하나의 클래스가
    // 여러개의 인터페이스를 상속 받아 구현할 수 있다.

    // 화면에 도형을 그리는 것

    // X-draw 와 같은 어플리케이션을 만들려면 화면의 마우스의 움직임을 파악할 수 있어야 한다.

    // 이러한 마우스의 움직임이나 단추를 눌렀을 때의 이벤트를 JDK1.1 이후 java에서는 전송 이벤트 모델에 따라 취급한다.

    // 가령 Button 클래스의 경우 단추를 눌렀을 때 어떤 처리를 실행할 필요가 있다면 처리를 샐행해 주는 객체를

    // addActionListener() 메소드

    public void addActionPlease() {

        // 이 때 처리를 실행해 주는 객체는 ActionListener 인터페이스를 구현하고 있어야 한다.
        // Button 단추를 눌렀을 때 ActionListener -> actionPerformed() 메소드를 호출하기 때문이다.

        Button button = new Button(mContext);
        button.setOnClickListener(v -> {

        });

//        DSAPrivateKey
        // interface 가 2개를 extends 하고 있다.

        // 이해가 쉽게 잘 안되는 부분

        // X-Draw를 AWT 를 사용하여 구현하는 경우 그리기 영역에는 Canvas 클래스를 사용한다.
        // Canvas 클래스는 Canvas 위에서 마우스의 단추를 눌렀을 때 MouseListener 인터페이스의
        // mousePressed() 메소드를 호출한다.
        // 그러면 Window 클래스는 MouseListener 인터페이스를 구현하여 Canvas 에서의 이벤트를
        // 통지 받도록 해야할 것이다.
        // Window 는 어플리케이션 프로그램에 대하여 double 에 의한 논리 좌표계를 제공하므로
        // 픽셀 단위의 int 좌표계와의 상호 호환 기능은 Window 클래스 안에 캡슐화해야 하기 때문이다.

        // 이 때, Window는 Canbvas에 대해서는 MouseListener 인터페이스, Shape 를 그리는
        // 클래스에 대해서는 Drawable 인터페이스를 각각 제공하게 된다

        // 이 경우 Window 클래스는 인터페이스를 다중 상속하고 있다고 한다.
        // 그런데 Java 에는 별도로 인터페이스의 상속이 존재하고 있기 때문에 이야기가 복잡해지는데, 그에 관해서는 다음
        // Supplement 에서 설명하겠다.

    }
}
