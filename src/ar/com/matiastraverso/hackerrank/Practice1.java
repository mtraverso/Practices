package ar.com.matiastraverso.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.valueOf(br.readLine());
        for(int i = 0;i<times;i++){
            String input = br.readLine();
            System.out.println(isFunny(input.toLowerCase())?"Funny":"Not Funny");
        }
	}
	
	public static boolean isFunny(String value){
		boolean isFunny = true;
		
		
		for(int i = 0; i< value.length()-2;i++){
			int current = value.charAt(i);
			int next = value.charAt(i+1);
			int rCurrent = value.charAt(value.length()-i-1);
			int rNext = value.charAt(value.length()-i-2);
			if(Math.abs(current-next) != Math.abs(rCurrent-rNext)){
				return false;
			}
		}
		return isFunny;
	}
}
