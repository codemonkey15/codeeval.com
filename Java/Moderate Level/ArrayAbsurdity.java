import java.io.*;
import java.util.*;
import java.lang.*;
class ArrayAbsurdity{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				if(line!=""){
					String[] tokens = line.split(";");
					int size = Integer.parseInt(tokens[0]);
					boolean[] arr = new boolean[size];
					String[] nums = tokens[1].split(",");
					for(int  i = 0 ; i < nums.length ; i++){
						if(arr[Integer.parseInt(nums[i])]==false)
							arr[Integer.parseInt(nums[i])]=true;
						else
							System.out.println(nums[i]);
					}
				}
			}
		}catch(Exception e){
			System.out.print("Exception caught: " + e);
		}
		
	}
}
