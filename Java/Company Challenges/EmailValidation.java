import java.io.*;
import java.util.*;
import java.lang.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class EmailValidation{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		ArrayList<Integer> list;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				Pattern pattern = Pattern.compile("[A-Za-z0-9]+([[.]|[_]]?[_A-Za-z0-9-]+)[@][a-zA-Z][a-zA-Z0-9]*(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
				Matcher matcher = pattern.matcher(line);
				if(matcher.find()){
					System.out.println("true");
				}
				else
					System.out.println("false");
			}
		}catch(Exception e){
			System.out.print("Exception caught: " + e);
		}
		
	}
}
