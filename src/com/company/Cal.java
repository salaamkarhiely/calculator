package com.company;

public class Cal {
    public int add (int x , int y) {
        return x+y;
    }
    public int sub (int x,int y){
        return x-y;
    }
    public int mul(int x,int y){
        return x*y;
    }
    public float div(int x, int y){
        try{
            float t = x/y;
            return t;
        }catch(Exception e){
            System.out.print("error");
            return -31123;
        }
    }
}
