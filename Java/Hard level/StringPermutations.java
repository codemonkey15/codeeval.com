import java.io.*;
import java.util.*;	
import java.lang.*;
class StringPermutations{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			boolean found;
			while((line = br.readLine())!=null){
					System.out.print(line);
					permutation("", line);
					System.out.println();
			}
		}catch(Exception e){
			System.out.print("Exception caught: " + e);
		}
		
	}
	public static void permutation(String prefix, String str){
		int n = str.length();
		if(n==0) System.out.print(","+prefix);
		else{
			for(int i = 0 ; i < n ;i++)
				permutation(prefix + str.charAt(i), str.substring(0,i)+str.substring(i+1,n));
		}
	}
}
