package com.example.coreprinciple.threadstudy;

public class Printer extends Thread {

    String name;
    int interval;

    Printer (String name, int interval) {
        this.name = name;
        this.interval = interval;
    }


//    public static void sleep(long millis) throws InterruptedException {
//        throw new RuntimeException("Stub!");
//    }

    // Thread는 객체와 직교하는 개념이다.
    // 직교하고 있다는 것은 전혀 관계가 없다는 의미이다.

    // exception 이 빨간 줄 뜨는 이유...?

    // 1. 멀티 스레드


    @Override
    public void run() {
        for (;;) {
            // sleep() 의 인수는 밀리세컨드 이므로 1000 배한다.

            try {
                Thread.sleep(interval * 1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
                System.exit(1);
            }

            System.out.println("Printer(" + name + ") printed...");
        }
    }
}