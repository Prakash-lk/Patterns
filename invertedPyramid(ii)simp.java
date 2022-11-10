# Patterns

/*
Input : n=5

output :

*********
 *******
  *****
   ***
    *
*/

Java :

public class Main
{
	public static void main(String[] args) {
		int a=5;
		for(int i=1;i<=a*2;i+=2){
		    for(int s=1;s<i;s+=2){
		        System.out.print(" ");
		    }
		    for(int j=1;j<=a*2-i;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}
