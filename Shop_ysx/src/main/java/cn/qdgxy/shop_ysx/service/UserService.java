package cn.qdgxy.shop_ysx.service;

import cn.qdgxy.shop_ysx.dao.UserDao;
import cn.qdgxy.shop_ysx.exception.MyException;
import cn.qdgxy.shop_ysx.mapper.UserMapper;
import cn.qdgxy.shop_ysx.pojo.UserCustom;

/**
 * Created by 于善心 on 2016/11/25.
 */
public class UserService {

    private UserDao userDao = new UserDao();

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 用户
     * @throws Exception 异常
     */
    public UserCustom login(String username, String password) throws Exception {
        UserCustom userCustom = userDao.findUserByUsername(username);

        if (userCustom == null) {
            throw new MyException("用户不存在!");
        }

        if (!userCustom.getPassword().equals(password)) {
            throw new MyException("密码错误！");
        }

        return userCustom;
    }

}
