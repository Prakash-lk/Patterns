# Patterns

/*
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        *

*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
		for(int row=n;row>=1;row=row-2){
		    for(int space=1;space<=n-row+1;space++){
		        System.out.print(" ");
		    }
		    for(int col=n;col>=n-row+2;col--){
		        System.out.print("*"+" ");
		    }
		    System.out.println();
		}
	}
}
