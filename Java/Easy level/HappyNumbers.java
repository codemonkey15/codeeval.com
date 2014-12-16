import java.io.*;
import java.util.*;
class HappyNumbers{

	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		int num;
		ArrayList<Integer> nums;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
			nums = new ArrayList<Integer>();
				num = Integer.parseInt(line);
				int sum = 0, i = 0;
				boolean flag = false;
				while(true){
					sum = 0;
					while(num > 0){
						int x = num%10;
						sum = sum + x*x;
						num = num/10;
					}
					if(num == 0){
						if(sum == 1){
							System.out.println("1");
							break;
						}
						else{
							i++;
							for(int k = 0  ; k < nums.size() ; k++){
								if(sum == nums.get(k)){
									System.out.println("0");
									flag = true;
									break;
								}
							}
							if(flag == false)
								nums.add(sum);
								num = sum;
						}
					}
					if(flag == true)
						break;
				}
			}
		}catch(Exception e){
			System.out.print("Exception caught");
		}
		
	}
}
