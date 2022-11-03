package net.yorksolutions.memobe.controller;

import net.yorksolutions.memobe.Entity.Account;
import net.yorksolutions.memobe.dto.NewAccountRequestDTO;
import net.yorksolutions.memobe.service.AccountService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/account")
@CrossOrigin
//api - if we didnt add it will think its fe
public class AccountController {

    AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public Account create(@RequestBody NewAccountRequestDTO requestDTO ){
        return this.accountService.create(requestDTO);
    }
    @GetMapping
    public Account login(@RequestParam String username, @RequestParam String password) {
        return this.accountService.login(username, password);
    }
}
