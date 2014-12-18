import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class LowestUnique{

	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				if(!line.isEmpty()){
					int[] num_set = new int[10];
					String[] nums = line.split(" ");
					int winner = 0;
					for(int i = 0; i < nums.length;i++){
						num_set[Integer.parseInt(nums[i])]--;
					}
					boolean unique = false;
					for(int i = 1 ; i < num_set.length ; i++){
						if(num_set[i]==-1){
							unique = true;
							for(int j = 0 ; j < nums.length ; j++){
								if(i == Integer.parseInt(nums[j]))
									System.out.println(j+1);
							}
							break;
						}
					}
					if(unique == false)
						System.out.println("0");
				}
			}
		}catch(Exception e){
			System.out.print(e);
		}
		
	}
}
