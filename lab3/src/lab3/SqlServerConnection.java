
package lab3;


public class SqlServerConnection  implements DbConnection{

     @Override
    public void Open() {
        System.out.println("Connected to some SQL server");
    }

    @Override
    public void Close() {
        System.out.println("Connection to SQL server has been closed.");
    }

    @Override
    public void ExecuteSQL(String sql) {
        System.out.println("Execute: " + sql);
    }

}
