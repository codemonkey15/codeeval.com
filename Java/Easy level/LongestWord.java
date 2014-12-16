import java.io.*;
import java.util.*;
import java.lang.*;
class LongestWord{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		int rows, pos=0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				String[] words =line.split(" ");
				int length = 0;
				for(int i = 0;  i< words.length;i++){
					if(words[i].length()> length){
						length = words[i].length();
						pos = i;
					}
					
				}
				System.out.println(words[pos]);
			}
		}catch(Exception e){
			System.out.print("Exception caught: " + e);
		}
		
	}
}
