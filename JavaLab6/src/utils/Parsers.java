package utils;

public class Parsers {

    public Parsers() {
    }
    
    static public Boolean tryParseToInt(String arg){
        try{
            Integer.parseInt(arg);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
        
    }
}
