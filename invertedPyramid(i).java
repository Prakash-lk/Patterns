# Patterns

/*
input : n=5
output: 
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
		    for(int space=1;space<row;space++){
		        System.out.print(" ");
		    }
		    for(int col=1;col<=n-row+1;col++){
		        System.out.print("*"+" ");
		    }
		    System.out.println();
		}
	}
}
