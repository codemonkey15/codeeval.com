import java.io.*;
import java.util.*;
import java.lang.*;
import java.nio.ByteOrder;
class MinimumCoins{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				int coins = 0;
				int num = Integer.parseInt(line);
				while(num > 0){
					if(num >= 5){
						coins+=num/5;
						num %=5;
					}
					else if(num >= 3){
						coins += num/3;
						num %= 3;
					}
					else if(num > 0){
						coins++;
						num--;
					}
				}
				System.out.println(coins);
			}
		}catch(Exception e){
			System.out.print(e);
		}
		
	}
}
