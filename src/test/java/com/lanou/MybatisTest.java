package com.lanou;


import com.lanou.dao.*;
import com.lanou.pojo.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MybatisTest {
    private SqlSessionFactory sqlSessionFactory;

    @BeforeEach
    void test() throws IOException {
        //通过XML配置文件,创建sqlSessionFactory
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        System.out.println(sqlSessionFactory);
    }

    @Test
    void test6() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Girl> girlList = sqlSession.selectList("selectAll");
        for (Girl girl : girlList) {
            System.out.println(girl);
        }
    }

    @Test
    void test1() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        GirlDao girlDao = sqlSession.getMapper(GirlDao.class);
        List<Girl> girlList = girlDao.selectAll();
        for (Girl girl : girlList) {
            System.out.println(girl);
        }
    }

    @Test
    void test2() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Girl girl = new Girl();
        girl.setGName("刘亦菲");
        girl.setGAge(36);
        GirlDao girlDao = sqlSession.getMapper(GirlDao.class);
        int row = girlDao.insert(girl);
        System.out.println(row);

        System.out.println(girl);
    }

    @Test
    void test3() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Girl> girlList = new ArrayList<Girl>();
        for (int i = 0; i < 3; i++) {
            Girl girl = new Girl();
            girl.setGAge(34 + i);
            girl.setGName("柳岩" + i);
            girlList.add(girl);
        }
        GirlDao girlDao = sqlSession.getMapper(GirlDao.class);
        girlDao.insert1(girlList);
    }
    //表关系
    //1.一对一
    //2.一对多
    //3.多对多
    @Test
    void test4() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AManDao aManDao = sqlSession.getMapper(AManDao.class);
        List<AMan> aManList = aManDao.selectAll();
        for (AMan aMan : aManList) {
            System.out.println(aMan);
            //System.out.println(aMan.getWoman());
        }
    }
    @Test
    void test5() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BManDao bManDao = sqlSession.getMapper(BManDao.class);
        List<BMan> bManList = bManDao.selectAll();
        for (BMan bMan : bManList) {
            System.out.println(bMan);
        }
    }

    @Test
    void test7() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        AWomanDao aWomanDao = sqlSession.getMapper(AWomanDao.class);
        List<AWoman> aWomanList = aWomanDao.selectAll();
        for (AWoman aWoman : aWomanList) {
            System.out.println(aWoman);
        }
    }

    @Test
    void test8() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BWomanDao bWomanDao = sqlSession.getMapper(BWomanDao.class);
        List<BWoman> bWomanList = bWomanDao.selectAll();
        for (BWoman bWoman : bWomanList) {
            System.out.println(bWoman);
        }
    }
}
