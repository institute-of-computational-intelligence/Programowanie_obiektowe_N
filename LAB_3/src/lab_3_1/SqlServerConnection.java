package lab_3_1;

public class SqlServerConnection implements DbConnection {
    public void Open()
    {
        System.out.println("Connection to ORACLE database is opening");
    }
    public void Close()
    {
        System.out.println("Connection to ORACLE database is closing");
    }
    public void ExecuteSQL(String sql)
    {
        System.out.println("The following SQL query on ORACLE database is executing:\n\n"+ sql);
    }
}
