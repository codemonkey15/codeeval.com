import java.io.*;
import java.util.*;
class FileSize{

	public static void main(String args[]){
		File f = new File(args[0]);
		if(f.exists()){
			System.out.println(f.length());
		}
	}
}
