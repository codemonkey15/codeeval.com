import java.io.*;
import java.util.*;	
import java.lang.*;
class WithoutRepitions{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		int c;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			int temp = br.read();
			System.out.print((char)temp);
			while((c = br.read())!=-1){
				//System.out.print((char)c);
				if(c != temp)
					System.out.print((char)c);
				else
					continue;
				temp = c;
			}
		}catch(Exception e){
			System.out.print("Exception caught: " + e);
		}
		
	}
}
