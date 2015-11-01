package com.algo.datastructures.applications;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Reverser{
	private String input;
	private String output;
	
	public Reverser(String in){
		input = in;
	}
	
	public String doReverse(){
		int stackLength = input.length();
		CharacterStack oStack = new CharacterStack(stackLength);
		for(int i=0; i<stackLength; i++){
			oStack.push(input.charAt(i));
		}
		output="";
		while(!oStack.isEmpty()){
			output = output + oStack.pop();
		}
		return output;
	}
}

class ReverserApp{
	
	public static void main(String[] args) throws IOException{
		String input;
		String output;
		System.out.println("Enter you string: ");
		System.out.flush();
		input = getInputAsString();
		
		Reverser oReverser = new Reverser(input);
		output = oReverser.doReverse();
		
		System.out.println("Reversed output: " + output);
	}
	
	public static String getInputAsString() throws IOException{
		InputStreamReader inStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inStreamReader);
		String s = bufferedReader.readLine();
		return s;
	}
}
