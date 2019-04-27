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
public class Application {
    private DbConnection dbConnection;

    public Application(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
    
    public void GetData(){
    dbConnection.Open();
    dbConnection.ExecuteSQL("SELECT * FROM blabla");
    dbConnection.Close();
    
    }
}
