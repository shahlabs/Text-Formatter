package com.shahlabdhi.formatter.algorithm.split;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.shahlabdhi.formatter.entity.Line;

public class WordsTextSplitter implements TextSplitter {

	 private final int width;
	 
	 
	 
	  public WordsTextSplitter(int width) {
		super();
		this.width = width;
	}



	@Override
	    public List<Line> split(String text) {
		 List<Line> result = new ArrayList<>();
	     List<String> wordsList = new LinkedList<>();
	     int numChars = 0;

	        String [] words = text.trim().split(" ");
	        for (String word : words){
	        	
	        	if (numChars + word.length() > width) { 
	        		  result.add(new Line(wordsList, numChars - wordsList.size()));
	                  wordsList = new LinkedList<>();
	                  numChars = 0;
	        	}
	        	//adding space
	        	  numChars += word.length() + 1;
	        	  wordsList.add(word);
	        }
	        
	        if (!wordsList.isEmpty()){
	            result.add(new Line(wordsList, numChars - wordsList.size()));
	        }

	     return result;
	     
	  }
}
