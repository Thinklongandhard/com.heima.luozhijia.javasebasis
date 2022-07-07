import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * @anthor longway
 * @create 2022-07-07
 * 17:29
 */

/**
 * 这就是相当于HttpServlet的请求处理方式
 */
@WebServlet(urlPatterns = {"/demo5","/demo6"})
public class ServletDemo5 extends MyHttpServlet{
    //
    @Override
    protected void doGet(ServletRequest req, ServletResponse res) {
        System.out.println("get。。。。。");
    }


    @Override
    protected void doPost(ServletRequest req, ServletResponse res) {
        System.out.println("post。。。。");
    }
}
