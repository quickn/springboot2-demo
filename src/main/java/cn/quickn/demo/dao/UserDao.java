package cn.quickn.demo.dao;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

/**
 * Created by Json on 2018/5/30.
 */

public interface UserDao {
    public List<JSONObject> list();
}
