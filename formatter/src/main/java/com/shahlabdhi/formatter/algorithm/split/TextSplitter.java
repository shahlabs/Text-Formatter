package com.shahlabdhi.formatter.algorithm.split;

import com.shahlabdhi.formatter.entity.Line;
import java.util.List;

public interface TextSplitter {

	 List<Line> split(String text);
}
