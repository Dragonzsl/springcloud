package com.shilin.springcloud.service.impl;

import com.shilin.springcloud.dao.AccountDao;
import com.shilin.springcloud.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author shilin
 * @create 2020-10-07 16:43
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        log.info("===>开始减账户");
        accountDao.decrease(userId, money);
        log.info("===>减账号完成");
    }
}
