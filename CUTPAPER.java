// https://www.codechef.com/problems/CUTPAPER
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
		    int k = s.nextInt();
		    int n = s.nextInt();
		    int res = k/n;
		    System.out.println(res*res);
		}
	}
}
