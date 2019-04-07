package lab3;

public interface DbConnection {
    void Open();
    void Close();
    void ExecuteSQL(String sql);
}
