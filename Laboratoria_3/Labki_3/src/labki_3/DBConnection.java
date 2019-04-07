
package labki_3;


public interface DBConnection {
    
    void Open();
    void Close();
    void ExecuteSQL(String sql); 
    
}
