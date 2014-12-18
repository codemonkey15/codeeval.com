import java.io.*;
import java.util.*;	
import java.lang.*;
class ReadMore{
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
				if(line.length() <= 55)
					System.out.println(line);
				else{
					String substr = line.substring(0,40);
					if(substr.charAt(39) == ' ')
						System.out.println(substr.trim()+"... <Read More>");
					else{
						int pos=39;
						for(int i = 39; i > 0; i--){
							if(substr.charAt(i)== ' '){
								pos = i;
								break;
							}
						}
						System.out.println(substr.substring(0, pos).trim()+"... <Read More>");
					}
				}
			}
		}catch(Exception e){
			System.out.print("Exception caught: " + e);
		}
		
	}
}
