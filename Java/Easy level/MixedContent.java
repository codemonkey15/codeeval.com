import java.io.*;
import java.util.*;
import java.lang.*;
import java.nio.ByteOrder;
class MixedContent{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				String[] tokens = line.split(",");
				String nums = "";
				String str = "";
				boolean isStr;
				for(int i = 0 ; i < tokens.length ; i++){
					isStr = false;
					try{
						Integer.parseInt(tokens[i]);
					}catch(NumberFormatException e){
						str += tokens[i]+",";
						isStr = true;
					}
					if(isStr == false){
						nums += tokens[i]+",";
					}
				}
				if(str.length()!=0 && nums.length()!=0)
					System.out.println(str.substring(0, str.length()-1)+"|"+nums.substring(0, nums.length()-1));
				else if(str.length()==0)
					System.out.println(nums.substring(0, nums.length()-1));
				else if(nums.length()==0)
					System.out.println(str.substring(0, str.length()-1));
			}
		}catch(Exception e){
			System.out.print(e);
		}
		
	}
}
