package cn.qdgxy.shop_ysx.dao;

import cn.qdgxy.shop_ysx.mapper.UserMapper;
import cn.qdgxy.shop_ysx.pojo.User;
import cn.qdgxy.shop_ysx.pojo.UserCustom;
import cn.qdgxy.shop_ysx.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * Created by 于善心 on 2016/11/28.
 */
public class UserDao {

    public UserCustom findUserByUsername(String username) throws Exception {
        // 4. 获取Session
        SqlSession session = MybatisUtil.getSession();
        // 5. 获取操作类
        UserMapper UserMapper = session.getMapper(UserMapper.class);
        // 6. 完成查询操作
        UserCustom user = UserMapper.findUserByUsername(username);
        // 7. 关闭Session
        session.close();

        return user;
    }

}
