package com.kaihang.repository;

import com.kaihang.model.UserInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;
/**
 * @author <a href="mailto:3061846560@qq.com">ZiKai Jiang</a>
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoRepositoryTest {
    @Autowired
    private UserInfoRepository repository;

    @Test
    public void saveTest() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("jiangzikai");
        userInfo.setUserPwd("123456");
        userInfo.setOpenId("354rstrtrdrwrwer");
        userInfo.setCreateTime(new Date());

        UserInfo result = repository.save(userInfo);
        Assert.assertNotNull(result);
    }
}