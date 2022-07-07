import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @anthor longway
 * @create 2022-07-07
 * 15:08
 */
//urlPatterns = "访问地址"
@WebServlet(urlPatterns="/demo2",loadOnStartup = 1)  //验证成功
public class ServletDemo2 implements Servlet {

    /*
    调用时机：在第一次Servlet被请求时使用
    运行次数：1次
        loadOnStartup 注解中设置init调用时机，0到负整数是默认调用，正整数是web服务器创建时调用
        //验证成功
             init....
            七月 07, 2022 3:52:50 下午 org.apache.coyote.AbstractProtocol start
            信息: Starting ProtocolHandler ["http-bio-8080"]

     */
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init....");
    }
    /*
    每次请求 service 服务时调用该方法
    请求几次就调用几次该方法
     */
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hello servlet~");
    }

    /**
     * 调用时机：内存被释放，和服务器要关闭时会调用该方法
     * 使用次数：1次
     * 当服务器要关闭时，Servlet实例要释放资源，这时候就会调用destroy方法来释放资源
     * @return
     */
    public void destroy() {
        System.out.println("啊~结束了");
    }




    public String getServletInfo() {
        return null;
    }

    public ServletConfig getServletConfig() {
        return null;
    }


}
