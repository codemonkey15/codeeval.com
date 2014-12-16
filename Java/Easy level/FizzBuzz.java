import java.io.*;
import java.util.*;
class FizzBuzz{
	public static void main(String args[]){
		FileReader freader = null;
		BufferedReader breader;
		StringTokenizer st;
		int f,b, range;
		if(args.length != 1){
			System.out.println("Usage : java FizzBuzz filename.txt");
		}
		else{
			try{
				freader = new FileReader(args[0]);
				breader = new BufferedReader(freader);
				String line;
				while((line = breader.readLine())!=null){
					st = new StringTokenizer(line);
					f = Integer.parseInt(st.nextToken());
					b = Integer.parseInt(st.nextToken());
					range = Integer.parseInt(st.nextToken());
					generateOutput(f, b, range);
				}
			} catch(Exception e){
				System.out.println("Exception handled");
			}
		}
		
	}
	static void generateOutput(int f, int b, int range){
		for(int fb = 1 ; fb <= range ; fb++){
			if(fb%f == 0 && fb%b==0){
				System.out.print("FB ");
			}
			else if(fb%f == 0){
				System.out.print("F ");
			}
			else if(fb%b == 0){
				System.out.print("B ");
			}
			else{
				System.out.print(String.valueOf(fb)+" ");
			}
			
		}
		System.out.println();
	}
}