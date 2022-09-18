# Patterns

/*
input : n=5
output: 
             * 
            * * 
           * * * 
          * * * * 
         * * * * *
*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int row=1;row<=n;row++){
		    for(int sp=0;sp<n-row;sp++){
		        System.out.print(" ");
		    }
		    for(int col=1;col<=row;col++){
		        System.out.print("*"+" ");
		    }
		    System.out.println();
		}
	}
}
