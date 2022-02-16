package com.tencent.wxcloudrun.service;


import com.tencent.wxcloudrun.model.SysUser;

/**
 * 用户 业务层
 *
 * @author ruoyi
 */
public interface ISysUserService {

    /**
     * 通过用户名查询用户
     *
     * @param userName 用户名
     * @return 用户对象信息
     */
    public SysUser selectUserByUserName(String userName);

    /**
     * 通过用户ID查询用户
     *
     * @param userId 用户ID
     * @return 用户对象信息
     */
    public SysUser selectUserById(Long userId);


}
