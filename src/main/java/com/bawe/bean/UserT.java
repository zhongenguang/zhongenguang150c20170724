package com.bawe.bean;

import lombok.Data;

/**
 * Created by 歼 on 2017/7/24.
 */
@Data//getset 注解
public class UserT {
     //表单属性
      private Integer id;
      private  String username;
      private String  password;
      private String  phone;
      private String useraddress;



}
