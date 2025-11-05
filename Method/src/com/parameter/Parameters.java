package com.parameter;

public class Parameters {
    public static void returnSum(float x, float y, int count) {
        float sum = x + y;
        for (int counter = 0; counter < count; counter++)
            System.out.println(sum);
    }
}
