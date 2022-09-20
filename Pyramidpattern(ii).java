# Patterns

/*
output : 

          * 
        * * * 
      * * * * * 
    * * * * * * * 
  * * * * * * * * *

*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
	    for(int row=1;row<=n;row=row+2){
	        for(int space=0;space<n-row+1;space++){
	            System.out.print(" ");
	        }
	        for(int col=1;col<=row;col++){
	            System.out.print("*"+" ");
	        }
	        System.out.println();
	    }
	}
}
