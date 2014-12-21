import java.io.*;
import java.util.*;
import java.lang.*;
import java.nio.ByteOrder;
class GuessTheNumber{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				String[] tokens = line.split(" ");
				int number = Integer.parseInt(tokens[0]);
				int lower = 0, higher = number, middle;
				for(int i = 1 ; i < tokens.length ; i++){
					middle = (int)Math.ceil((float)(lower + higher)/2);
					if(tokens[i].equals("Lower")){
						higher = middle-1;
					}
					else if(tokens[i].equals("Higher")){
						lower = middle+1;
					}
					else if(tokens[i].equals("Yay!"))
						System.out.println(middle);
				}
			}
		}catch(Exception e){
			System.out.print(e);
		}
		
	}
}
