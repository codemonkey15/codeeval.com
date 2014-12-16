import java.io.*;
import java.util.*;
class SwapCase{

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
				for(int i = 0; i<line.length() ; i++){
					if(line.charAt(i) == (Character.toUpperCase(line.charAt(i))))
						System.out.print(Character.toLowerCase(line.charAt(i)));
					else
						System.out.print(Character.toUpperCase(line.charAt(i)));
				}
				System.out.println();
			}
		}catch(Exception e){
			System.out.print("Exception caught");
		}
		
	}
}
