import java.io.*;
import java.util.*;
import java.lang.*;
class ArmstrongNumber{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		int n,m, temp=0;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				int number = Integer.parseInt(line);
				int sum = 0;
				for(int i = 0; i< line.length();i++){
					sum = sum + (int)Math.pow(Character.getNumericValue(line.charAt(i)),line.length());
				}
				if(sum == number)
					System.out.println("True");
				else
					System.out.println("False");
			}
		}catch(Exception e){
			System.out.print("Exception caught");
		}
		
	}
}
