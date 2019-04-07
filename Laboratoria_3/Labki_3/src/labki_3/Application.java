
package labki_3;


public class Application  {
    
    protected DBConnection dbConnection;

    public Application(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
    

  void GetData(){
      String command = "SELECT * FROM data";
      dbConnection.Open();
      dbConnection.ExecuteSQL(command);
      dbConnection.Close();
  }
    
}
