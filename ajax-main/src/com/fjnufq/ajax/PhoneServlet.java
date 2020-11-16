package com.fjnufq.ajax;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-11-16 12:58
 */
@WebServlet("/phone")
public class PhoneServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public PhoneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String level = request.getParameter("level");
        String first = request.getParameter("first");
        List list = new ArrayList();
        if(level.equals("1")) {
            list.add(new Phone("iPhone" , "苹果"));
            list.add(new Phone("HuaWei" , "华为"));
            list.add(new Phone("XiaoMi" , "小米"));
        }else if(level.equals("2")) {
            if(first.equals("iPhone")) {
                list.add(new Phone("iPhone1" , "苹果iPhoneX"));
                list.add(new Phone("iPhone2" , "苹果iPhoneXS"));
                list.add(new Phone("iPhone3" , "苹果iPhone11"));
                list.add(new Phone("iPhone4" , "苹果iPhone12"));
                list.add(new Phone("other" , "..."));
            }else if(first.equals("HuaWei")){
                list.add(new Phone("HuaWei1" , "华为Mate20"));
                list.add(new Phone("HuaWei2" , "华为P40"));
                list.add(new Phone("HuaWei3" , "华为nova SE"));
                list.add(new Phone("HuaWei4" , "华为畅享20"));
                list.add(new Phone("other" , "..."));
            }
            else if(first.equals("XiaoMi")){
                list.add(new Phone("XiaoMi1" , "小米9"));
                list.add(new Phone("XiaoMi2" , "小米Play"));
                list.add(new Phone("XiaoMi3" , "小米CC9"));
                list.add(new Phone("XiaoMi4" , "小米10"));
                list.add(new Phone("other" , "..."));
            }
        }
        String json = JSON.toJSONString(list);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(json);
    }
}
