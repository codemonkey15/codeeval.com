import java.io.*;
import java.util.*;
class Fibo{

	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		StringTokenizer st;
		int num, temp;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				int num1 = 0, num2 = 1;
				num = Integer.parseInt(line);
				for(int i = 2; i <= num ; i++){
					temp = num1;
					num1 = num2;
					num2 = num1 + temp;
				}
				if(num == 0)
					System.out.println("0");
				else
					System.out.println(num2);
			}
		}catch(Exception e){
			System.out.print("Exception caught");
		}
		
	}
}
