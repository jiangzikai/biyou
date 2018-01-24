package com.kaihang.service;

import com.kaihang.model.UserInfo;

/**
 * @author <a href="mailto:3061846560@qq.com">ZiKai Jiang</a>
 */
public interface UserInfoService {
    /**
     * 保存用户信息
     * @param userInfo 用户信息对象
     * @return 保存的用户信息对象
     */
    UserInfo save(UserInfo userInfo);
}
