package com.shahlabdhi.formatter.algorithm.formatter;

import java.util.List;
import java.util.stream.IntStream;

import com.shahlabdhi.formatter.entity.Line;
import com.shahlabdhi.formatter.exception.CustomException;
import com.shahlabdhi.formatter.processor.Align;

public interface Alignment {
	 int[] pad(Line line, int width, int totalLines, int lineIdx);

	 default String iterateLines(List<Line> lines, int width){
	        StringBuilder builder = new StringBuilder();

	        //for each line:
	        //output line bt evaluating padding and width
	        IntStream.range(0, lines.size()).forEach(
	                i-> builder
	                        .append(lines.get(i).output(pad(lines.get(i), width, lines.size(), i)))
	                        .append("\n"));
	        return builder.toString();
	    }
	 
	
	public static Alignment getTextAlignment(Align alignment){
        switch (alignment){
        case LEFT_ALIGN:
            return new LeftAlignment();
        case RIGHT_ALIGN:
            return  new RightAlignment();
        case CENTER:
            return new CenterAlignment();
        default:
            throw new CustomException("Unsupported text alignment algorithm");
    }
}
}
