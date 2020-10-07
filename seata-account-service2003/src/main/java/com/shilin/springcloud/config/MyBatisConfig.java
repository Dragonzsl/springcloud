package com.shilin.springcloud.config;

import com.shilin.springcloud.dao.AccountDao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author shilin
 * @create 2020-10-07 11:46
 */
@Configuration
@MapperScan(basePackageClasses = AccountDao.class)
public class MyBatisConfig {
}
