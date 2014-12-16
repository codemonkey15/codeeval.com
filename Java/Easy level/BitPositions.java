import java.io.*;
import java.util.*;
class BitPositions{

	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		//int n,p1 = 10,p2 = 10;
		//int p1_val = 10, p2_val = 10;
		StringTokenizer st;
		try{
			int n,p1,p2;
			int p1_val=10, p2_val=10;
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				String[] numbers = line.split(",");			
				n = Integer.parseInt(numbers[0]);
				p1 = Integer.parseInt(numbers[1]);
				p2 = Integer.parseInt(numbers[2]);
				int i = 1;
				while(n > 0){
					if(n%2 == 0){
						if(i == p1)
							p1_val = 0;
						else if(i==p2)
							p2_val = 0;
					}
					else{
						if(i == p1)
							p1_val = 1;
						else if(i==p2)
							p2_val = 1;
					}
					n = n/2;
					i = i+1;
				}
				if(p1_val == 10 && p2_val ==10)
					System.out.println("Error");
				else if(p1_val == p2_val)
					System.out.println("true");
				else
					System.out.println("false");
			}
		}catch(Exception e){
			System.out.print("Exception caught");
		}
	}
}
