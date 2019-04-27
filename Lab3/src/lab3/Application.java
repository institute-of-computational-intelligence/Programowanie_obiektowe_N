//Zadanie 1.
package lab3;

/**
 *
 * @author Student
 */
public class Application {
    
    protected DbConnection dbConnection;
    
    public Application(DbConnection dbConnection){
        this.dbConnection = dbConnection;
    }
    
void GetData(){
    String command = "SELCET * FROM data";
        dbConnection.Open();
        dbConnection.ExecuteSQL(command);
        dbConnection.Close();
}

}
