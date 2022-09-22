# Patterns

/*
input : n=5
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    *
    
*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int row=1;row<=n;row++){
		    for(int space=1;space<n-row+1;space++){
		        System.out.print(" ");
		    }
		    for(int col=1;col<=row;col++){
		        System.out.print("*"+" ");
		    }
		    System.out.println();
		}
		for(int row=1;row<=n;row++){
		    for(int space=1;space<row+1;space++){
		        System.out.print(" ");
		    }
		    for(int col=2;col<=n-row+1;col++){
		        System.out.print("*"+" ");
		    }
		    System.out.println();
		}
	}
}
