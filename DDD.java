
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */

public class DDD{
 
  
    public static void main(String[] args) 
    {
 
        
        
        
          int n,m=0,t;
        Scanner s=new Scanner(System.in);
          int a=s.nextInt();//It is the number variable to be checked for palindrome  
  
               t=a;    
           while(a>0)
  {    
   n=a%10;    
   m=(m*10)+n;    
   a=a/10;    
  }    
  if(t==a)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome"); 
    }
    
}