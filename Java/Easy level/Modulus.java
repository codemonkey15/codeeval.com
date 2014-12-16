import java.io.*;
import java.util.*;
import java.lang.*;
class Modulus{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		int n,m, temp=0;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				String[] numbers = line.split(",");			
				n = Integer.parseInt(numbers[0]);
				m = Integer.parseInt(numbers[1]);
				temp = m;
				while(temp < n){
					temp = temp + m; 
				}
				if(temp == n)
					System.out.println("0");
				else
					System.out.println(n - (temp - m));
			}
		}catch(Exception e){
			System.out.print("Exception caught");
		}
		
	}
}
