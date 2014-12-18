import java.io.*;
import java.util.*;	
import java.lang.*;
class SplitTheNumber{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		int c, num1=0, num2=0, result;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			boolean found;
			while((line = br.readLine())!=null){
				String[] tokens = line.split(" ");
				for(int i = 0 ; i < tokens[1].length() ; i++){
					if(tokens[1].charAt(i)=='-' || tokens[1].charAt(i)=='+'){
						num1 = i;
						break;
					}
				}
				switch(tokens[1].charAt(num1)){
				case '-':	result = Integer.parseInt(tokens[0].substring(0, num1)) -  Integer.parseInt(tokens[0].substring(num1, tokens[1].length()-1));
							System.out.println(result);
							break;
				case '+':	result = Integer.parseInt(tokens[0].substring(0, num1)) +  Integer.parseInt(tokens[0].substring(num1, tokens[1].length()-1));
							System.out.println(result);
							break;
				}
			}
		}catch(Exception e){
			System.out.print("Exception caught: " + e);
		}
		
	}
}
