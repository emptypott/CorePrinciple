package com.example.coreprinciple.another2;

public class DaChaWon {

    // 결론부터 말하자면 Java에는 다차원 배열이 없다. 가령 2차원 배열처럼 보이는 것은 배열의 배열이다.

    int[][] hoge = new int[3][5];

    // 2차원 배열이라고 하면 장기판처럼 격자 무늬로 변수가 나열되어 있는 모양을 상상 하는 사람이 많겠지만!

    // Java의 2차원 배열 (비슷한 것)은 그렇게 되어 있지 않다.

    // Java에서 배열형은 포인터이므로 배열의 배열은 배열의 실체의 포인터의 배열이 된다.

    // -- 생략

    // 하나씩 확보해 나가는 방법도 있다.

    public void oneByOne() {
        int [][] hoge;


        hoge = new int[3][];

        for (int i = 0; i < 3; i++) {
            hoge[i] = new int[5];
        }
    }

    // new int[3][] 과 같이 도중에 앞의 요소수를 비워두면 거기서 부터 앞부분이 null 로 되어 있는 배열을 만들 수 있다.
    // 차원식이라 불린다.

    // 요소의 수가 다른 2차원 배열

    // 반복문을 이용하여 배열을 하나씩 확보하든 new int[3][5] 와 같이 쓰든 결과는 마찬가지이다.
    // 즉, new int[3][5] 와 같은 작성 방식은 반복문을 이용하여 배열을 할당하는 방식을 간단히 줄인 기법이라고 할 수 있다.

    // new int[3][5] 로 이차원 배열을 만든 경우에도, 자유롭게 hoge[0] 에 null 을 대입하거나 hoge[1], hoge[2]를
    // 대입할 수 있다는 것이 그 증거이다.

    // 중요 -> 어떤 것도 이 2개를 가리키지 않았으므로 언젠가 가비지 컬렉션의 대상이 될 것이다.

    // 중요2 -> Java 에서 다차원 배열은 배열의 포인터 배열로 실현된다.
}
