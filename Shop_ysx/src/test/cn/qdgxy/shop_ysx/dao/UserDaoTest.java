package cn.qdgxy.shop_ysx.dao;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 于善心 on 2016/11/28.
 */
public class UserDaoTest {

    private UserDao userDao  = new UserDao();

    @Test
    public void findUserByUsername() throws Exception {
        System.out.println(userDao.findUserByUsername("buyer"));
    }

}