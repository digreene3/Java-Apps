package main.logic;

import java.util.ArrayList;
import java.util.Arrays;

public class PLLogic {

	private String input;
	private String output;
	private ArrayList<String> inputArray;
	
	public PLLogic(String input){
		setInput(input);
		setInputArray(new ArrayList<String>());
		parse();
		toPigLatin();
	}
	
	public String toPigLatin(String input){
		String toPL = "";
		char firstLetter = input.charAt(0);
		char secondLetter = input.charAt(1);
		String afterFirst = input.substring(1,input.length());
		String afterSecond = input.substring(2,input.length());
		if(input.length()==2){
			toPL = afterFirst + firstLetter + "ay" ;
		}
		else if(firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u'){
			toPL = afterFirst + "way";
		}
		else if(!(secondLetter == 'a' || secondLetter == 'e' || secondLetter == 'i' || secondLetter == 'o' || secondLetter == 'u')){
			toPL = afterSecond  + firstLetter + secondLetter + "ay";
		}
		else{
			toPL = afterFirst + firstLetter + "ay" ;
		}
		return toPL;
	}
	
	public void toPigLatin(){
		String toPL = "";
		for(String word:inputArray){
			toPL += toPigLatin(word);
			toPL += " ";
		}
		setOutput(toPL);
	}
	public void parse(){
		String delims = "[ ]";
		inputArray =  new ArrayList<String>(Arrays.asList(input.split(delims)));
	}
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}

	public ArrayList<String> getInputArray() {
		return inputArray;
	}

	public void setInputArray(ArrayList<String> inputArray) {
		this.inputArray = inputArray;
	}
	
	
	
	
}
