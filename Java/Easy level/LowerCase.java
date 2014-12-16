import java.io.*;
import java.util.*;
class LowerCase{

	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		StringTokenizer st;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				System.out.println(line.toLowerCase());
			}
		}catch(Exception e){
			System.out.print("Exception caught");
		}
		
	}
}
