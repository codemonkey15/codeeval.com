import java.io.*;
import java.util.*;
class SetIntersection{

	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		int length;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				String[] sets = line.split(";");	
				String[] set1 = sets[0].split(",");
				String[] set2 = sets[1].split(",");
				int j = 0;
				boolean flag = false;
				for(int i = 0; i < set1.length ; i++ ){
					/*while(Integer.parseInt(set1[i]) < Integer.parseInt(set2[j])){
						i++;
						if(i == set1.length-1)
							break;
					}*/
					while(Integer.parseInt(set1[i]) > Integer.parseInt(set2[j])){
						j++;
						if(j == set2.length-1)
							break;
					}
					if(j == (set2.length-1)){
						System.out.println();
						break;
					}
					if(Integer.parseInt(set1[i]) == Integer.parseInt(set2[j])){
						if(!flag){
							System.out.print(Integer.parseInt(set1[i]));
							flag = true;
						}
						else
							System.out.print(","+Integer.parseInt(set1[i]));
					}
				}
				System.out.println();
			}
		}catch(Exception e){
			System.out.print("Exception caught: "+e);
		}
	}
}
