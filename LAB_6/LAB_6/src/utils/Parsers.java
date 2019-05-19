
package utils;

public class Parsers {
    
    public Parsers(){
        
    }
    
    public static boolean tryParseToInt (String arg){
        try{
            Integer.parseInt(arg);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
}
