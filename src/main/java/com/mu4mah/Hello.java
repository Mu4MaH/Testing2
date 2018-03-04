package com.mu4mah;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Hello extends HttpServlet{
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
        throws IOException {
        httpServletResponse.sendError(32765, "Author don't know JAVA!!! .. yet");
        
       // httpServletResponse.getWriter().print("Hello .. or not hello");
    }

}
