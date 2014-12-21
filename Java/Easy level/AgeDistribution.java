import java.io.*;
import java.util.*;
import java.lang.*;
import java.nio.ByteOrder;
class AgeDistribution{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		String line;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				int num = Integer.parseInt(line);
				if(num >=0 && num <= 2)
					System.out.println("Still in Mama's arms");
				else if(num >=3 && num <=4)
					System.out.println("Preschool Maniac");
				else if (num >=5 && num <=11)
					System.out.println("Elementary school");
				else if(num >=12 && num <=14)
					System.out.println("Middle School");
				else if(num >=15 && num <=18)
					System.out.println("High School");
				else if(num >=19 && num <=22)
					System.out.println("College");
				else if(num >=23 && num <=65)
					System.out.println("Working for the man");
				else if(num >=66 && num <=100)
					System.out.println("The Golden Years");
				else
					System.out.println("This program is for humans");
			}
		}catch(Exception e){
			System.out.print(e);
		}
		
	}
}
