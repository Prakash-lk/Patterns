# Patterns

/*
input : n=5

output: 1
        21
        123
        4321
        12345
*/

#java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int z=0;
	    for(int i=1;i<=n;i++){
	        z=0;
	        for(int j=1;j<=i;j++){
	           if(i%2==0){
	           System.out.print(i-z);
	           z++;
	               
	           }else{
	            System.out.print(j);
	           }
	        }
	        System.out.println();
	    }
	}
}
