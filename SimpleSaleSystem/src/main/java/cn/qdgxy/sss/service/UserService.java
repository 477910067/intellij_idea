package cn.qdgxy.sss.service;

import cn.qdgxy.sss.po.UserCustom;

/**
 * 用户Service接口
 * create:2016-11-12 20:47
 *
 * @author 李欣
 * @version 1.0
 */
public interface UserService {

    /**
     * 登录
     *
     * @param userName 用户名
     * @param password 密码
     * @return 用户
     * @throws Exception 异常
     */
    UserCustom login(String userName, String password) throws Exception;

}


