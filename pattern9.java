# Patterns

/*
input : n=5
output: 
       1 
       2 2 
       3 3 3 
       4 4 4 4 
       5 5 5 5 5
*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int row=1;row<=n;row++){
		    for(int col=1;col<=row;col++){
		        System.out.print(row+" ");
		    }
		    System.out.println();
		}
	}
}
