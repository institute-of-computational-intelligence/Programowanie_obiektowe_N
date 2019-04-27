//Zadanie 1.
package lab3;

/**
 *
 * @author Student
 */
public class OracleDbConnection implements DbConnection {
    @Override
    public void Open(){
        System.out.println("Connection to SQL Server is openning");
    }
     @Override
    public void Close(){
        System.out.println("Connection to SQL Server is closing");
    }
     @Override
    public void ExecuteSQL(String sql){
        System.out.println("The following SQL query on SQL Server database is executing");
    }
}
