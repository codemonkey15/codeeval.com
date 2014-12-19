import java.io.*;
import java.util.*;
class TheMajorElement{

	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				if(!line.isEmpty()){
					int[] n = new int[101];
					String[] nums = line.split(",");
					int length = nums.length;
					for(int i = 0; i < length;i++){
						n[Integer.parseInt(nums[i])]++;
					}					
					boolean first = true, found = false;
					for(int i = 1 ; i < n.length ; i++){
						if(n[i] > length/2){
							if(first == true){
								first = false;
								found = true;
								System.out.print(i);
							}
							else{
								System.out.print(","+i);
							}
						}
					}
					if(found== false)
						System.out.print("None");
					System.out.println();
				}
			}
		}catch(Exception e){
			System.out.print(e);
		}
		
	}
}
