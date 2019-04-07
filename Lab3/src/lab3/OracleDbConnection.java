package lab3;

public class OracleDbConnection implements DbConnection {

    @Override
    public void Open() {
        System.out.println("Connection to Oracle Data Base");
    }

    @Override
    public void Close() {
        System.out.println("Connection to Oracle DB has been closed");
    }

    @Override
    public void ExecuteSQL(String sql) {
        System.out.println("Executing: " + sql);
    }
}
