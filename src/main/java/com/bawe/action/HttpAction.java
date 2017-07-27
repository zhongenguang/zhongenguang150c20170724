package com.bawe.action;

import com.bawe.bean.UserT;
import com.bawe.service.ServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by 歼 on 2017/7/24.
 */                          //   {其中过 用户名验证 和手机号验证}
@Controller// 进入注册页面 走n{addD}action 跳入登录页面 走{select1}action 跳入展示页面
public class HttpAction {

    @Autowired
    public ServiceA se;


    @RequestMapping("se")
    public String se(UserT userT, Model model){

        return "my";
    }

      @RequestMapping("select2")//用户名验证
     public void selecrt2(UserT userT, HttpServletResponse response) throws IOException {
         List<UserT> userTS = se.select2(userT);

     int a=0;
        if (userTS.size()>0){

             a=1;
        }else {

            a=0;
        }
         PrintWriter writer = response.getWriter();
         writer .print(a);
         writer.flush();
         writer.close();

     }

       @RequestMapping("select1")//登陆u
      public String select1(UserT userT, Model model){
           String d ="";
           List<UserT> userTS = se.select1(userT);

                    if (userTS.size()>0){
                       model.addAttribute("userTS",userTS);
                        model.addAttribute("user",userTS.get(0).getUsername() );
              d="xian";
                    }

           return d;
      }

    @RequestMapping("addD")//注册
    public String addD1(UserT userT, Model model){

        int i = se.addD(userT);

        return "dup";
    }


}
