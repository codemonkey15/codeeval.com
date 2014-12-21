import java.io.*;
import java.util.*;
import java.lang.*;
import java.nio.ByteOrder;
class Pangrams{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				line = line.toLowerCase();
				boolean[] arr = new boolean[26];
				for(int i = 0 ; i < line.length() ; i++){
					int c = line.charAt(i);
					if(c > 96 && c < 123 ){
						arr[c-97] = true;
					}
				}
				boolean found = false;
				for(int i = 0 ; i < arr.length ; i++){
					if(arr[i] == false){
						found = true;
						System.out.print((char)(i+97));
					}
				}
				if(found == false)
					System.out.print("NULL");
				System.out.println();
			}
		}catch(Exception e){
			System.out.print(e);
		}
		
	}
}
