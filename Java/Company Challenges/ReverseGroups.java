import java.io.*;
import java.util.*;
import java.lang.*;
class ReverseGroups{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		ArrayList<Integer> list;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				list = new ArrayList<Integer>();
				String[] tokens = line.split(";");
				int group = Integer.parseInt(tokens[1]);
				String[] numbers = tokens[0].split(",");
				for(int i = 0; i < numbers.length ; i++){
					list.add(Integer.parseInt(numbers[i]));
				}
				for(int i = 0; i <= numbers.length - group ; i = i + group){
					ArrayList<Integer> sublist = new ArrayList<Integer>(list.subList(i, i+group));
					Collections.reverse(sublist);
					for(int j = 0; j < group ; j++){
						list.set(i+j,sublist.get(j));
					}
				}
				boolean flag = false;
				for(int i = 0; i< list.size();i++){
					if(flag == false){
						flag = true;
						System.out.print(list.get(i));
					}
					else	
						System.out.print(","+list.get(i));
				}
				System.out.println();
			}
		}catch(Exception e){
			System.out.print("Exception caught: " + e);
		}
		
	}
}
