package com.evan.swaggerdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.evan.swaggerdemo.dao.UserInfoDao;
import com.evan.swaggerdemo.entity.UserInfoEntity;
import com.evan.swaggerdemo.service.UserInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserInfoSerivceImpl extends ServiceImpl<UserInfoDao, UserInfoEntity> implements UserInfoService {
}