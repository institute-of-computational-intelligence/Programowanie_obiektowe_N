
package ML.java;


public class SqlServerConnection implements DBConnection {

    @Override
    public void Open() {
        System.out.println("Connection to SQLServer database is opening");
    }

    @Override
    public void Close() {
        System.out.println("Connection to SQLServer database is closing");
        
    }

    @Override
    public void ExecuteSQL(String sql) {
        System.out.println("The following SQL query on SQLServer database is executing: \n\n"+sql);
    }
    
}
