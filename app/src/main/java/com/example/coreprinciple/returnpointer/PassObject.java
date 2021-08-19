package com.example.coreprinciple.returnpointer;

import com.example.coreprinciple.Point2D;

public class PassObject {

    public static void sub(Point2D subP) {
        subP = null;
    }
}
