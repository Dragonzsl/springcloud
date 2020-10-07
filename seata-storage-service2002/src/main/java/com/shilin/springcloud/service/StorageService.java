package com.shilin.springcloud.service;

/**
 * @author shilin
 * @create 2020-10-07 15:53
 */
public interface StorageService {
    void decrease(Long productId,Integer count);
}
