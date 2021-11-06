package com.shahlabdhi.formatter.processor;

public enum Align {
    LEFT_ALIGN("left"), RIGHT_ALIGN("right"), CENTER("center");

    private final String val;
    
    Align(String val){
    	this.val = val;
    }
    
    public String getVal(){
        return this.val;
    }
}