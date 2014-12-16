import java.io.*;
import java.util.*;
class SumOfPrimes{
	public static void main(String args[]){
		int sum = 0, k = 1;
		boolean flag;
		int i = 2;
		while(k<=1000){
			while(i!=0){
				flag = true;
				for(int j = 2 ; j < i ; j++){
					if(i%j == 0){
						flag = false;
						break;
					}
				}
				if(flag == true){
					sum = sum + i;
					k++;
					i++;
					break;
				}
				i++;
			}
		}
		System.out.println(sum);
	}
}