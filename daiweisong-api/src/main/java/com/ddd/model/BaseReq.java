package com.ddd.model;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;
/**
 * @author devdws
 * @version Id: BaseReq.java, v 0.1  2019/8/6 9:36 devdws Exp $$
 */
public class BaseReq implements Serializable {
    private Date tradeTime;

    private String tradeName ;
}
