import java.io.*;
import java.util.*;
import java.lang.*;
class NiceAngles{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				double num = Double.parseDouble(line.trim());
				double dec_min = (num - (int)num)*60;
				double dec_sec = (dec_min - (int)dec_min)*60;
				System.out.format("%d.%02d'%02d\"",(int)num, (int)dec_min, (int)dec_sec);
				System.out.println();
			}
		}catch(Exception e){
			System.out.print("Exception caught: " + e);
		}
		
	}
}
