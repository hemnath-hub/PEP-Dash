public class UserModel {
  private String name;
  private String role;
  private int year;

  public UserModel(String name, String role, int year) {
    this.name = name;
    this.role = role;
    this.year = year;
  }

  // Getters and setters (optional for Gson)
}
