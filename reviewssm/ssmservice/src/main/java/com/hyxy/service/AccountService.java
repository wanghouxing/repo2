package com.hyxy.service;

import com.hyxy.pojo.Account;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
}
