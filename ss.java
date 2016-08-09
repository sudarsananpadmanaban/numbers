
package volandsurcuboib;

import java.util.Scanner;

public class Volandsurcuboib {

    
    public static void main(String[] args) 
{
       
         Scanner  sc=new Scanner(System.in);
         int a=sc.nextInt();
          int b=sc.nextInt();
           int c=sc.nextInt();
           int tsa=2*((a*b)+(b*c)+(c*a));
           int vol=(a*b*c);
           System.out.println(tsa+" "+vol);
    }
}