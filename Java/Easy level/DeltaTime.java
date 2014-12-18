import java.io.*;
import java.util.*;	
import java.lang.*;
class DeltaTime{
	public static void main(String args[]){
		FileReader fr = null;
		BufferedReader br;
		int num, rev_num, result, iter=0;
		String line;
		int[] time1 = new int[3];
		int[] time2 = new int[3];
		int[] diff = new int[3];
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			boolean found;
			while((line = br.readLine())!=null){
				String[] tokens = line.split(" ");
				//System.out.println(tokens[0]);
				//System.out.println(tokens[1]);
				time1[2] = Integer.parseInt(tokens[0].trim().substring(6,8));
				time1[1] = Integer.parseInt(tokens[0].trim().substring(3,5));
				time1[0] = Integer.parseInt(tokens[0].trim().substring(0,2));
				
				int cum_time1 = time1[2]+time1[1]*60 + time1[0]*60*60;
				
				time2[2] = Integer.parseInt(tokens[1].trim().substring(6,8));
				time2[1] = Integer.parseInt(tokens[1].trim().substring(3,5));
				time2[0] = Integer.parseInt(tokens[1].trim().substring(0,2));
				
				int cum_time2 = time2[2]+time2[1]*60 + time2[0]*60*60;
				
				int cum_diff = Math.abs(cum_time1-cum_time2);
				
				diff[0] = cum_diff/(60*60);
				cum_diff = cum_diff%(60*60);
				diff[1] = cum_diff/60;
				cum_diff = cum_diff%60;
				diff[2] = cum_diff;
				
				System.out.format("%02d:%02d:%02d", diff[0], diff[1], diff[2]);
				System.out.println();
			}
		}catch(Exception e){
			System.out.print("Exception caught: " + e);
		}
		
	}
}
