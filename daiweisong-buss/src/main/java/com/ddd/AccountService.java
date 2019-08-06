package com.ddd;

import com.ddd.async.AccountHandler;
import com.ddd.async.AccountThread;
import com.ddd.conver.AccountConverter;
import com.ddd.model.AccountBO;
import com.ddd.model.AccountReq;
import com.ddd.model.AccountRes;
import com.ddd.threadpool.ThreadPool;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.Future;
/**
 * @author devdws
 * @version Id: AccountService.java, v 0.1  2019/8/6 9:41 devdws Exp $$
 */
public class AccountService implements AccountServiceApi {


    @Autowired
    AccountHandler accountHandler;

    @Override
    public AccountRes doGenAccount(AccountReq accountReq) {

        AccountBO bo = AccountConverter.getBO(accountReq);
        Future submit = ThreadPool.getEx().submit(new AccountThread(bo,accountHandler));

        return null;
    }
}
