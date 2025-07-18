package org.example;

public class Calculator {
    //addition
    public int sum(int a, int b){
        return a+b;
    }

    public long sum(long a, long b){
        return a+b;
    }

    public short sum(short a, short b){
        return (short) (a+b);
    }

    public float sum(float a, float b){
        return a+b;
    }
    public double sum(double a, double b){
        return a+b;
    }

    //difference

    public int difference(int a, int b ){

        return a-b;
    }
    public long difference(long a, long b){
        return a-b;
    }
    public short difference(short a, short b){
        return (short)(a-b);
    }
    public float difference(float a, float b){
        return a-b;
    }
    public double difference(double a, double b){
        return a-b;
    }


    //multiplication
    public int prod(int a, int b){
        return a*b;
    }

    public long prod(long a, long b){
        return a*b;
    }

    public short prod(short a, short b){
        return (short)(a*b);
    }

    public float prod(float a, float b){
        return a*b;
    }

    public double prod(double a, double b){
        return a*b;
    }

    //division
    public int div(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        return a/b;
    }
    public float div(float a, float b){
        if (b == 0){
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        return a/b;
    }
    public long div(long a, long b){
        if (b == 0){
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        return a/b;
    }
    public short div(short a, short b){
        if (b == 0){
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        return (short)(a/b);
    }
    public double div(double a, double b){
        if (b == 0){
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        return a/b;
    }



}
