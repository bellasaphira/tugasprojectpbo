package com.company;
import java.util.Scanner;

public class Trapesium implements Operasi {

    int sisipanjang;
    int sisipendek;
    int t;
    int sisimiring1;
    int sisimiring2;

    @Override
    public float luas() {
        return ((sisipanjang + sisipendek)*t/2);
    }

    @Override
    public float keliling() {
        return (sisipanjang + sisipendek + sisimiring1 + sisimiring2);
    }
}

