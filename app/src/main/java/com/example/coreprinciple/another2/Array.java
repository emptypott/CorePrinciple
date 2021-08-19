package com.example.coreprinciple.another2;

public class Array {

    public void letsArrayLook() {

        int[] array1;
        int[] array2;

        array1 = new int[10];
        array2 = array1;

        // array2의 각 요소에 값을 설정
        for (int i=0; i < 10; i++) {
            array2[i] = i;
        }

        // array1의 내용을 표시한다.
        for (int i=0; i < 10; i++) {
            System.out.println("array1[" + i + "].." + array1[i]);
        }
    }
}
