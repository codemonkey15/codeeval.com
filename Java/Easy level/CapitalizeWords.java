import java.io.*;
import java.util.*;
class CapitalizeWords{

	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		StringTokenizer st;
		//ArrayList<String> words = new ArrayList<String>();
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			//ArrayList<String> words = new ArrayList<String>();
			while((line = br.readLine())!=null){
				st = new StringTokenizer(line);
				while(st.hasMoreTokens()){
					String temp = st.nextToken();
					System.out.print(Character.toUpperCase(temp.charAt(0)) + temp.substring(1)+" ");
				}
				System.out.println();
			}
		}catch(Exception e){
			System.out.print("Exception caught");
		}
		
	}
}
