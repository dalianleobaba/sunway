package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.model.SysUser;
import com.tencent.wxcloudrun.service.ISysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * counter控制器
 */
@RestController
public class UserController {

    @Autowired
    private ISysUserService iSysUserService;

    private Logger logger = LoggerFactory.getLogger(UserController.class);


    /**
     * 获取当前计数
     *
     * @return API response json
     */
    @GetMapping(value = "/api/user/{id}")
    ApiResponse get(@PathVariable(value = "id") Long id) {
        logger.info("/api/user get ");
        SysUser user = iSysUserService.selectUserById(id);
        return ApiResponse.ok(user);
    }

}