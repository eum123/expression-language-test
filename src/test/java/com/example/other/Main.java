package com.example.other;

import org.junit.jupiter.api.Test;

import static java.lang.System.exit;
import static java.lang.System.in;

public class Main {
    @Test
    public void main() {
        invoke(1);
        invoke(2);
        invoke(3);

        System.out.println("end");
    }

    private void invoke(int a) {
        System.out.println(a);
        if(a == 1) {
            check(a);
        }

        if(a == 2) {
            check(a);
        }

        if(a == 3) {
            check(a);
        }
    }

    private void check(int a) {
        if(a == 2) {
            throw new RuntimeException("stop");
        }

    }
}
