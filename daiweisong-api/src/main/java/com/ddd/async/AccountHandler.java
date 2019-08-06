package com.ddd.async;

import com.ddd.model.AccountBO;
import org.springframework.stereotype.Component;
/**
 * @author devdws
 * @version Id: AccountHandler.java, v 0.1  2019/8/6 22:03 devdws Exp $$
 */

@Component
public class AccountHandler<D extends AccountBO> {


    public D process(D d){
        return d;
    }


}
