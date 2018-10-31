/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sssss;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author syanu
 */
public class Sssss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("NIM : ");
        String NIM=input.nextLine();
        int p=NIM.length();
        String[] A= new String[p];
        int[] B= new int[p];
        int x=1;
        for(int i=0;i<p;i++){
            A[i]=String.valueOf(NIM.charAt(i));
        }
        for(int i=0;i<p;i++){
           B[i]=Integer.parseInt(A[i]);
           if(B[i]>0){
               x=x*B[i];
           }
        }
         for(int i=0;i<p;i++){
             B[i]=B[i]+x;
         }
          for(String a:A){
            System.out.println(a);
          }
          System.out.println(x);
          for(int a:B){
            System.out.println(a);
          }     
    }
    
}
