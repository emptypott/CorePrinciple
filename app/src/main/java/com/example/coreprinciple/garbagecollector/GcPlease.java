package com.example.coreprinciple.garbagecollector;

public class GcPlease {

    // 덕분에 프로그래머는 객체를 마음껏 new 하며 그 후의 메모리 해방은 가비지 컬렉터에 일임할 수 있게 되었다.
    // 따라서 Java 에는 C의 free() 나, C++ 의 delete 가 존재하지 않는다. 직접 메모리를 해방하지 않아도 되므로
    // 프로그래머의 입장에서 보면 매우 편리한 기능이다.

    // 가비지 컬렉터는 불필요해진 객체의 메모리 영역을 자유롭게 해방할 수 있는데, 이 때 "불필요해진 객체" 는 어떻게 정의해야 할까?
    // 객체가 불필요해졌는지 여부는 그 프로그램을 만들고 있는 프로그래머만이 알 수 있는 것 아닌가?

    // 이 부분을 확실히 이해해야만 안심하고 Java 를 구사할 수 있겠다는 사람들을 위해 여기서 가비지 컬렉터의 동작 원리를 설명하겠다.

    // 우선 객체가 불필요해졌는가 여부의 판단 기준은 스택 또는 static 필드에서 포인터를 따라잡을 수 있는가 여부에 달려있다.

    // 스택이나 static 필드에서 따라잡을 수 없는 객체는 참조할 수 없으므로 확실히 불필요한 객체라고 할 수 있다.

    // 그러나 그 반대가 반드시 참이라고도 할 수 없다. 가령 static 필드에 거대한 데이터 구조를 구축했지만 앞으로 사용하지 않는 경우 그 데이터 구조는
    // 따라 잡을 수 있으므로 가비지 컬렉션의 대상이 되지 않는다.

    // 이 책은 다 봐야겠다는 생각이 들었다.

}
