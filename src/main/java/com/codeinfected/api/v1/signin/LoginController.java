package com.codeinfected.api.v1.signin;

import com.codeinfected.api.account.Account;
import com.codeinfected.api.account.AccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by marciog on 1/20/17.
 */
@RestController
public class LoginController {

//    private final AccountRepository accountRepository;

//    public AccountController(AccountRepository accountRepository) {
//        this.accountRepository = accountRepository;
//    }

    @GetMapping("api/v1/login")
    @ResponseStatus(value = HttpStatus.OK)
//    @Secured({"ROLE_USER", "ROLE_ADMIN"})
    public String login(Principal principal) {
        return "Login .... " + principal;

//        Assert.notNull(principal);
//        return accountRepository.findOneByEmail(principal.getName());
    }

//    @GetMapping("account/{id}")
//    @ResponseStatus(value = HttpStatus.OK)
//    @Secured("ROLE_ADMIN")
//    public Account account(@PathVariable("id") Long id) {
//        return accountRepository.findOne(id);
//    }

}
