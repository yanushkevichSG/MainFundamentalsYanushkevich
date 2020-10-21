package by.javatr.task1.util;

public class Hello{
    public static String message(String name){
        String str = "Hello, ";
        if(name != null){
            str += name;
        }
        else{
            str +="anonim";
        }
        return str;
    }
}