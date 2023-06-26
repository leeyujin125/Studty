package net.hbi.day0622;

import java.util.StringTokenizer;

public class Level0 {
	public static void main(String[] args) {
		String st1 = "2+3x7=23";
		StringTokenizer st = new StringTokenizer(st1, "+x=", true);
		
		int i = 1;
		while(st.hasMoreTokens()) {
			System.out.print(" "+st.nextToken()+" ");
			i++;
		}
		
	}//main
}//Test
