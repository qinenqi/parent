package com.qinenqi.order.mapper;


import com.qinenqi.common.entry.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper {

    public List<Student> select();

}
