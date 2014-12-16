import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class CalculateDistance{

	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		StringTokenizer st;
		String pattern = "\\((.*?)\\)";
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				if(!line.isEmpty()){
					String[] tokens = line.split("[()]");
					String[] op1 = tokens[1].split(", ");
					String[] op2 = tokens[3].split(", ");
					Double distance = Math.sqrt((Math.pow((Double.parseDouble(op1[0]) - Double.parseDouble(op2[0])),2.0) + Math.pow((Double.parseDouble(op1[1]) - Double.parseDouble(op2[1])),2.0)));
					System.out.println((int)Math.round(distance));
				}
			}
		}catch(Exception e){
			System.out.print(e);
		}
		
	}
}
