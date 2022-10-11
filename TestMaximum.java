package com.bridgelabz;

public class TestMaximum   <T extends Comparable<T>>{
    T a,b,c;

    TestMaximum(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T compareTo() {
        if(a.compareTo(b) > 0){
            if(a.compareTo(c) > 0) {
                return a;
            } else {
                return c;
            }
        } else {
            if(b.compareTo(c) > 0) {
                return b;
            } else {
                return c;
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Test Maximum Generics Program");

        TestMaximum<Integer> integerComparison = new TestMaximum(25,18,38);
        System.out.println("Maximum number from 3 Integer Object : "+integerComparison.compareTo());

        TestMaximum<Float> floatComparison = new TestMaximum(25.0F,18.0F,38.0F);
        System.out.println("Maximum float number from 3 Float Object : "+floatComparison.compareTo());

        TestMaximum<String> stringComparison = new TestMaximum("Nitish","Ullas","Shivam");
        System.out.println("Maximum String from 3 String Object : "+stringComparison.compareTo());
    }
}