package com.aqitrade.sunglow.web.controller;

import com.aqitrade.sunglow.core.model.Account;
import com.aqitrade.sunglow.core.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Huawei
 * @since 2018-11-27
 */
@RestController
@RequestMapping("/accounts")
public class AccountController {


    @Autowired
    private AccountService accountService;

    @GetMapping("")
    @ResponseBody
    public List<Account> list(){
        return accountService.list();
    }

}

