import java.io.*;
import java.util.*;
import java.lang.*;
import java.nio.ByteOrder;
class DecimalToBinary{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				if(line != ""){
					int num = Integer.parseInt(line);
					String binary = "";
					if(num == 0 || num == 1){
						System.out.println(num);
						continue;
					}
					while(num > 0){
						if(num%2 == 0)
							binary += "0";
						else
							binary += "1";
						num /= 2;
					}
					System.out.println(new StringBuffer(binary).reverse().toString());
				}
			}
		}catch(Exception e){
			System.out.print(e);
		}
		
	}
}
