package com.algo.datastructures.applications;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DelimiterChecker {
	private String input;
	public DelimiterChecker(String in){
		input = in;
	}
	public void check(){
		int inputLength = input.length();
		CharacterStack oStack = new CharacterStack(inputLength);
		for(int j=0; j<inputLength; j++){
			char ch = input.charAt(j);
			switch(ch){
				case '[':
				case '{':
				case '(':
					oStack.push(ch);
					break;
				case ']':
				case '}':
				case ')':
					if(!oStack.isEmpty()){
						char chx = oStack.pop();
						if((ch==']' && chx!='[') || (ch=='}' && chx!='{') || (ch==')' && chx!='(')){
							System.out.println("Error: Could not match opening of: " + ch + " at index: " + j);
						}
					}else{
						System.out.println("Error: Stack prematurely empty");
					}
					break;
				default:
					break;
			}
		}
		if(!oStack.isEmpty()){
			System.out.println("Error: Last delimiter that hasn't been closed: " + oStack.peek());
		}
	}
}

class DelimiterCheckerApp{
	public static void main(String[] args) throws IOException{
		String input;
		System.out.println("Enter you string: ");
		System.out.flush();
		input = getInputAsString();
		
		DelimiterChecker oDelimiterChecker = new DelimiterChecker(input);
		oDelimiterChecker.check();
	}
	
	public static String getInputAsString() throws IOException{
		InputStreamReader inStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inStreamReader);
		String s = bufferedReader.readLine();
		return s;
	}
}
