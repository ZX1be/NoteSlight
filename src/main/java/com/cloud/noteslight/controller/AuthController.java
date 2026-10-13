package com.cloud.noteslight.controller;

import com.cloud.noteslight.dto.LoginDTO;
import com.cloud.noteslight.entity.Result;
import com.cloud.noteslight.service.AuthService;
import com.cloud.noteslight.vo.LoginVO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/login")
    public Result<LoginVO> login(@Valid @RequestBody LoginDTO dto){
         LoginVO vo= authService.login(dto);
        return Result.success(vo);
    }

}
