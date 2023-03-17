import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class RestfullApi {
    class.forName("com.mysql.jdbc.Driver");
    Connection cn = DriverManager.getConnection("mysql://localhost:3306/employee", "remote","123456")
    Statement st = cn.createStatement();
    ResultSet rs = st.executeQuery("Select * from Employee");
    while(rs.next())
        System.out.println(rs.string(1));
}
