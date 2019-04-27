
package ML.java;


public interface DBConnection {
    
    void Open();
    void Close();
    void ExecuteSQL(String sql); 
    
}
