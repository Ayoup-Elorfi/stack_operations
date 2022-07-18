package com.mycompany.stack;

public class LinkedStack {
    
    int currentSize;
    Node first = null;
    Node oldfirst = first;
    
    
    public boolean is_Empty(){ 
        return first == null;
    }
    
    public void push(int item){
        oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        currentSize++; // 3
    }
    
    public int pop(){
        if(!is_Empty()){
            int item = first.item;
            first = first.next;
            currentSize--;
            return item;
        } 
        else 
            return -1;     
    }
   
    public int currentSize(){
        return currentSize;
    }
    
}
   
