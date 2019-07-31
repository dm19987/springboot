package com.qianfeng.mybatis.service.impl;

import com.qianfeng.mybatis.entity.TUser;
import com.qianfeng.mybatis.mapper.TUserMapper;
import com.qianfeng.mybatis.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private TUserMapper userMapper;

    @Override
    public TUser getUserById(long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
