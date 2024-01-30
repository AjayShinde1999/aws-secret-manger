package com.aws.secret.manager.controller;

import com.aws.secret.manager.service.SecretService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SecretController {

    @Autowired
    private SecretService secretService;

    @GetMapping("secret-value")
    public String getSecretValue() {
        String secretName = "account-username";
        return secretService.getSecretValue(secretName);
    }
}
