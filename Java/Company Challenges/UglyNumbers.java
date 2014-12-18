import java.io.*;
import java.util.*;	
import java.lang.*;
class UglyNumbers{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		int num;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			boolean found;
			while((line = br.readLine())!=null){
				for(int i = 0 ; i < line.length() ; i++){
					
				}
			}
		}catch(Exception e){
			System.out.print("Exception caught: " + e);
		}
		
	}
}
