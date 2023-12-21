package com.example;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class BigDecimalTest {
    @Test
    public void test() {
        BigDecimal bigDecimal = new BigDecimal(10);

        int compare = bigDecimal.compareTo(new BigDecimal(10));

        if(compare == 0) {
            System.out.println("ddd");
        }
    }
}
