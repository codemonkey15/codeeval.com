import java.io.*;
import java.util.*;
class LastOccurance{

	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		StringTokenizer st;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				String[] tokens = line.split(",");
				String reverseline = new StringBuffer(tokens[0]).reverse().toString();
				int pos = reverseline.indexOf(tokens[1]);
				if(pos == -1)
					System.out.println("-1");
				else
					System.out.println(tokens[0].length() - pos - 1);
			}
		}catch(Exception e){
			System.out.print("Exception caught");
		}
		
	}
}
