package com.shilin.springcloud.controller;

import com.shilin.springcloud.domain.CommonResult;
import com.shilin.springcloud.service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author shilin
 * @create 2020-10-07 16:44
 */
@RestController
public class AccountController {

    @Resource
    private AccountService accountService;

    @PostMapping("/account/decrease")
    public CommonResult<String> decrease(Long userId, BigDecimal money){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        accountService.decrease(userId, money);
        return new CommonResult<>(200, "减账号成功");
    }
}
