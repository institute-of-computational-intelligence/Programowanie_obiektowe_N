  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ML.java;

/**
 *
 * @author Student_PL
 */
public class OracleDbConnection implements DBConnection {
    
    

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
        System.out.println("The following SQL query on ORACLE database is executing: \n\n"+sql);
    }
    
}
