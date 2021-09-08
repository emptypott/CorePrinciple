package com.example.coreprinciple.allowscope;

import android.util.Log;

import java.util.Stack;

public class KeywordAllowScope {


    // 더욱 안좋은 점은 이러한 형태로 상속을 사용한다면, 클래스의 캡슐화를 파괴하게 된다는 것이다.

    // drawSrc 를 구현하거나 drawLine() 을 오버라이드 하기 위해서는 Window
    // 의 내부적인 구현에 어느정도 손을 대야 할지도 모른다.

    // 그러나 Extended Window 의 private 멤버는 볼수 없다. 단 슈퍼 클래스에 멤버를
    // protected 로 지정하면 그 멤버는 서브 클래스에서 참조가 가능해진다고 하는 우회로도 있다.

    // Window 클래스를 만들 때 ExtendedWindow 와 같은 형태로 상속되는 것을 전제로 한다면
    // 원래 private 으로 했어야 하는지도 모르는 많은 필드와 메소드를 protected 로 해야할 것이다.
    //

    // point 클래스를 재이용하기 위해 상속을 사용하면 캡슐화를 파괴를 수반하게 된다.



    public static void main (String[] args ) {
        KeywordAllowScope keywordAllowScope = new KeywordAllowScope();
        keywordAllowScope.buildKeyword();
        Stack stack = new Stack();


    }

    public void buildKeyword () {

        String str = "메소드를 오버라이드 한 경우 클래스를 마음대로 개조해버린 셈이 되므로 어디선가";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("묘한 모순이 발생하게 될지도 모른다.");
        String resultStr = stringBuilder.toString();
        String resultStr2 = resultStr.replaceAll("\\s", "");
        System.out.println(resultStr2);
    }
}
