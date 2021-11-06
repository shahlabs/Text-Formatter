package com.shahlabdhi.formatter.processor;

import com.shahlabdhi.formatter.algorithm.formatter.Alignment;
import com.shahlabdhi.formatter.algorithm.split.TextSplitter;
import com.shahlabdhi.formatter.algorithm.split.WordsTextSplitter;

public class TextFormatterProcessor {
	  private final Alignment textAlignment;

	    private final TextSplitter textSplitter;

	    private final int width;
	    
	    public TextFormatterProcessor(int width, Align alignment){
	        this.width = width;
	        this.textSplitter = new WordsTextSplitter(this.width);
	        this.textAlignment = Alignment.getTextAlignment(alignment);
	     }

	     public String format(String text){
	         return textAlignment.iterateLines(textSplitter.split(text), width);
	     }
}
