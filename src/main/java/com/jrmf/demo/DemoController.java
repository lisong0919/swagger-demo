package com.jrmf.demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@Api(tags = "演示Controller")
public class DemoController {

    @ApiOperation("测试hello方法")
    @ApiImplicitParam(name = "name", value = "输入姓名")
    @PostMapping("/hello")
    public UserVO hello(@RequestParam String name) {
        UserVO userVO = new UserVO();
        userVO.setAge(18);
        userVO.setName("hello " + name);



        return userVO;
    }


}
