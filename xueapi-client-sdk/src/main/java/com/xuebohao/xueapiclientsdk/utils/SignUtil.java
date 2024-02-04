package com.xuebohao.xueapiclientsdk.utils;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.asymmetric.Sign;
import cn.hutool.crypto.asymmetric.SignAlgorithm;
import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;

public class SignUtil {

    /**
     * 验证签名
     *
     * @param data 待验签数据
     * @return boolean
     */
    public boolean isVerify(String data){
        Sign sign = SecureUtil.sign(SignAlgorithm.SHA256withRSA);
        //签名
        byte[] signed = sign.sign(data);
        //验证签名
        return sign.verify(data.getBytes(), signed);
    }

    public static String getSign(String body, String secretKey){
        Digester sha256 = new Digester(DigestAlgorithm.SHA256);
        String content = body + "." + secretKey;
        return sha256.digestHex(content);
    }

}
