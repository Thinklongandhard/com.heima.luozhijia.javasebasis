import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @anthor longway
 * @create 2022-07-07
 * 15:08
 */
//自己的请求协议，将get 和 post两种请求进行封装，让所有Servlet都可以进行访问
    //不需要进行设置访问路径
public class MyHttpServlet implements Servlet {


    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        //要获取到所有的请求
        HttpServletRequest request = (HttpServletRequest) req;

        //获取请求方式
        String method = request.getMethod();

        //判断是什么方式
        if ("GET".equals(method)){
            //这里是get请求方式
            doGet(req,res);
        }else if ("POST".equals(method)){
            //这里是post请求方式
            doPost(req,res);
        }
    }

    //设置为子类可以访问
    protected void doPost(ServletRequest req, ServletResponse res) {
        //处理post请求方式
        System.out.println("post。。。。");
    }

    //设置为子类可以访问
    protected void doGet(ServletRequest req, ServletResponse res) {
        //处理get请求方式
        System.out.println("get。。。。");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
