# Patterns

/*
input : n=5

output: 
54321
4321
321
21
1
12
123
1234
12345
*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
		for(int row=1;row<=n;row++){                            
		    for(int col=n-row+1;col>=1;col--){
		        System.out.print(col);
		    }                                             
		    System.out.println();
		}
		for(int row=2;row<=n;row++){                            
		    for(int col=1;col<=row;col++){
		        System.out.print(col);
		    }                                             
		    System.out.println();
		}
	}
}
