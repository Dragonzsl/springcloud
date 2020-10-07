package com.shilin.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author shilin
 * @create 2020-10-07 16:31
 */
@Mapper
public interface AccountDao {
    void decrease(@Param("userId") Long userId, @Param("money")BigDecimal money);
}
