/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

/**
 *
 * @author Student
 */
public class Application  {

    private final DbConnection dbConnection;
    
    public Application(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
    
    
    void getData(){
        dbConnection.Open();
        dbConnection.Close();
        dbConnection.ExecuteSQL("SELECT * FROM data");
    }
    
    
    public static void main(String[] args) {
        
        DbConnection dbConnection = new OracleDbConnection();
        
        new Application(dbConnection).getData();
    }
        
}
