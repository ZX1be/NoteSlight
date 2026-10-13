package com.cloud.noteslight.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.noteslight.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthMapper extends BaseMapper<User> {

}
