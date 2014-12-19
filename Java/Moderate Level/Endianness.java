import java.io.*;
import java.util.*;
import java.lang.*;
import java.nio.ByteOrder;
class Endianness{
	public static void main(String args[]){
		if(ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN))
			System.out.println("BigEndian");
		else
			System.out.println("LittleEndian");
	}
}
