package com.shilin.springcloud.controller;

import com.shilin.springcloud.domain.CommonResult;
import com.shilin.springcloud.service.StorageService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author shilin
 * @create 2020-10-07 16:14
 */
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    @PostMapping("/storage/decrease")
    public CommonResult<String> decrease(Long productId, Integer count){
        storageService.decrease(productId, count);
        return new CommonResult<>(200, "减库存成功");
    }
}
