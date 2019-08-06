package com.ddd.async;

import com.ddd.model.AccountBO;
import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.concurrent.Callable;
/**
 * @author devdws
 * @version Id: AccountThread.java, v 0.1  2019/8/6 22:00 devdws Exp $$
 */
public class AccountThread implements Callable {

    private AccountBO accountBO;

    private   AccountHandler accountHandler;

    public AccountThread(AccountBO accountBO, AccountHandler accountHandler) {
        this.accountBO = accountBO;
        this.accountHandler = accountHandler;
    }

    @Override
    public Object call() throws Exception {
        return accountHandler.process(accountBO);

    }
}
