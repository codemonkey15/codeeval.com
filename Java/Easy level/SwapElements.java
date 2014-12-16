import java.io.*;
import java.util.*;	
import java.lang.*;
class SwapElements{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			
			while((line = br.readLine())!=null){
				String[] tokens = line.split(":");
				String[] numbers = tokens[0].split(" ");
				String[] swap = tokens[1].split(",");
				String temp = null;
				for(int i = 0 ; i < swap.length; i++){
					//swap[i] = swap[i].trim();
					//System.out.println("temp: "+numbers[(int)(swap[i].trim().charAt(0))-48]);
					temp = numbers[(int)(swap[i].trim().charAt(0))-48];
					numbers[(int)(swap[i].trim().charAt(0))-48] = numbers[(int)(swap[i].trim().charAt(2))-48];
					numbers[(int)(swap[i].trim().charAt(2))-48] = temp;
				}
				for(int i = 0 ; i < numbers.length ; i++){
					System.out.print(numbers[i]+" ");
				}
				System.out.println();
			}
		}catch(Exception e){
			System.out.print("Exception caught: " + e);
		}
		
	}
}
