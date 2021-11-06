package com.shahlabdhi.formatter.entity;

import java.util.List;
import java.util.stream.IntStream;

public class Line {
	private final List<String> words;
	private final int numChars;

	public Line(List<String> words, int numChars) {
		super();
		this.words = words;
		this.numChars = numChars;
	}

	public List<String> getWords() {
		return words;
	}

	public int getNumChars() {
		return numChars;
	}
	
	  public String output(int[] spaces){
	        StringBuilder builder = new StringBuilder();

	        IntStream.range(0, spaces.length).forEach(si-> {
	            IntStream.range(0, spaces[si]).forEach(sn -> builder.append(" "));
	            if (si < words.size()){
	                builder.append(words.get(si));
	            }
	        });

	        return builder.toString();
	    }
}
