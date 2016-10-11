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
public class QueueDemo {
    int[] arr = new int[100];
    private int f = 0;
    private int r = f;
    private int size = r-f;
    
       
    
    //test Empty queue
    public boolean isEmpty(){
        if((f<0)||(f>=r))
            return true;
        return false;
    }
    
    //test Full Queue
    public boolean isFull(){
        return size == arr.length;
    }
    
    //enqueue
    public void enQueue(int node){
        if(isFull()){
            throw new ArrayIndexOutOfBoundsException(" Full Queue!");
        }
        else{
            arr[r] = node;
            r = r+1;
            size++;
        }
    }
    
    //dequeue
    public void deQueue(){
        if(isEmpty()) {
            throw new ArrayIndexOutOfBoundsException("Empty Queue!");
            
        }else{
            f =f+1;
            size--;
        }
    }
    
    //peek Queue
    
    public int peek(){
        return arr[f];
    }
    
    //díplay
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty!");
        }else{
            for(int i = f; i<r; i++){
            System.out.println(arr[i]);
        }
        }
        
    }
    
    
    public static void main(String[] args) {
        QueueDemo que = new QueueDemo();
        System.out.println(que.arr.length);
        System.out.println("-------------------");
        
        //enqueue
//        que.enQueue(5);
//        que.enQueue(6);
//        que.enQueue(7);
        
        //display
        //que.display();
        
        //dequeue
//        System.out.println("-------------------");
//        que.deQueue();
//        que.display();
        
        //test the Empty Queue
        System.out.println("-------------------");
        System.out.println("Is Queue Empty?");
        System.out.println(que.isEmpty());
        
        
        //test the Full Queue
        System.out.println("-------------------");
        System.out.println("Is Queue Full?");
        System.out.println(que.isFull());
        
    }
}
