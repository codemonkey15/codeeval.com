import java.io.*;
import java.util.*;
import java.lang.*;
class RollerCoaster{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		ArrayList<Integer> list;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				boolean even = true;
				for(int i = 0 ; i < line.length() ; i++){
					if(even==true && Character.isLetter(line.charAt(i))){
						System.out.print(Character.toUpperCase(line.charAt(i)));
						even = false;
					}
					else if(even==false && Character.isLetter(line.charAt(i))){
						System.out.print(Character.toLowerCase(line.charAt(i)));
						even = true;
					}
					else
						System.out.print(line.charAt(i));
				}
				System.out.println();
			}
		}catch(Exception e){
			System.out.print("Exception caught: " + e);
		}
		
	}
}
