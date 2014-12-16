import java.io.*;
import java.util.*;
import java.lang.*;
class PascalTriangle{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		ArrayList<Double> list;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				int rows = Integer.parseInt(line);
				int[] tri = new int[(rows*(rows+1)/2)];
				for(int i=1; i<=rows;i++){
					if(i == 1){
						tri[i*(i-1)/2]= 1;
					}
					else{
						tri[i*(i-1)/2]= 1;
						tri[((i+1)*i/2)-1]= 1;
					}
					int leftbound = i*(i-1)/2 + 1;
					int rightbound = i*(i+1)/2 - 2;
					int x = (i-1)*(i-2)/2;
					while(leftbound<=rightbound){
						tri[leftbound] = tri[x] + tri[x+1];
						x++;
						leftbound++;
					}
				}
				for(int i = 0 ; i  < tri.length ; i++)
					System.out.print(tri[i]+" ");
				System.out.println();
			}
		}catch(Exception e){
			System.out.print("Exception caught: " + e);
		}
		
	}
}
