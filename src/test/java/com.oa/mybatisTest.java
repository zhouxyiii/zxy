package com.oa;

import com.oa.bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Teori on 2018/3/19.
 */
public class mybatisTest {

    /** logger */
    private static final Logger logger = Logger.getLogger(mybatisTest.class);

    private static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public  static void init(){
        //加载mybatis的核心配置文件
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis.cfg.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //解析mybatis.cfg.xml文档，并初始化mybatis（连接池、缓存）
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    /**
     * 查询所有
     */
    @Test
    public void testCase1(){
        //获取session
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //增删查改
        List<User> list = sqlSession.selectList("com.oa.bean.UserMapper.queryUser");

        System.out.println(sqlSession);
        System.out.println(list);

        for (User user:list) {
            System.out.println(user.getUserName());
        }
    }


    @Test
    public void testCase2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //参数1 查询语句的id
        //参数2  入参
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("user_name","2 or 1=1");
        User user = sqlSession.selectOne("com.oa.bean.UserMapper.queryUserById", map);
        sqlSession.close();
    }

    /**
     * 多条件查询
     */
    @Test
    public void testCase3(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("userName","张三");
        map.put("userPassword","123");
        User user = sqlSession.selectOne("com.oa.bean.UserMapper.checkUser",map);
        System.out.println(user.getUserId() + user.getUserName());
        sqlSession.close();
    }
}