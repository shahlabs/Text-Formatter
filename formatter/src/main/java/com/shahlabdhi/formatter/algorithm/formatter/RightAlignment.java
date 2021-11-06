package com.shahlabdhi.formatter.algorithm.formatter;

import com.shahlabdhi.formatter.entity.Line;

public class RightAlignment implements Alignment {

	@Override
	public int[] pad(Line line, int width, int totalLines, int lineIdx) {
		   int[] padding = new int[line.getWords().size() + 1];
	        for (int i = 0; i < padding.length; i++){
	            if (i == 0) {
	                padding[i] =  width - (line.getNumChars() + line.getWords().size() - 1);
	            }else if (i == padding.length - 1) {
	                padding[i] = 0;
	            }else{
	                padding[i] = 1;
	            }
	        }
	        return padding;
	}

}
