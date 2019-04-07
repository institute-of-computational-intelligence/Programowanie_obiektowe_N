package lab_3_1;

public class Application {
    DbConnection DbConnection;

    public Application(DbConnection DbConnection) {
        this.DbConnection = DbConnection;
    }
    
    void GetData()
    {
        String Command ="SELECT * FROM data";
        DbConnection.Open();
        DbConnection.ExecuteSQL(Command);
        DbConnection.Close();
    }
}
