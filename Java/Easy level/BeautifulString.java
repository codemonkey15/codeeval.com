import java.io.*;
import java.util.*;
import java.lang.*;
class BeautifulString{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				line = line.toLowerCase();
				System.out.println(line);
				int sum = 0;
				for(int i = 0; i < line.length(); i++){
					if((int)line.charAt(i)!=32)
						sum = sum + (int)line.charAt(i)-96;
				}
				System.out.println(sum);
			}
		}catch(Exception e){
			System.out.print("Exception caught");
		}
		
	}
}
