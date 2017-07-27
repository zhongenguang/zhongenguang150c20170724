package com.bawe.dao;

import com.bawe.bean.UserT;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.alibaba.druid.stat.TableStat.Mode.Insert;
import static com.alibaba.druid.stat.TableStat.Mode.Select;


/**
 * Created by 歼 on 2017/7/24.
 */
@Mapper
@Repository
public interface DaoMappsr {
    //用户名验证
    @Select(" select * from t_user where username=#{username}")
    List<UserT> select2(UserT userT);
   //登陆
    @Select(" select * from t_user where username=#{username} and password =#{password} ")
    List<UserT> select1(UserT userT);

       //注册
    @Insert("INSERT  INTO  t_user (username,password,phone,useraddress) VALUES(#{username},#{password},#{phone},#{useraddress}) ")//insert into t_user(username,password,phone) VALUES(#{username},#{password},#{phone}
    int addD(UserT userT);
}
