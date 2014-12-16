import java.io.*;
import java.util.*;
class UniqueElements{

	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		StringTokenizer st;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				String[] numbers = line.split(",");			
				int uniqueNum = Integer.parseInt(numbers[0]);
				System.out.print(uniqueNum);
				for(int i = 1 ; i < numbers.length ; i++){
					if(uniqueNum != Integer.parseInt(numbers[i])){
							uniqueNum = Integer.parseInt(numbers[i]);
							System.out.print(","+uniqueNum);
						}
				}
				System.out.println();
			}
		}catch(Exception e){
			System.out.print("Exception caught");
		}
	}
}
