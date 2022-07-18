package com.mycompany.stack;

public class ArrayStack {
    private int[] integer;
    private int Top = 0;
    
    public ArrayStack(int cap){ 
        integer = new int[cap]; 
    }
    
    public boolean is_Empty(){
        return Top==0;
    }
    
    public boolean is_Full(){
        return Top==integer.length;
    }
    
    public void push(int item){
        integer[Top++] = item;
    }
    
    public int pop(){
        int item;
        item = integer[--Top];
        integer[Top] = 0;
        return item;
    }
    
    public int currentSize(){
        return Top;
    }
    
}
