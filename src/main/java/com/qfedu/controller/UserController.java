package com.qfedu.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api(produces = "这是java编写的接口文档", value = "接口文档")
@RestController
public class UserController {

    // 查询数据
    @ApiOperation(notes = "实现传递参数，响应指定数量的数据", tags = {"数量"},value="获取名次接口")
    @GetMapping("/detalist.do")
    public List<String> query(int count){
        List<String> strs = new ArrayList<>();
        for(int i = 1; i <= count; i++){
            strs.add("第" +i + "名");
        }
        return strs;
    }
}
