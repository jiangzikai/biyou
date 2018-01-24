package com.kaihang.service.impl;

import com.kaihang.model.UserInfo;
import com.kaihang.repository.UserInfoRepository;
import com.kaihang.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author <a href="mailto:3061846560@qq.com">ZiKai Jiang</a>
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoRepository repository;
    public UserInfo save(UserInfo userInfo) {
        return repository.save(userInfo);
    }
}
