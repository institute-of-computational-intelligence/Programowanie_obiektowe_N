
package lab_3_1;

public class Main {


    public static void main(String[] args) 
    {
 
    // Interfaces, Dependency injection
    DbConnection oracleConnection = new OracleDbConnection();
    DbConnection sqlServerConnection = new SqlServerConnection();
    Application application = new Application(sqlServerConnection); // injection of sqlserver connection
    new Application(oracleConnection); // injection of oracle connection
    application.GetData();
    System.out.println("============================================");
    System.err.println("");
    
 
    }
}