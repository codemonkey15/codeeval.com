import java.io.*;
import java.util.*;
class MthToLastElement{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		int pos;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			boolean found;
			while((line = br.readLine())!=null){
				String[] elements = line.split(" ");
				pos = Integer.parseInt(elements[elements.length - 1]);
				if(pos <= elements.length - 1)
					System.out.println(elements[elements.length - pos - 1]);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}