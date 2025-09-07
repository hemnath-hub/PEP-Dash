@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("application/json");
    PrintWriter out = response.getWriter();

    UserModel user = new UserModel("Hemnath", "Analyst", 2025);
    String json = new Gson().toJson(user);
    out.print(json);
    out.flush();
  }
}
