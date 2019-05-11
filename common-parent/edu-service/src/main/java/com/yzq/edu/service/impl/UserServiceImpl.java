package com.yzq.edu.service.impl;

import com.yzq.edu.model.User;
import com.yzq.edu.service.IUserService;
import com.yzq.edu.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {
    @Override
    public User login(String username, String password) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public User findByUuid(String uuid) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByUuid(String uuid) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public int insert(User user) {
        return 0;
    }
}
