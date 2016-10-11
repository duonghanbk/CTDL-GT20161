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
public class MyStack {
    
    
    public static void main(String[] args) {
        MyStack s = new MyStack();
        System.out.println("Day cac phan tu vao trong Stack: ");
//        System.out.println("So phan tu du kien se day vao: ");
//        //nhap phan tu
//        Scanner in =new Scanner(System.in);
//        int n = in.nextInt(); 
//        
//        for(int i = 0; i < n; i++){
//            System.out.println("NHap phan tu thu " + i+1 + ": ");
//            int temp = in.nextInt();
//            s.push(temp);
//        }
        s.push(27);
        s.push(03);
        s.push(19);
        s.push(02);
        
        System.out.println("--------------------");
        s.print();
        System.out.println("Phan tu TOP : " + s.top());
        
    }
    private int [] arr;
    private int top = 0;
    public synchronized void push(int n){
        if(isFull()){
            int [] newArr = new int[2*arr.length];
           System.arraycopy(arr, 0, newArr, 0, arr.length) ;
           arr = newArr;
        }
        arr[top] = n;
        top++;
    }
    public synchronized int pop(){
        int topItem = arr[top-1];
        top--;
        return topItem;
    }
    
    public synchronized boolean isEmpty(){
        return (top == 0);
    }
    
    
    public synchronized int top(){
        return arr[top];
    }
    
    public synchronized boolean isFull(){
        if( top == arr.length) return true;
        else return false;
    }
    public synchronized void print(){
        for(int i = 0 ; i< top; i++){
            System.out.println(arr[i]);
        }
    }
}





