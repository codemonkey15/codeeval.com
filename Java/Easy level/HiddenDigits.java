import java.io.*;
import java.util.*;	
import java.lang.*;
class HiddenDigits{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		int c;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			boolean found;
			while((line = br.readLine())!=null){
				found = false;
				for(int i = 0; i < line.length();i++){
					c = line.charAt(i);
					if(c >= 97 && c <= 106){
						found = true;
						System.out.print(c-97);
					}
					else if(c >= 48 && c <= 57){
						found = true;
						System.out.print((char)c);
					}
				}
				if(found == false)
					System.out.println("NONE");
				else	
					System.out.println();
			}
		}catch(Exception e){
			System.out.print("Exception caught: " + e);
		}
		
	}
}
