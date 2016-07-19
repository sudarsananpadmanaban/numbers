


import java.util.Scanner;
public class NewClass 
 {

public static void main(String [] args)
{
String n;
System.out.println("enter the sentence");
Scanner s=new Scanner(System.in);
n=s.nextLine();
String str[]=n.split(" ");
String fun="";
for(int i=str.length-1;i>=0;i--)
{
fun +=str[i]+" ";
}
System.out.println("reverse word output");
System.out.println(fun);
}
}

    

