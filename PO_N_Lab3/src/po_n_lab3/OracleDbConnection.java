/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po_n_lab3;

/**
 *
 * @author Notebook
 */
public class OracleDbConnection implements DbConnection {

    @Override
    public void Open() {
        System.out.println("Connection to ORACLE database is opening");
    }

    @Override
    public void Close() {
        System.out.println("Connection to ORACLE database is closing");
    }

    @Override
    public void ExecuteSQL(String sql) {
        System.out.println(String.format("The following SQL query on ORACLE database is executing: \r\n %s", sql));
    }

}
