import java.io.*;
import java.util.*;
import java.lang.*;
class QueryBoard{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		int[][] matrix = new int[256][256];
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				String[] tokens = line.split(" ");
				int col = Integer.parseInt(tokens[1]);
				int sum;
				switch(tokens[0]){
					case "SetCol"	:	
					{
						int val = Integer.parseInt(tokens[2]);
						for(int i = 0; i < 256 ; i++){
							matrix[i][col] = val;	
						}
						break;
					}
					case "SetRow"	:	
					{	
						int val = Integer.parseInt(tokens[2]);
						for(int i = 0; i < 256 ; i++){
							matrix[col][i] = val;	
						}
						break;
					}
					case "QueryCol"	:
					{
						sum = 0;
						for(int i = 0; i < 256 ; i++){
							sum = sum + matrix[i][col];
						}
						System.out.println(sum);
						break;
					}
					case "QueryRow"	:
					{	
						sum = 0;
						for(int i = 0; i < 256 ; i++){
							sum = sum + matrix[col][i];
						}
						System.out.println(sum);
						break;
					}
					default:
					
				}
			}
		}catch(Exception e){
			System.out.print("Exception caught");
		}
		
	}
}
