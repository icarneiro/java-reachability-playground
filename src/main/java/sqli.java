public class SQLi {
  String username = request.getParameter("username");
  Statement statement = connection.createStatement();  
  String query = "SELECT secret FROM Users WHERE (username = '" + username + "' AND NOT role = 'admin')";
  String query = String.format("SELECT secret FROM Users WHERE (username = '%s' AND NOT role = 'admin')", username);
  ResultSet result = statement.executeQuery(query);
}
