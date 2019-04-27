
package ML.java;


public class ML.java {

   
    public static void main(String[] args) {
        DBConnection oracleConnection = new OracleDbConnection();
        DBConnection sqlServerConnection = new SqlServerConnection();
        
        Application application =
        //new Application(sqlServerConnection); // injection of sqlserver connection
        new Application(oracleConnection); // injection of oracle connection
        application.GetData();
        System.out.println("============================================");
        System.err.println("");

    }
    
}
