import java.io.*;
import java.util.*;
class PrimeNumbers{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			boolean found;
			while((line = br.readLine())!=null){
				boolean first = true;
				int num = Integer.parseInt(line.trim());
				if(num < 1 )
					System.out.println("0");
				else{
					for(int i = 2 ; i < num;i++){
						boolean prime = true;
						for(int j = i-1 ; j > 1; j--){
							if(i%j == 0){
								prime = false;
								break;
							}
						}
						if(prime == true && first == true){
							first = false;
							System.out.print(i);
						}
						else if(prime == true && first == false)
							System.out.print(","+i);
					}
				}
				System.out.println();
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}