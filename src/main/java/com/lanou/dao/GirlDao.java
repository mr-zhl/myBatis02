package com.lanou.dao;

import com.lanou.pojo.Girl;

import java.util.List;

public interface GirlDao {
    List<Girl> selectAll();

    int insert(Girl girl);

    //一次添加多个Girl
    int insert1(List<Girl> girlList);

    int deleteByIds(int[] ids);

}
