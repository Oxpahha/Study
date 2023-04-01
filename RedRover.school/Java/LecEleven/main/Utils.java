package org.redrover;


public final class Utils {

    public static String abbr(String text,int n){
        return text.substring(0, n-3 )+ "...";
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b , int c){
        return a+b+c;
    }

    public static void printSum(int a, int b){
        int s = a+b;
        System.out.println("sum= " + s);
    }

    void div (int a, int b){
        double divis = (double)a / b;
        System.out.println("Div = "+divis);
    }
}
