import java.io.*;
import java.util.*;	
import java.lang.*;
class ReverseAndAdd{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		int num, rev_num, result, iter=0;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			boolean found;
			while((line = br.readLine())!=null){
				result = 0;
				num = Integer.parseInt(line.trim());
				//System.out.println(num);
				rev_num = Integer.parseInt((new StringBuffer(line.trim())).reverse().toString());
				//System.out.println(rev_num);
				result = num + rev_num;
				//System.out.println(result);
				for(int i = 0; i< 100;i++){
					if(String.valueOf(result).equals((new StringBuffer(String.valueOf(result).trim())).reverse().toString())){
						iter = i+1;
						break;
					}
					else{
						num = result;
						//System.out.println(num);
						rev_num = Integer.parseInt((new StringBuffer(String.valueOf(result).trim())).reverse().toString());
						//System.out.println(rev_num);
						result = num + rev_num;
						//System.out.println(result);
					}
				}
				System.out.println(iter+" "+result);
			}
		}catch(Exception e){
			System.out.print("Exception caught: " + e);
		}
		
	}
}
