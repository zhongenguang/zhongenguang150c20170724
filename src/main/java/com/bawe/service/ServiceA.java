package com.bawe.service;

import com.bawe.bean.UserT;

import java.util.List;

/**
 * Created by 歼 on 2017/7/24.
 */
public interface ServiceA {
    List<UserT> select1(UserT userT);//登陆
    int addD(UserT userT);//注册
    List<UserT> select2(UserT userT);//用户名雁阵


}
