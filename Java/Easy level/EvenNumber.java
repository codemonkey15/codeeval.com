import java.io.*;
import java.util.*;
import java.lang.*;
class EvenNumber{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				int num = Integer.parseInt(line);
				if(num%2==0)
					System.out.println("1");
				else
					System.out.println("0");
			}
		}catch(Exception e){
			System.out.print("Exception caught");
		}
		
	}
}
