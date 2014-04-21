package com.thoughtworks.factorial;

public class Factorial {
    public Integer compute(int i) throws IllegalArgumentException{
        if (i < 0) {
            throw new IllegalArgumentException();
        } if (i == 1 || i == 0){
            return 1;
        }
        int factorial_var = 1;
        for ( int num = 1; num <= i; num++){
            factorial_var =num * factorial_var;
        }
        return factorial_var;
    }
}

// 3 => 3X2X1
// 5 => 5x4x3x2x1