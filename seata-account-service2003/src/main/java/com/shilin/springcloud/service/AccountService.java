package com.shilin.springcloud.service;

import java.math.BigDecimal;

/**
 * @author shilin
 * @create 2020-10-07 16:42
 */
public interface AccountService {
    void decrease(Long userId, BigDecimal money);
}
