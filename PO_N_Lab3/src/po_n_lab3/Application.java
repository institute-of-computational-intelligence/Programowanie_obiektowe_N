/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po_n_lab3;

/**
 *
 * @author Notebook
 */
public class Application {

    private final DbConnection dbConnection;
    
    public Application(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void GetData() {
        dbConnection.Open();
        dbConnection.ExecuteSQL("SELECT * FROM data");
        dbConnection.Close();
    }
}
