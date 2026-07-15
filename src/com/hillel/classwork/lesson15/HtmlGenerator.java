package com.hillel.classwork.lesson15;

public class HtmlGenerator
{
    public static void main(String[] args) {
        String html = "<html>"
                + "<body>"
                + "div"
                +" < div > Hello ! < / div > "
                +" / div "
                +" < / body > "
                +" < / html > ";
        HtmlTag div = new HtmlTag("div", "Hello!");
        HtmlTag div2 = new HtmlTag("div", div);
        HtmlTag body = new HtmlTag("body", div2);
        HtmlTag htmlTag = new HtmlTag("html", body);
        System.out.println(generateHtml(htmlTag));
    }
    public static String generateHtml(HtmlTag htmlTag){
        if(htmlTag.child != null){
            return generateHtml(htmlTag.child);
        }
        return "<"+htmlTag.name+">"+"<"+"<"+htmlTag.name+">"+"<"+htmlTag.name+">"+htmlTag.text+"</"+htmlTag.name+">"+"</"+htmlTag.name+">";
    }
}
