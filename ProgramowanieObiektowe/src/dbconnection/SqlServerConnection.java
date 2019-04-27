/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

/**
 *
 * @author Student
 */
public class SqlServerConnection implements DbConnection{

    @Override
    public void Open() {
           System.out.println("Open Sql Server Connection");
    }

    @Override
    public void Close() {
         System.out.println("Close Sql Server Connection");   
    }

    @Override
    public void ExecuteSQL(String sql) {
        System.out.println("Execute Sql using Sql Server Connection");    
    }
    
}
