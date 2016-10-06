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
public class Baitap {

    
    public static void main(String[] args) {
       Baitap linkedList = new Baitap();
       
//add Node at head
       linkedList.addHead(23);
       linkedList.addHead(07);
       linkedList.addHead(05);
       linkedList.addHead(12);
       linkedList.addHead(19);
       
       linkedList.print();
       
//at Node at position
        System.out.println("-------------------------------------");
//        linkedList.addPosition(2, 2);
//        linkedList.addPosition(05,2);
//        linkedList.addPosition(07,2);
//        linkedList.print();

//lay ra phan tu o vi tri bat ky       
        //System.out.println(linkedList.getItem(3));
        
//tim kiem trong danh sach
//        System.out.println("Nhap phan tu de tim kiem: ");
//        Scanner scan = new Scanner(System.in);
//        int key =scan.nextInt();
//        scan.close();
//        System.out.println("Ket qua tim kiem la:" + linkedList.findItem(key));

//delete head
//        linkedList.deleteHead();
//        linkedList.print();

//delete tail of List
//         linkedList.deleteTail();
//         linkedList.print();

//delete node at specify position
//            System.out.println("Nhap vi tri muon xoa: ");
//            Scanner in  = new Scanner(System.in);
//            int pos = in.nextInt();
//            in.close();
//            linkedList.deletePosition(pos);
//            System.out.println("List sau khi xoa phan tu " + pos);
//            linkedList.print();

     
    }
    
    private Node head = null;
    private int mSize = 0;
    
    //add Node at head of List
    public void addHead(int value){
        Node newHeadNode = new Node(value);
        if(head == null){
            head = newHeadNode;
        } else{
            newHeadNode.next = head;
            head = newHeadNode;
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
    
    //add Node at tail of List
    public void addTail(int value){
        Node newTailNode = new Node(value);
        if(head == null){
            head = newTailNode;
        } else{
            Node tailListNode = head;
            while(tailListNode.next != null){
               tailListNode = tailListNode.next; 
            }
            tailListNode.next = newTailNode;
        }  
    }
    
    //delete Tail
    public void deleteTail(){
        
        if(head !=null){
            Node currentNode = head;
            int count = 0;
            while(count < size()-2){
                currentNode = currentNode.next;
                count ++;
            }
            currentNode.next = null;
            mSize--;
        }
    }
    
    //get an item
    public int getItem(int position){
        if(position < 0 || position >= size()){
           throw new IndexOutOfBoundsException("required index " + position + " but actually has " + (size() - 1));
        }
        Node currentNode = head;
        int count = 0;
        while(count < position){
            currentNode = currentNode.next;
            count ++;
        }
        return currentNode.getValue();
    }
    
    //method that add node at specify Position
    public void addPosition(int value, int position){
        Node newNode = new Node(value);
        if(position < 0 || position >= size()){
           throw new IndexOutOfBoundsException("required index " + position + " but actually has " + (size() - 1));
        }
        int count = 0;
        Node currentNode = head;
        while (count < position) {
            currentNode = currentNode.next;
            count++;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        
    }
    
    //delete node at specify position
    public void deletePosition(int position){
        Node currentNode = head;
        int count = 0;
        if(position < 0 || position >= size()){
           throw new IndexOutOfBoundsException("required index " + position + " but actually has " + (size() - 1));
        }
        if(head != null){
            if(position == 0){
                deleteHead();
            }else{
                while(count < position - 1){
                currentNode = currentNode.next;
                count ++;
            }
            currentNode.next = currentNode.next.next;
            }
            mSize--;
        }
    }
    
    //find in List
    public boolean findItem(int value){
        Node currentNode = head;
        while(currentNode != null){
            if(currentNode.getValue() == value){
                return true;
            }
            currentNode = currentNode.next;
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
            System.out.println("The LinkedList is null");
        }else{
            Node linkedListNode = head;
            while(linkedListNode != null){
                System.out.println(linkedListNode.getValue());
                linkedListNode = linkedListNode.next;
            }
        }
    }
}
 class Node{
    private int value;
    protected Node next;
    public Node(int value){
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
    
    public void setValue(int value){
        this.value = value;
    }
}
