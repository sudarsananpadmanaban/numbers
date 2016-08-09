import java.util.Scanner;


public class HappyNumber {

		public static void main(String[] args) {
			int a=19;
			int x=0;
			int c=0;
			while(x!=1)
			{   
				x=0;
				while(a!=0)
				{
			    c=a%10;
			   int output=(int) Math.pow(c,2);
				x=x+output;
				a=a/10;
				}
				a=x;
			}
			System.out.println(x);
	
		}

}