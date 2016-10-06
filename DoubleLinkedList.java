/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctdl;

/**
 *
 * @author HD ♥ HT
 */
public class DoubleLinkedList {
    
    public static void main(String[] args) {
        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.addHead(05);
        linkedList.addHead(12);
        linkedList.addHead(27);
        linkedList.addHead(03);
        linkedList.addHead(19);
        
//print
        linkedList.print();
        System.out.println("-------------------");
        
        
//delete Head Node        
//        linkedList.deleteHead();
//        linkedList.print();

//delete tail Node        
        linkedList.deleteTail();
        linkedList.print();
                
    }
    
    
    private Node3 head = null;
    private int mSize = 0;
    
    //add Node3 at head of List
    public void addHead(int value){
        Node3 newHeadNode3 = new Node3(value);
        if(head == null){
            head = newHeadNode3;
        } else{
            newHeadNode3.next = head;
            head.prev = newHeadNode3;
            head = newHeadNode3;
        }
        mSize++;
    }
    
    //delete head
    public void deleteHead(){
        if(head != null){
            head.next.prev = null;
            head = head.next;
            mSize--;
        }
    }
    
    //add Node3 at tail of List
    public void addTail(int value){
        Node3 newTailNode3 = new Node3(value);
        if(head == null){
            head = newTailNode3;
        } else{
            Node3 tailListNode3 = head;
            while(tailListNode3.next != null){
               tailListNode3 = tailListNode3.next; 
            }
            tailListNode3.next = newTailNode3;
            newTailNode3.prev = tailListNode3;
        }  
        mSize++;
    }
    
    //delete Tail
    public void deleteTail(){
        
        if(head !=null){
            Node3 currentNode3 = head;
            int count = 0;
            while(count < size()-2){
                currentNode3 = currentNode3.next;
                count ++;
            }
            currentNode3.next = null;
            mSize--;
        }
    }
    
    //get an item
    public int getItem(int position){
        if(position < 0 || position >= size()){
           throw new IndexOutOfBoundsException("required index " + position + " but actually has " + (size() - 1));
        }
        Node3 currentNode3 = head;
        int count = 0;
        while(count < position){
            currentNode3 = currentNode3.next;
            count ++;
        }
        return currentNode3.getValue();
    }
    
    //method that add node at specify Position
    public void addPosition(int value, int position){
        Node3 newNode3 = new Node3(value);
        if(position < 0 || position >= size()){
           throw new IndexOutOfBoundsException("required index " + position + " but actually has " + (size() - 1));
        }else{
            int count = 0;
        Node3 currentNode3 = head;
        while (count < position) {
            currentNode3 = currentNode3.next;
            count++;
        }
        newNode3.next = currentNode3.next;
        currentNode3.next.prev = newNode3;
        currentNode3.next = newNode3;
        newNode3.prev = currentNode3;
        mSize--;
        }
        
        
    }
    
    //delete node at specify position
    public void deletePosition(int position){
        Node3 currentNode3 = head;
        int count = 0;
        if(position < 0 || position >= size()){
           throw new IndexOutOfBoundsException("required index " + position + " but actually has " + (size() - 1));
        }else{
            if(head != null){
            if(position == 0){
                deleteHead();
            }else{
                while(count < position - 1){
                currentNode3 = currentNode3.next;
                count ++;
            }
            currentNode3.next.next.prev = currentNode3;
            currentNode3.next = currentNode3.next.next;
            }
            
        }
           mSize--; 
        }
        
    }
    
    //find in List
    public boolean findItem(int value){
        Node3 currentNode3 = head;
        while(currentNode3 != null){
            if(currentNode3.getValue() == value){
                return true;
            }
            currentNode3 = currentNode3.next;
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
            Node3 linkedListNode3 = head;
            while(linkedListNode3 != null){
                System.out.println(linkedListNode3.getValue());
                linkedListNode3 = linkedListNode3.next;
            }
        }
    }
}

class Node3{
    private int value;
    protected Node3 next;
    protected Node3 prev;
    public Node3(int value){
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
    
    public void setValue(int value){
        this.value = value;
    }
}