import java.io.*;
import java.util.*;
import java.lang.*;
class RemoveCharacters{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				if(line!=""){
					String[] tokens = line.split(", ");
					for(int i = 0 ; i < tokens[0].length() ; i++){
						int c = tokens[0].charAt(i);
						boolean remove = false;
						for(int j = 0 ; j < tokens[1].length() ; j++){
							if(c==tokens[1].charAt(j)){
								remove = true;
								break;
							}
						}
						if(remove == false)
							System.out.print(tokens[0].charAt(i));
					}
				}
				System.out.println();
			}
		}catch(Exception e){
			System.out.print("Exception caught: " + e);
		}
		
	}
}
