import java.io.*;
import java.util.*;
class MultiplicationTable{
	public static void main(String args[]){
		for(int i = 1 ; i <= 12 ; i++){
			for(int j = 1 ; j <= 12 ; j++){
				System.out.format("%4d",j*i);
			}
			System.out.println();
		}
	}
}