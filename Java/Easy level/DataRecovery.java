import java.io.*;
import java.util.*;	
import java.lang.*;
class DataRecovery{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		int num, rev_num, result, iter=0;
		String line;
		int[] time1 = new int[3];
		int[] time2 = new int[3];
		int[] diff = new int[3];
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			boolean found;
			while((line = br.readLine())!=null){
				String[] tokens = line.split(";");
				String[] words = tokens[0].split(" ");
				String[] pos = tokens[1].split(" ");
				String[] sent = new String[words.length];
				for(int i = 0; i < pos.length ; i++){
					sent[Integer.parseInt(pos[i])-1] = words[i];
					//String temp = words[Integer.parseInt(pos[i])-1];
					//System.out.println(temp);
					//words[Integer.parseInt(pos[i])-1] = words[i];
					//words[i] = temp;
					//System.out.println("-----");
					//for(int j = 0 ; j< words.length;j++){
					//	System.out.print(words[j]+" ");
					//}
				}
				int i;
				for(i = 0 ; i< pos.length;i++){
					System.out.print(sent[i]+" ");
				}
				for(int j = i ; j < words.length ; j++)
					System.out.print(words[j]);
				System.out.println();
			}
		}catch(Exception e){
			System.out.print("Exception caught: " + e);
		}
		
	}
}
