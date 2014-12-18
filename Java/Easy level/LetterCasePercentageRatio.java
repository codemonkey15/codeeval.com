import java.io.*;
import java.util.*;
class LetterCasePercentageRatio{

	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		StringTokenizer st;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				int length = line.length();
				int lower = 0, upper = 0;
				for(int i = 0 ; i < length; i++){
					if(line.charAt(i)>=97 && (int)line.charAt(i)<=122)
						lower++;
					else if((int)line.charAt(i)>=65 && (int)line.charAt(i)<=90)
						upper++;
				}
				float percent = (float)(lower*100.0)/length;
				System.out.format("lowercase: %2.2f uppercase: %2.2f" ,percent , (100-percent));
				System.out.println();
			}
		}catch(Exception e){
			System.out.print("Exception caught");
		}
	}
}
