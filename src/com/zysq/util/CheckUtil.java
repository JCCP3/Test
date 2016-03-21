package com.zysq.util;

import java.util.Arrays;

/**
 * Created by rose_sunshine on 16/3/19.
 * 校验请求是否来自微信
 */
public class CheckUtil {

    private static final  String token = "zysqjclt09040906";

    public static boolean checkSignature(String signature, String timestamp, String nonce) {

        String[] arr = new String[]{token,timestamp,nonce};

        //排序
        Arrays.sort(arr);

        StringBuffer content = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            content.append(arr[i]);
        }

        String digest = new SHA1().getDigestOfString(content.toString().getBytes());

        return digest.equals(signature);

    }

}
