import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @anthor longway
 * @create 2022-07-07
 * 15:08
 */
@WebServlet("/demo1")
public class ServletDemo1 implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hello servlet~");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
