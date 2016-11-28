package cn.qdgxy.shop_ysx.utils;

import cn.qdgxy.shop_ysx.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by 于善心 on 2016/11/28.
 */
public class MybatisUtil {

    private static SqlSessionFactory sessionFactory;

    static {
        // 1. 声明配置文件的目录
        String resource = "SqlMapConfig.xml";

        // 2. 加载应用配置文件
        InputStream is = MybatisUtil.class.getClassLoader().getResourceAsStream(resource);

        // 3. 创建SqlSessonFactory
        sessionFactory = new SqlSessionFactoryBuilder().build(is);

        try {
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获得Session
     *
     * @return Session
     */
    public static SqlSession getSession() {
        return sessionFactory.openSession();
    }

}