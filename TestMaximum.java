package com.bridgelabz;

public class TestMaximum {
    public <T extends Comparable<T>> T compareTo(T a,T b,T c) {
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

        System.out.println("Welcome to Test Maximum Program");
        
        TestMaximum integerComparison = new TestMaximum();
        System.out.println("Maximum number from 3 Integer Object : "+integerComparison.compareTo(25,18,38));
        TestMaximum floatComparison = new TestMaximum();
        System.out.println("Maximum float number from 3 Float Object : "+floatComparison.compareTo(25.0F,18.0F,38.0F));
        TestMaximum stringComparison = new TestMaximum();
        System.out.println("Maximum String from 3 String Object : "+stringComparison.compareTo("Nitish","Ullas","Shivam"));
    }
}