package com.shilin.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author shilin
 * @create 2020-10-07 11:08
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {
    @PostMapping("/storage/decrease")
    void decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
