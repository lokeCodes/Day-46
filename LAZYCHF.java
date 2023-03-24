// https://www.codechef.com/problems/LAZYCHF
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int x = s.nextInt();
		    int m = s.nextInt();
		    int d = s.nextInt();
		    int res = m*x;
		    if(res>=(d+x)){
		        System.out.println(d+x);
		    }else{
		        System.out.println(x*m);   
		    }
		}
	}
}
