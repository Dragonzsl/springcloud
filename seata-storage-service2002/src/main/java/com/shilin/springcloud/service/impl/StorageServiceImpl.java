package com.shilin.springcloud.service.impl;

import com.shilin.springcloud.dao.StorageDao;
import com.shilin.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author shilin
 * @create 2020-10-07 16:11
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("===>开始减库存");
        storageDao.decrease(productId, count);
        log.info("===>减库存结束");
    }
}
