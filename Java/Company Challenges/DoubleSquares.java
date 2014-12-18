import java.io.*;
import java.util.*;
import java.lang.*;
class DoubleSquares{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		ArrayList<Integer> list;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			line = br.readLine();
			int iter = Integer.parseInt(line.trim());
			for(int i = 0 ; i < iter ; i++){
				line = br.readLine();
				int num = Integer.parseInt(line.trim());
				int count = 0, num1 = 0, num2 = 0;
				float sq = 0;
				if(num == 0 || num==1)
					System.out.print("1");
				else{
					for(int j = 0 ; j < (Math.sqrt(num))/2+1 ; j++){
						num1 = j*j;
						num2 = num - num1;
						sq = (float)Math.sqrt(num2);
						if(sq == (int)sq){
							count++;
						}
					}
					System.out.print(count);
				}
				System.out.println();
			}
		}catch(Exception e){
			System.out.print("Exception caught: " + e);
		}
		
	}
}
