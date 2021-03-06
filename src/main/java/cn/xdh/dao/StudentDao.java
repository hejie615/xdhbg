package cn.xdh.dao;

import cn.xdh.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao {
    public Student selectByPhoneAndPassword(@Param("phone")String phone,@Param("password")String password);
}
