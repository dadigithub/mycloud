package com.dadi.springcloud.dao;

import com.dadi.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {
    //添加
    public boolean addDept(Dept dept);
    //根据id查询
    public Dept findById(Long id);
    //查询全部
    public List<Dept> findAll();

}
