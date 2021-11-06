package com.shahlabdhi.formatter.algorithm.formatter;

import com.shahlabdhi.formatter.entity.Line;

public class CenterAlignment implements Alignment {

	@Override
	public int[] pad(Line line, int width, int totalLines, int lineIdx) {
		  int[] padding = new int[line.getWords().size() + 1];
	        int pad = (width - line.getNumChars() + line.getWords().size() -1) / 2;

	        for (int i = 0; i < padding.length; i++){
	            if (i == 0) {
	                padding[i] = pad;
	            }else if (i == padding.length - 1) {
	                padding[i] = pad;
	            }else{
	                padding[i] = 1;
	            }
	        }
	        return padding;
	}

}
