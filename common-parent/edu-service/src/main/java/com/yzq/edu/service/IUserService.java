package com.yzq.edu.service;

import com.yzq.edu.model.User;
import com.yzq.edu.service.base.IBaseService;

public interface IUserService extends IBaseService<User> {
    //特有的方法
    public User login(String username, String password);

}
