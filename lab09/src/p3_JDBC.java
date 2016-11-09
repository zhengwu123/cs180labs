import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

/**
 * Created by wu673 on 11/1/16.
 */
public class p3_JDBC {


   /*     public static void run() {

            Connection conn = new Connection() {
                @Override
                public Statement createStatement() throws SQLException {
                    return null;
                }

                @Override
                public PreparedStatement prepareStatement(String s) throws SQLException {
                    return null;
                }

                @Override
                public CallableStatement prepareCall(String s) throws SQLException {
                    return null;
                }

                @Override
                public String nativeSQL(String s) throws SQLException {
                    return null;
                }

                @Override
                public void setAutoCommit(boolean b) throws SQLException {

                }

                @Override
                public boolean getAutoCommit() throws SQLException {
                    return false;
                }

                @Override
                public void commit() throws SQLException {

                }

                @Override
                public void rollback() throws SQLException {

                }

                @Override
                public void close() throws SQLException {

                }

                @Override
                public boolean isClosed() throws SQLException {
                    return false;
                }

                @Override
                public DatabaseMetaData getMetaData() throws SQLException {
                    return null;
                }

                @Override
                public void setReadOnly(boolean b) throws SQLException {

                }

                @Override
                public boolean isReadOnly() throws SQLException {
                    return false;
                }

                @Override
                public void setCatalog(String s) throws SQLException {

                }

                @Override
                public String getCatalog() throws SQLException {
                    return null;
                }

                @Override
                public void setTransactionIsolation(int i) throws SQLException {

                }

                @Override
                public int getTransactionIsolation() throws SQLException {
                    return 0;
                }

                @Override
                public SQLWarning getWarnings() throws SQLException {
                    return null;
                }

                @Override
                public void clearWarnings() throws SQLException {

                }

                @Override
                public Statement createStatement(int i, int i1) throws SQLException {
                    return null;
                }

                @Override
                public PreparedStatement prepareStatement(String s, int i, int i1) throws SQLException {
                    return null;
                }

                @Override
                public CallableStatement prepareCall(String s, int i, int i1) throws SQLException {
                    return null;
                }

                @Override
                public Map<String, Class<?>> getTypeMap() throws SQLException {
                    return null;
                }

                @Override
                public void setTypeMap(Map<String, Class<?>> map) throws SQLException {

                }

                @Override
                public void setHoldability(int i) throws SQLException {

                }

                @Override
                public int getHoldability() throws SQLException {
                    return 0;
                }

                @Override
                public Savepoint setSavepoint() throws SQLException {
                    return null;
                }

                @Override
                public Savepoint setSavepoint(String s) throws SQLException {
                    return null;
                }

                @Override
                public void rollback(Savepoint savepoint) throws SQLException {

                }

                @Override
                public void releaseSavepoint(Savepoint savepoint) throws SQLException {

                }

                @Override
                public Statement createStatement(int i, int i1, int i2) throws SQLException {
                    return null;
                }

                @Override
                public PreparedStatement prepareStatement(String s, int i, int i1, int i2) throws SQLException {
                    return null;
                }

                @Override
                public CallableStatement prepareCall(String s, int i, int i1, int i2) throws SQLException {
                    return null;
                }

                @Override
                public PreparedStatement prepareStatement(String s, int i) throws SQLException {
                    return null;
                }

                @Override
                public PreparedStatement prepareStatement(String s, int[] ints) throws SQLException {
                    return null;
                }

                @Override
                public PreparedStatement prepareStatement(String s, String[] strings) throws SQLException {
                    return null;
                }

                @Override
                public Clob createClob() throws SQLException {
                    return null;
                }

                @Override
                public Blob createBlob() throws SQLException {
                    return null;
                }

                @Override
                public NClob createNClob() throws SQLException {
                    return null;
                }

                @Override
                public SQLXML createSQLXML() throws SQLException {
                    return null;
                }

                @Override
                public boolean isValid(int i) throws SQLException {
                    return false;
                }

                @Override
                public void setClientInfo(String s, String s1) throws SQLClientInfoException {

                }

                @Override
                public void setClientInfo(Properties properties) throws SQLClientInfoException {

                }

                @Override
                public String getClientInfo(String s) throws SQLException {
                    return null;
                }

                @Override
                public Properties getClientInfo() throws SQLException {
                    return null;
                }

                @Override
                public Array createArrayOf(String s, Object[] objects) throws SQLException {
                    return null;
                }

                @Override
                public Struct createStruct(String s, Object[] objects) throws SQLException {
                    return null;
                }

                @Override
                public void setSchema(String s) throws SQLException {

                }

                @Override
                public String getSchema() throws SQLException {
                    return null;
                }

                @Override
                public void abort(Executor executor) throws SQLException {

                }

                @Override
                public void setNetworkTimeout(Executor executor, int i) throws SQLException {

                }

                @Override
                public int getNetworkTimeout() throws SQLException {
                    return 0;
                }

                @Override
                public <T> T unwrap(Class<T> aClass) throws SQLException {
                    return null;
                }

                @Override
                public boolean isWrapperFor(Class<?> aClass) throws SQLException {
                    return false;
                }
            };
            try {
                Statement stat = conn.createStatement();
                stat.executeUpdate(
                        "CREATE TABLE Greetings (Message CHAR(20))");
                stat.executeUpdate(
                        "INSERT INTO Greetings VALUES ('Hello, World!')");
                ResultSet result =
                        stat.executeQuery(
                                "SELECT * FROM Greetings");
                while (result.next())
                    System.out.println(result.getString(1));
                result.close();
                stat.executeUpdate("DROP TABLE Greetings");
            } catch (Exception e){
                e.printStackTrace();
            }

            finally {

                conn.close();
            }
        }

    public static Connection getConnection()
            throws SQLException, IOException
    {
        Properties props = new Properties();
        FileInputStream in = new FileInputStream(
                "database.properties");
        props.load(in);
        in.close();
        String drivers =
                props.getProperty("jdbc.drivers");
        if (drivers != null)
            System.setProperty("jdbc.drivers", drivers);
        String url = props.getProperty("jdbc.url");
        String username =
                props.getProperty("jdbc.username");
        String password =
                props.getProperty("jdbc.password");
        return DriverManager.getConnection(
                url, username, password);
    }
    */
}
