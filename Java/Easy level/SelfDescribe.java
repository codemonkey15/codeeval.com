import java.io.*;
import java.util.*;
import java.lang.*;
class SelfDescribe{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				boolean flag = false;
				//System.out.println(line);
				for(int i = 0; i < line.length() ;i++){
					int val = Character.getNumericValue(line.charAt(i));
					//System.out.println("Val : "+val);
					int count = 0;
					for(int j =0; j < line.length(); j++)
						if(line.charAt(j) == (char)(i+48))
							count++;
					int occurance = count;
					//System.out.println("Count of "+i+" : "+occurance);
					if(val != occurance){
						System.out.println("0");
						flag = true;
						break;
					}
				}
				if(flag == false){
					System.out.println("1");
				}
			}
		}catch(Exception e){
			System.out.print("Exception caught");
		}
		
	}
}
