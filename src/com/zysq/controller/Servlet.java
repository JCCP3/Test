package com.zysq.controller;

import com.zysq.service.CoreService;
import com.zysq.util.CheckUtil;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created by rose_sunshine on 16/3/19.
 */
@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {

    private static String appID = "wxb7b48e1c35e91900";
    private static String appSecret = "278b5c83c0dfad0ba489630f89f756a4";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String respMessage = CoreService.processRequest(request);

        System.out.println(respMessage);
        PrintWriter out = response.getWriter();
        out.print(respMessage);
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");


        PrintWriter out = response.getWriter();
        out.print(echostr);

        if (CheckUtil.checkSignature(signature, timestamp, nonce)) {
            out.print(echostr);
        }
    }

}
