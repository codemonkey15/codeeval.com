import java.io.*;
import java.util.*;
import java.lang.*;
class WordsToDigits{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		int rows;
		ArrayList<Integer> list = new ArrayList<Integer>();
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				String[] words =line.split(";");
				for(int i = 0;  i< words.length;i++){
					switch(words[i]){
						case "zero":	System.out.print("0");
										break;
						case "one":	System.out.print("1");
										break;
						case "two":	System.out.print("2");
										break;
						case "three":	System.out.print("3");
										break;
						case "four":	System.out.print("4");
										break;
						case "five":	System.out.print("5");
										break;
						case "six":		System.out.print("6");
										break;
						case "seven":	System.out.print("7");
										break;
						case "eight":	System.out.print("8");
										break;
						case "nine":	System.out.print("9");
										break;
					}
				}
				System.out.println();
			}
		}catch(Exception e){
			System.out.print("Exception caught: " + e);
		}
		
	}
}
