package com.newto.hello;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("Hey")
public class HelloServlet extends HttpServlet {
    //Any request sent to servlet class runs this method

    public void service(ServletRequest request, ServletResponse response)throws IOException{
        doGet(request,response);
    }

    protected void doGet(ServletRequest request, ServletResponse response) throws IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.println("This is my first Servelet");
    }
    protected void doPost(ServletRequest request, ServletResponse response) throws IOException {
        PrintWriter printWriter = response.getWriter();
        printWriter.println("This is another Servelet");
    }

}
