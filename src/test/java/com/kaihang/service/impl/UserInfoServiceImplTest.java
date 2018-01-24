package com.kaihang.service.impl;

import com.kaihang.model.UserInfo;
import com.kaihang.repository.UserInfoRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoServiceImplTest {
    @Autowired
    private UserInfoServiceImpl userInfoService;
    @Test
    public void save() throws Exception {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("jiangzikai234342");
        userInfo.setUserPwd("1234563242");
        userInfo.setOpenId("354rstrtrdrwrwer32432");
        userInfo.setCreateTime(new Date());

        UserInfo result = userInfoService.save(userInfo);
        Assert.assertNotNull(result);
    }
}