import java.io.*;
import java.util.*;
import java.lang.*;
class SimpleSorting{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		ArrayList<Double> list;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				list = new ArrayList<Double>();
				String[] tokens = line.split(" ");
				for(int i = 0; i < tokens.length;i++){
					list.add(Double.parseDouble(tokens[i]));
				}
				Collections.sort(list);
				
				for(int i = 0 ; i < list.size(); i++){
					System.out.format("%.3f ",list.get(i));
				}
				System.out.println();
			}
		}catch(Exception e){
			System.out.print("Exception caught");
		}
		
	}
}
