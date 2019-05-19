package utils;

public class Parsers {
    public static boolean tryParseToInt(String strToParse){
        try{
            Integer.parseInt(strToParse);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}
