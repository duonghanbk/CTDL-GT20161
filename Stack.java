/*
 * into change this license header, choose License Headers in Project Properties.
 * into change this template file, choose intools | intemplates
 * and open the template in the editor.
 */
package ctdl;

import java.util.Scanner;

/**
 *
 * @author HD ♥ Hint
 */
public class Stack {
  private int[] values;
  //cac phuong thuc khoi dung
  
  public Stack(){
  this.values = null;
  }
  public Stack(int[] values){
      this.values = values; 
  }
  
      //phuong thuc lay rfa mot node
  
  public int pop(){
      int result = 0;
      if((values != null)&&(values.length > 0)){
          result = values[values.length -1];
      }
      
      //loai bo int do
      
      int[] tmpint = new int[values.length -1];
      for(int i=0; i<values.length -1;i++){
          tmpint[i] = values[i];
          this.values = tmpint;
      }
      
      return result;
  }
  
  //phuong thuc them 1 node vao stack
  
  public void push(int node){
      if(values == null){//ngan xep rong
          values = new int[1];
          values[0] = node;
      }else{//ngan xep da co du lieu
          int[] tmp = new int[values.length + 1];
          for(int i=0;i<values.length; i++){
              tmp[i] = values[i];
              
          }
        tmp[values.length] = node;
        this.values = tmp;      
      }
  }
  
  //in
  
  public void print(){
      if(values ==null) {
          System.out.println("Stack is NUll");
      }else{
          for(int i = 0; i<values.length ; i++){
              System.out.println(values[i]);
          }
      }
  }
    public static void main(String[] args) {
        //int [] arr = new int[5];
        System.out.println("KHoi tao stack,nhap so luong phan tu muon khoi tao");
        
        Stack  s = new Stack();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        
        for(int i=0; i< n; i++){
            System.out.println("Nhap gia tri phan tu thu "+ i);
            //arr[i] = in.nextInt();
            s.push(in.nextInt());
        }
        
        //Stack s = new Stack(arr);
        
        System.out.println("--------------------------------");
        System.out.println("Ngan xep sau khi khoi tao:");
        s.print();
        
        System.out.println("-------------------------");
        System.out.println("Them mot phan tu");
        System.out.println("-----------------------");
        System.out.println("Nhap phan tu muon them: ");
        s.push(in.nextInt());
        System.out.println("-------------------------");
        System.out.println("Danh sach sau khi them:");
        s.print();
    }
}
