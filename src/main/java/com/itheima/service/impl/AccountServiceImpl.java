package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoimpl;
import com.itheima.service.IAccountService;
import org.springframework.stereotype.Component;

/**
 * 账户的业务层实现类
 */
@Component
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;

    public void saveAccount(){

        accountDao.saveAccount();
    }
}
