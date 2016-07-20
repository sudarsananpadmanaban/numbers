
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class newclass4 {
     public static void main(String[] args) 
     {
        System.out.println("Enter a string:");
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b="";
        char ch;
        int l=a.length();
        for(int i=0;i<l-1;i++)
        {
        ch=a.charAt(i);
        if(ch!=' ')
        {
            b=b+ch;
            a=a.replace(ch,' ');
    }
        }
        
        
            System.out.println("the string is"+b);
    

     }
}
