package com.evan.swaggerdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.evan.swaggerdemo.entity.UserModel;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author EvanYang
 * @since 2020-08-30
 */
@Repository
public interface UserDao extends BaseMapper<UserModel> {

}
