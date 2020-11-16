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
            list.add(new Phone("iPhone" , "ƻ��"));
            list.add(new Phone("HuaWei" , "��Ϊ"));
            list.add(new Phone("XiaoMi" , "С��"));
        }else if(level.equals("2")) {
            if(first.equals("iPhone")) {
                list.add(new Phone("iPhone1" , "ƻ��iPhoneX"));
                list.add(new Phone("iPhone2" , "ƻ��iPhoneXS"));
                list.add(new Phone("iPhone3" , "ƻ��iPhone11"));
                list.add(new Phone("iPhone4" , "ƻ��iPhone12"));
                list.add(new Phone("other" , "..."));
            }else if(first.equals("HuaWei")){
                list.add(new Phone("HuaWei1" , "��ΪMate20"));
                list.add(new Phone("HuaWei2" , "��ΪP40"));
                list.add(new Phone("HuaWei3" , "��Ϊnova SE"));
                list.add(new Phone("HuaWei4" , "��Ϊ����20"));
                list.add(new Phone("other" , "..."));
            }
            else if(first.equals("XiaoMi")){
                list.add(new Phone("XiaoMi1" , "С��9"));
                list.add(new Phone("XiaoMi2" , "С��Play"));
                list.add(new Phone("XiaoMi3" , "С��CC9"));
                list.add(new Phone("XiaoMi4" , "С��10"));
                list.add(new Phone("other" , "..."));
            }
        }
        String json = JSON.toJSONString(list);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(json);
    }
}
