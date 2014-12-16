import java.io.*;
import java.util.*;	
import java.lang.*;
class LongestLines{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line, longest1Sentence, longest2Sentence;
		int rows=0, pos=0;
		String[] longestLine = null;
		int[] longest;
		boolean[] filled;
		ArrayList<Double> list;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			if((line = br.readLine())!=null){
				rows = Integer.parseInt(line);
			}
			longest = new int[rows];
			for(int i = 0; i< rows;i++)
				longest[i] = 0;
			longestLine = new String[rows];
			for(int i = 0; i< rows;i++)
				longestLine[i] = ".";
			longestLine = new String[rows];
			int count = 0;
			while((line = br.readLine())!=null){
				boolean flag = true;
				for(int i = 0; i < rows ; i++){
					if(longest[i] > line.length()){
						flag = false;
						pos = i;
						break;
					}
				}
				if(flag == true){
						if(count < rows){
							longest[0] = line.length();
							longestLine[0] = line;
							count++;
						}
						if(count == rows){
							for(int i = 1 ; i < rows ; i++){
								longestLine[i-1] = longestLine[i];
								longest[i-1] = longest[i];
							}
							longestLine[rows-1] = line;
							longest[rows-1] = line.length();
						}
				}
				else{
					if(count < rows){
						for(int i = pos; i < rows-1;i++){
							longestLine[pos+1] = longestLine[pos];
							longest[pos+1] = longest[pos];
						}
						longestLine[pos] = line;
						longest[pos] = line.length();
						count++;
					}
				}
			}	
			for(int i = rows-1; i >=0; i--){
				System.out.println(longestLine[i]);
			}
		}catch(Exception e){
			System.out.print("Exception caught: " + e);
		}
		
	}
}
