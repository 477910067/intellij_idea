package cn.qdgxy.shop_ysx_mapper;

import cn.qdgxy.shop_ysx.mapper.UserMapper;
import cn.qdgxy.shop_ysx.pojo.User;
import cn.qdgxy.shop_ysx.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;


public class UserMapperTest {

    private SqlSessionFactory sessionFactory;

    @Before
    public void init() {
        // 1. 声明配置文件的目录渎职
        String resource = "SqlMapConfig.xml";

        // 2. 加载应用配置文件
        InputStream is = UserMapperTest.class.getClassLoader().getResourceAsStream(resource);

        // 3. 创建SqlSessonFactory
        sessionFactory = new SqlSessionFactoryBuilder().build(is);
    }

    @Test
    public void testGetUser() throws Exception {
        // 4. 获取Session
        SqlSession session = sessionFactory.openSession();
        // 5. 获取操作类
        UserMapper UserMapper = session.getMapper(UserMapper.class);
        // 6. 完成查询操作
        User user = UserMapper.getUser(1);
        System.out.println(user);
        // 7. 关闭Session
        session.close();
    }

    @Test
    public void testGetUser2() throws Exception {
        // 4. 获取Session
        SqlSession session = MybatisUtil.getSession();
        // 5. 获取操作类
        UserMapper UserMapper = session.getMapper(UserMapper.class);
        // 6. 完成查询操作
        User user = UserMapper.getUser(1);
        System.out.println(user);
        // 7. 关闭Session
        session.close();
    }

    @Test
    public void testFindUserByUsername() throws Exception {
        // 4. 获取Session
        SqlSession session = sessionFactory.openSession();
        // 5. 获取操作类
        UserMapper UserMapper = session.getMapper(UserMapper.class);
        // 6. 完成查询操作
        User user = UserMapper.findUserByUsername("buyer");
        System.out.println(user);
        // 7. 关闭Session
        session.close();
    }


}
