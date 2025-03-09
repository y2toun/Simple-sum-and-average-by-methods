package com.mycompany.hello;
import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three numbers");
        int n1=input.nextInt();
        int n2 = input.nextInt();
         int n3 = input.nextInt();
         int x = add(n1,n2,n3);
         double y = average(n1,n2,n3);
         show(x,y);
         
         
                
    }
    public static int add(int x , int y , int z){
        return x+y+z;
    }
    public static double average(int v ,int c , int b){
        return add(v,c,b)/3.0;
    }
    public static void show(int s,double a){
       System.out.println("sum="+s);
       System.out.println("average="+a);
    }
    
}
