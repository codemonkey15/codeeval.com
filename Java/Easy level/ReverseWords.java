import java.io.*;
import java.util.*;
class ReverseWords{

	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		StringTokenizer st;
		//ArrayList<String> words = new ArrayList<String>();
		int i=0;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			//ArrayList<String> words = new ArrayList<String>();
			while((line = br.readLine())!=null){
				ArrayList<String> words = new ArrayList<String>();
				st = new StringTokenizer(line);
				while(st.hasMoreTokens()){
					words.add(st.nextToken());
					i = i+1;
				}
				Collections.reverse(words);
				for(int j = 0; j < words.size() ; j++){
					System.out.print(words.get(j)+" ");
				}
				System.out.println();
			}
		}catch(Exception e){
			System.out.print("Exception caught");
		}
		
	}
}
