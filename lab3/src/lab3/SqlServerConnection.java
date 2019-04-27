/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Student
 */
public class SqlServerConnection implements DbConnection {
    
    @Override
    public void Open() {
        System.out.println("Opening connection to database");
    }

    @Override
    public void Close() {
        System.out.println("Closing connection to database");
    }

    @Override
    public void ExecuteSQL(String sql) {
        System.out.println("Executing SQL command");
    }
}
