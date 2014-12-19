import java.io.*;
import java.util.*;
import java.lang.*;
class FirstNonRepeatedChar{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				if(line!=""){
					HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
					for(int i = 0 ; i < line.length() ; i++){
						if(map.containsKey(line.charAt(i))){
							map.put(line.charAt(i), false);
						}
						else{
							map.put(line.charAt(i), true);
						}
					}
					for(int i = 0 ; i < line.length() ; i++){
						if(map.get(line.charAt(i))==true){
							System.out.println(line.charAt(i));
							break;
						}
					}
				}
			}
		}catch(Exception e){
			System.out.print("Exception caught: " + e);
		}
		
	}
}
