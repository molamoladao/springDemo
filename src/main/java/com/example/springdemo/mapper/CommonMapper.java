package com.example.springdemo.mapper;

import com.example.springdemo.pojo.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 用于实现数据库交互
 */
@Mapper
public interface CommonMapper {
    /**
     *
     * @param sno 学号
     * @param password 密码
     * @return
     */
    @Select("select name,password from Student where sno=#{sno} and password=#{password}")
    public String login(@Param("sno") String sno,@Param("password") String password);

    @Insert("insert into Student(sno,name,password) values (sno,name,password)")
    public Student register(Student student);
}
