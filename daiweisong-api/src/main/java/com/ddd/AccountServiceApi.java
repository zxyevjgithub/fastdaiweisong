package com.ddd;

import com.ddd.model.AccountReq;
import com.ddd.model.AccountRes;
import org.springframework.stereotype.Service;


/**
 * @author devdws
 * @version Id: AccountProcessHandler.java, v 0.1  2019/7/23 18:50 devdws Exp $$
 */

public interface AccountServiceApi {

     AccountRes doGenAccount(AccountReq accountReq);

}
