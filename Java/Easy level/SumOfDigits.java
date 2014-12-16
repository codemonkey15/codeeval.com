import java.io.*;
import java.util.*;
class SumOfDigits{

	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		StringTokenizer st;
		int num;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				int sum = 0;
				num = Integer.parseInt(line);
				while(num > 0){
					int x = num % 10;
					sum = sum + x;
					num = num / 10;
				}
				System.out.println(sum);
			}
		}catch(Exception e){
			System.out.print("Exception caught");
		}
		
	}
}
