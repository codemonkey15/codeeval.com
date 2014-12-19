import java.io.*;
import java.util.*;
import java.lang.*;
class NumberOfOnes{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				int num = Integer.parseInt(line.trim());
				int count = 0;
				while(num > 0){
					if(num%2!=0){
						count++;
					}
					num /= 2;
				}
				System.out.println(count);
			}
		}catch(Exception e){
			System.out.print("Exception caught: " + e);
		}
		
	}
}
