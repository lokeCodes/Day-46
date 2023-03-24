// https://www.codechef.com/problems/KITCHENCOST
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
		    int n = s.nextInt();
		    int x = s.nextInt();
		    int arr1[] = new int[n];
		    int arr2[] = new int[n];
		    int count = 0;
		    
		    for(int i=0;i<n;i++){
		        arr1[i] = s.nextInt();
		    }
		    
		    for(int i=0;i<n;i++){
		        arr2[i] = s.nextInt();
		    }
		  
		    for(int i=0;i<n;i++){
		        if(arr1[i]>=x){
		            count = count+arr2[i];
		        }
		    }
		    
		    System.out.println(count);

		}
	}
}
