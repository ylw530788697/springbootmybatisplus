package com.evan.swaggerdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.evan.swaggerdemo.entity.UserModel;
import com.evan.swaggerdemo.dao.UserDao;
import com.evan.swaggerdemo.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author EvanYang
 * @since 2020-08-30
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, UserModel> implements IUserService {

}
