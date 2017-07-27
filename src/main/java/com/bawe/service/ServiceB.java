package com.bawe.service;

import com.bawe.bean.UserT;
import com.bawe.dao.DaoMappsr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 歼 on 2017/7/24.
 */
@Service("serviceB")
public class ServiceB implements ServiceA{

    @Autowired
    private DaoMappsr dao;


    @Override
    public List<UserT> select1(UserT userT) {
        return dao.select1(userT);
    }

    @Override
    public int addD(UserT userT) {
        return dao.addD(userT);
    }

    @Override
    public List<UserT> select2(UserT userT) {
        return dao.select2(userT);
    }
}
