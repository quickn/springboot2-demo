package cn.quickn.demo.service.impl;

import cn.quickn.demo.dao.UserDao;
import cn.quickn.demo.service.UserService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Json on 2018/5/30.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<JSONObject> query() {
        return userDao.list();
    }
}
