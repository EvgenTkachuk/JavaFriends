package com.hillel.classwork.lesson15;

import java.util.List;

public class HtmlTag {
    String name;
    String text;
    HtmlTag child;
    public HtmlTag(String name, HtmlTag child){
        this.name = name;
        this.child = child;
    }
    public HtmlTag(String name,String text){
        this.name = name;
        this.text = text;
    };

}
