import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class LifeCycle extends GenericServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("init() called - servlet initialized....");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Service() called - Handling request");
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        out.println("<h2> Hello bro,how are you </h2>");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy() called - servlet destroy");
    }
}
