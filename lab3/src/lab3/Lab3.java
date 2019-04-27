/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Student
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DbConnection oracleConnection = new OracleDbConnection();
 DbConnection sqlServerConnection = new SqlServerConnection();
 Application application =
 //new Application(sqlServerConnection); // injection of sqlserver connection
 new Application(oracleConnection); // injection of oracle connection
 application.GetData();
 System.out.println("============================================");
 System.err.println("");

    }
    
}
