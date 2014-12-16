import java.io.*;
import java.util.*;
class PrimePalindrome{
	public static void main(String args[]){
		boolean flag;
		for(int i = 1000; i > 1; i--){
			flag = true;
			for(int j = 2 ; j <= i/2 ; j++){
				if(i%j == 0){
					flag = false;
					break;
				}
			}
			if(flag == true){
				if(String.valueOf(i).equals(new StringBuffer(String.valueOf(i)).reverse().toString())){
					System.out.print(i);
					break;
				}
			}
		}
	}
}