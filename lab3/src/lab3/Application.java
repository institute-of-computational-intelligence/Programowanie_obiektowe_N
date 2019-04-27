package lab3;

public class Application {
    private final DbConnection dbConnection;
    
    public Application(DbConnection dbConnection){
        this.dbConnection = dbConnection;
    }
    
    public void GetData(){
        dbConnection.Open();
        dbConnection.ExecuteSQL("select *from data;");
        dbConnection.Close();
    }
}                   