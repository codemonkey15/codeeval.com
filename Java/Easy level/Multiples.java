import java.io.*;
import java.util.*;
class Multiples{
	public static void main(String args[]){
		
		try{
			FileReader f = new FileReader(args[0]);
			BufferedReader br = new BufferedReader(f);
			String line;
			int n,x,m;

			StringTokenizer st;
			while((line=br.readLine())!=null){
				String[] numbers = line.split(",");			
				x = Integer.parseInt(numbers[0]);
				n = Integer.parseInt(numbers[1]);
				m = n;
				if(m > x)
					System.out.println("Not possible to generate proper output.");
				while(m < x){
					m = m+n;
				}
				System.out.println(m);
			}
		}catch(Exception e){
			System.out.println("Exception Caught");
		}
	}
}