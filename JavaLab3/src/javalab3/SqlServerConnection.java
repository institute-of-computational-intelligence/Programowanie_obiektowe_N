package javalab3;

/**
 *
 * @author PC
 */
public class SqlServerConnection implements DbConnection{

    @Override
    public void Open() {
        System.out.println("Connection open");
    }

    @Override
    public void Close() {
         System.out.println("Connection close");
    }

    @Override
    public void ExecuteSQL(String sql) {
        System.out.println("Execute SQL: " + sql);
    }
    
}
