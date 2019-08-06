package com.ddd.conver;

import com.ddd.model.AccountBO;
import com.ddd.model.AccountReq;
/**
 * @author devdws
 * @version Id: AccountConverter.java, v 0.1  2019/8/6 22:09 devdws Exp $$
 */
public class AccountConverter {

    public static AccountBO getBO(AccountReq accountReq){
        return new AccountBO();
    }
}
