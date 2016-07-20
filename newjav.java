
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class newjava2 {
    

 public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int i=s.nextInt();
      int c=0,temp;
      while(i>0)
      {
          
        temp=i%10;
       i=i/10;
        c=c*10+temp;
         
      }
        System.out.print("reverse"+c);
    }
}