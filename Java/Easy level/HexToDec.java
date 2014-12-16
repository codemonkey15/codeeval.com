import java.io.*;
import java.util.*;
import java.lang.*;
class HexToDec{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		int n,m, temp=0;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				int number=0, num;
				for(int i = line.length()-1; i >= 0  ;i--){
					char var = line.charAt(i);
					switch(var){
						case 'a':	num = 10;
						case 'b':	num = 11;
						case 'c':	num = 12;
						case 'd':	num = 13;
						case 'e':	num = 14;
						case 'f':	num = 15;
						default	:	num = Character.getNumericValue(var);
					}
					number = number + num * (int)Math.pow(16,(line.length()-1 -i));
				}
				System.out.println(number);
			}
		}catch(Exception e){
			System.out.print("Exception caught");
		}
		
	}
}
