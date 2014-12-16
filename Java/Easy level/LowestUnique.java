import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class LowestUnique{

	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		ArrayList<Integer> list;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				if(!line.isEmpty()){
					list = new ArrayList<Integer>();
					String[] nums = line.split(" ");
					for(int i = 0; i < nums.length;i++){
						list.add(Integer.parseInt(nums[i]));
					}
					Collections.sort(list);
					int lowest= list.get(0);
					boolean flag = false;
					for(int i = 1; i < list.size();i++){
						if(lowest != list.get(i)){
							lowest = list.get(i);
							if(lowest != list.get(i+1)){
								System.out.println(i);
								flag = true;
							}
						}	
					}
					if(flag = false)
						System.out.println("0");
				}
				System.out.println();
			}
		}catch(Exception e){
			System.out.print(e);
		}
		
	}
}
