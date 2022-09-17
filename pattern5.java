# Patterns

/*
input : n=5
        1 1 1 1 1 
        2 2 2 2 
        3 3 3 
        4 4 
        5
*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    for(int row=1;row<=5;row++)
	    {
	        for(int col=1;col<=5-row+1;col++)
	        {
	            System.out.print(row+ " ");
	        }
	        System.out.println();
	    }
	}
}
