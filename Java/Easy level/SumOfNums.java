import java.io.*;
import java.util.*;
class SumOfNums{

	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		StringTokenizer st;
		int num, sum = 0;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				sum = sum + Integer.parseInt(line);
			}
			System.out.println(sum);
		}catch(Exception e){
			System.out.print("Exception caught");
		}
		
	}
}
