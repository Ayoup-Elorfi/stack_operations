package com.mycompany.stack;
import java.util.Scanner;


public class Main {
    
        public static void optionList(){
            System.out.println("\n\n\n");
            System.out.println("1: Push an item in arrayStack");
            System.out.println("2: Pop an item from arrayStack");
            System.out.println("3: Push an item in linkedStack");
            System.out.println("4: Pop an item from linkedStack");
            System.out.println("5: print the contents of a linked list reversely using stack");
            System.out.println("6: Sum up two numbers represented by two linked lists using stack");
            System.out.println("7: Exit\n");
        }
    
        public static void main(String a[]){
            boolean bool=true;
            int choose;
            LinkedStack stack = new LinkedStack();
            ArrayStack arrayStack = new ArrayStack(5);
            Stack mainStack = new Stack();
            Stack stackOne = new Stack();
            Stack stackTwo = new Stack();
            Scanner sc = new Scanner(System.in);
            int item,n;
            int counter=0;
 
            while(bool){
                
                optionList();
                System.out.println("Enter your choose =======>");
                choose=sc.nextInt();
                
                switch(choose){
                    case 1:
                        if(arrayStack.is_Full()) 
                            System.out.println("Stack is full!");
                        else{
                            System.out.println("Enter the number of nodes you would like to push into the stack ====> ");
                            n=sc.nextInt();

                            for(int i=1; i<=n; i++){
                                if(arrayStack.is_Full()) 
                                    System.out.println("Stack is full!");
                                else{
                                    System.out.println("Enter the item of node "+i+"====> ");
                                    item = sc.nextInt();
                                    arrayStack.push(item);
                                }
                            }
                        }
                        break;
                    
                    case 2: 
                        if(arrayStack.is_Empty()) 
                            System.out.println("Stack is empty!");
                        else{
                            System.out.println("Enter the number of nodes you would like to remove from the stack ====> ");
                            n=sc.nextInt();
                            
                            for(int i=1; i<=n; i++){
                                if(arrayStack.is_Empty()) 
                                    System.out.println("Stack is empty!");
                                else{
                                    item = arrayStack.pop();
                                    System.out.println(item);
                                }
                            }
                        }
                        break;
                    
                    case 3:
                        
                        System.out.println("Enter the number of nodes you would like to push into the stack ====> ");
                        n=sc.nextInt();
                        
                        for(int i=1; i<=n; i++){
                            System.out.println("Enter the item of node "+i+"====> ");
                            item = sc.nextInt();
                            stack.push(item);
                        }
                        break;
                    
                    case 4: 
                        if(stack.is_Empty()) 
                            System.out.println("Stack is empty!");
                        
                        else{   
                            System.out.println("Enter the number of nodes you would like to remove from the stack ====> ");
                            n=sc.nextInt();
                            
                            for(int i=1; i<=n; i++){
                                item = stack.pop();
                                if(item==-1) 
                                    System.out.println("Stack is empty!");
                                else
                                    System.out.println(item);
                            }
                        }
                        break;
                    
                    case 5: 
                        mainStack.reverse();
                        break;
                        
                    case 6: 
                        stackOne.head=null; 
                        stackTwo.head=null;
                        System.out.println("Please, enter how many node(s) you would like to add to linked list one ===>");
                        int count=sc.nextInt();
                        
                        for(int i=1; i<=count; i++){
                            System.out.println("Enter the item of node "+i+"====> ");
                            stackOne.insertAtEnd(sc.nextInt());
                        }
                        
                        System.out.println("Please, enter how many node(s) you would like to add to linked list tow ===>");
                        count=sc.nextInt();
                        
                        for(int i=1; i<=count; i++){
                            System.out.println("Enter the item of node "+i+"====> ");
                            stackTwo.insertAtEnd(sc.nextInt());
                        }
                        
                        mainStack.sumUpTwoNumbers(stackOne, stackTwo);
                        break;
                        
                    case 7: 
                        bool=false;
                        break;
                        
                    default: 
                        System.out.println("input error!!");
                }
                
            }
        }
}
