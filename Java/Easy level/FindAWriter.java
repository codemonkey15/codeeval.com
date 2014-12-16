import java.io.*;
import java.util.*;
class FindAWriter{

	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		StringTokenizer st;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				if(!line.isEmpty()){
					String[] tokens = line.split("[|]");
					String[] index = tokens[1].split("[ ]");
					for(int i = 1; i<index.length;i++){
						System.out.print(tokens[0].charAt(Integer.parseInt(index[i])-1));
					}
					System.out.println();
				}
			}
		}catch(Exception e){
			System.out.print(e);
		}
		
	}
}
