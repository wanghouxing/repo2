package com.hyxy.mapper;

import com.hyxy.pojo.Account;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountMapper {
    @Select("select * from account")
    List<Account> findAll();
}
