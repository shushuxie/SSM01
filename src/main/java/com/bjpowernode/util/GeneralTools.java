package com.bjpowernode.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * TODO
 *
 * @author 谢树树
 * @date 18/11/2021 下午7:53
 */

public class GeneralTools {

    /**
     * Md5加密 对密码进行处理
     */
    public static String getMD5Str(String password){
        String hashedPwd = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
           //加密后的代码变为16进制输出
             hashedPwd = new BigInteger(1, md.digest(password.getBytes())).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return hashedPwd;
    }
}
