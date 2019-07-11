package com.example.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.resource.entity.SysUser;

public interface SysUserService extends IService<SysUser> {

    SysUser getUserById(Integer id);
}
