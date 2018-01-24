package com.kaihang.repository;

import com.kaihang.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author <a href="mailto:3061846560@qq.com">ZiKai Jiang</a>
 */
public interface UserInfoRepository extends JpaRepository<UserInfo, String> {
}
