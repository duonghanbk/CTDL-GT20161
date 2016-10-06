/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctdl;

import java.util.Scanner;

/**
 *
 * @author HD ♥ HT
 */


public class circularlinkedList {
    
    public static void main(String[] args) {
        circularlinkedList linkedList = new circularlinkedList();
        
        linkedList.addHead(05);
        linkedList.addHead(12);
        linkedList.addHead(19);
        linkedList.addHead(02);
        
        linkedList.print();
        System.out.println("---------------------");
    //add Tail
//        linkedList.addTail(27);
//        System.out.println("addTail 27");
//        linkedList.print();
//        linkedList.addTail(03);
//        System.out.println("addTail 03");
//        linkedList.print();

//delete Head
//          linkedList.deleteHead();
//          System.out.println("delete Head");
//          linkedList.print();
//          linkedList.deleteHead();
//          System.out.println("delete Head");
//          linkedList.print();
          
//delete Tail
//            linkedList.deleteTail();
//            System.out.println("delete Tail");
//            linkedList.print();
//            linkedList.deleteTail();
//            System.out.println("delete Tail");
//            linkedList.print();

//delete position
//              System.out.println("delete at specify position");
//              linkedList.deletePosition(1);
//              System.out.println("delete at position 1");
//              linkedList.print();
//        
//              linkedList.deletePosition(2);
//              System.out.println("delete at specify position 2");
//              linkedList.print();
////find Item
//                System.out.println(linkedList.size());
//                System.out.print("Has 13 in LinkedList: ");
//               if( linkedList.findItem(13))
//               {
//                   System.out.println("yes");
//               }else{
//                   System.out.println("no");
//               }

//get Item
                Scanner in =new Scanner(System.in);
                System.out.print("Enter the position: ");
                int pos = in.nextInt();
                System.out.println();
                System.out.println("Value at this position is " + linkedList.getItem(pos));
                
    }
    
    private Node2 head = null;
    private Node2 tail = null;
    
    
    private int mSize = 0;
    
    //add Node2 at head of List
    public void addHead(int value){
        Node2 newHeadNode2 = new Node2(value);
        if(head == null){
            head = newHeadNode2;
            head.next = head;
            tail = head;
        } else{
            newHeadNode2.next = head;
            head = newHeadNode2;
            tail.next = head;    
        }
        mSize++;
    }
    
    //delete head
    public void deleteHead(){
        if(head != null){
            head = head.next;
            mSize--;
        }
    }
    
    //add Node2 at tail of List
    public void addTail(int value){
        Node2 newTailNode2 = new Node2(value);
        if(head == null){
            head = newTailNode2;
            tail = head;
        } else{
            Node2 tailListNode2 = head;
            while(tailListNode2 != tail){
               tailListNode2 = tailListNode2.next; 
            }
            tailListNode2.next = newTailNode2;
            tail = newTailNode2;
            tail.next = head;
        }  
    }
    
    //delete Tail
    public void deleteTail(){
        
        if(head !=null){
            Node2 currentNode2 = head;
            //int count = 0;
            while(currentNode2.next != tail){
                currentNode2 = currentNode2.next;
                //count ++;
            }
            tail = currentNode2;
            tail.next = head;
            mSize--;
        }
    }
    
    //get an item
    public int getItem(int position){
        if(position < 0 || position >= size()){
           throw new IndexOutOfBoundsException("required index " + position + " but actually has " + (size() - 1));
        }
        Node2 currentNode2 = head;
        int count = 0;
        while(count < position){
            currentNode2 = currentNode2.next;
            count ++;
        }
        return currentNode2.getValue();
    }
    
    //method that add node at specify Position
    public void addPosition(int value, int position){
        Node2 newNode2 = new Node2(value);
        if(position < 0 || position >= size()){
           throw new IndexOutOfBoundsException("required index " + position + " but actually has " + (size() - 1));
        }
        int count = 0;
        Node2 currentNode2 = head;
        while (count < position) {
            currentNode2 = currentNode2.next;
            count++;
        }
        newNode2.next = currentNode2.next;
        currentNode2.next = newNode2;
        
    }
    
    //delete node at specify position
    public void deletePosition(int position){
        Node2 currentNode2 = head;
        int count = 0;
        if(position < 0 || position >= size()){
           throw new IndexOutOfBoundsException("required index " + position + " but actually has " + (size() - 1));
        }
        if(head != null){
            if(position == 0){
                deleteHead();
            }else{
                if(position == size() - 1){
                    deleteTail();
            }else{
                    while(count < position - 1){
                currentNode2 = currentNode2.next;
                count ++;
                }
                mSize--;
                currentNode2.next = currentNode2.next.next;
             }
            }
            
            
            }
            
        
    }
    
    //find in List
    public boolean findItem(int value){
        Node2 currentNode2 = head;
        int count = 0;
        while(count < size() - 1){
            if(currentNode2.getValue() == value){
                return true;
            }
            currentNode2 = currentNode2.next;
            count++;
        }
        return false;
    }
    
    //method return size of List
    public int size(){
        return mSize;
    }
    
    //display linkedList
    
    public void print(){
        if(head == null){
            System.out.println("The LinkedList is null!");
        }else{
            Node2 linkedListNode2 = head;
            while(linkedListNode2 != tail){
                System.out.println(linkedListNode2.getValue());
                linkedListNode2 = linkedListNode2.next;
            }
            System.out.println(linkedListNode2.getValue());
        }
    } 
}

 class Node2{
    private int value;
    protected Node2 next;
    public Node2(int value){
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
    
    public void setValue(int value){
        this.value = value;
    }
 }
