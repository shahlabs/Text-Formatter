package com.shahlabdhi.formatter;

import java.util.Arrays;
import java.util.Scanner;

import com.shahlabdhi.formatter.processor.Align;
import com.shahlabdhi.formatter.processor.TextFormatterProcessor;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 validateArgs(args);

         Align alignment = getAlignment(args[0]);
         int width = getWidth(args[1]);

         //getting text from user
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter text:");
         String text = scanner.nextLine();

         //call text formatter processor
         TextFormatterProcessor textFormatterProcessor = new TextFormatterProcessor(width, alignment);
         //format and print result
         System.out.println("The formatted text:");
         System.out.println(textFormatterProcessor.format(text));
    }
    
    public static void validateArgs(String[] args){
        if (args.length != 2)
            throw new IllegalArgumentException("Formatter consumes only 2 args, alignment mode and max line width");
 }
    
	 public static Align getAlignment(String arg) {
	       return Arrays.stream(Align.values()).filter(a-> a.getVal().equalsIgnoreCase(arg)).
	    		   findFirst().
	    		   orElseThrow(()-> new IllegalArgumentException("Unknow format"));
	    }
	 
	 public static int getWidth(String arg) {
	        try{
	            int width = Integer.parseInt(arg);
	            if (width <= 0)
	                throw new IllegalArgumentException("Width must be greater than 0");
	            return width;
	        } catch(NumberFormatException ex){
	            throw new IllegalArgumentException("problem converting width into number");
	        }
	    }
 
}
