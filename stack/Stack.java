package com.mycompany.stack;
import java.util.Scanner;


public class Stack {
    
    
    Node head=null, tail=null, temp=null;
    Scanner sc = new Scanner(System.in);
    

    
    public void insertAtbeginning(int item){
        
        temp= new Node();
        temp.item= item;
        if(head==null) 
            head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
    }
    
    public void insertAtEnd(int item){ 
        
        tail = new Node();
        tail.item= item;
        if(head==null) 
            head=temp=tail;
        else{       
            temp.next=tail;
            temp=tail;
        }
    }


    public void print_list(Node head){
        
        Node search=head;
        while(search!=null){
            
            System.out.print(search.item+" ");
            search=search.next;
        }
        System.out.println();
    }
    
    
    public void reverse(){
        
        head=null; tail=null; temp=null;
        System.out.println("Please, enter how many node(s) you would like to add to a linked list ===>");
        int count=sc.nextInt(); // 3 
        
        for(int i=1; i<=count; i++){ // 3 
            
            System.out.println("Enter the item of node "+i+"====> ");
            insertAtEnd(sc.nextInt());
        }
        
        System.out.println("Before reverse process: ");
        print_list(head);
        System.out.println("\nAfter reverse process: ");
        Node search=head;
        LinkedStack stack = new LinkedStack();
        
        while(search!=tail.next){
            stack.push(search.item);
            search=search.next;
        }
        
        while(!stack.is_Empty()){
            System.out.print(stack.pop()+"-->");
        }
    }
    
    public void sumUpTwoNumbers(Stack list1, Stack list2){
        
        head = null; tail = null; 
        LinkedStack stackOne = new LinkedStack();
        LinkedStack stackTwo = new LinkedStack();
        int sum,carry=0;
        
        Node ptr = list1.head;
        
        while(ptr!=list1.tail.next){
            stackOne.push(ptr.item);
            ptr=ptr.next;
        }
        
        ptr=list2.head;
        
        while(ptr!=list2.tail.next){
            stackTwo.push(ptr.item);
            ptr=ptr.next;
        }
        
        while(!stackOne.is_Empty() && !stackTwo.is_Empty()){
            
            sum=stackOne.pop()+stackTwo.pop()+carry;
            if(sum>9){
                carry=1;
                insertAtbeginning(sum-10);
            }
            else{
                carry=0;
                insertAtbeginning(sum);
            }
        }
        
        while(!stackOne.is_Empty()){
            
            sum=stackOne.pop()+carry;
            if(sum>9){
                carry=1;
                insertAtbeginning(sum-10);
            }
            else{
                carry=0;
                insertAtbeginning(sum);
            }
        }
        
        while(!stackTwo.is_Empty()){
            
            sum=stackTwo.pop()+carry;
            if(sum>9){
                carry=1;
                insertAtbeginning(sum-10);
            }
            else{
                carry=0;
                insertAtbeginning(sum);
            }
        }
        
        if(carry==1)
            insertAtbeginning(carry);
           
        System.out.print("Equals: ");
        print_list(head);
              
    }
 
    
}

