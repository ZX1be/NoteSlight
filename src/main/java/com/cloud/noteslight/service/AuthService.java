package com.cloud.noteslight.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.cloud.noteslight.dto.LoginDTO;
import com.cloud.noteslight.entity.User;
import com.cloud.noteslight.exception.BizException;
import com.cloud.noteslight.mapper.UserMapper;
import com.cloud.noteslight.vo.LoginVO;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private UserMapper userMapper;
    public LoginVO login(LoginDTO dto){
        LambdaQueryWrapper<User> wrapper=new LambdaQueryWrapper<>();
        wrapper.eq(User::getUsername, dto.getUsername());
        User user = userMapper.selectOne(wrapper);
        if(user==null){
            throw new BizException("用户名或密码错误");
        }




    }

}
