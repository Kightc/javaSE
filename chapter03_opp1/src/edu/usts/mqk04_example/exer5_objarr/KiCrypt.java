package edu.usts.mqk04_example.exer5_objarr;

import java.util.Arrays;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/10 23:29
 * @Version 1.0
 */
public class KiCrypt {

    public static void main(String[] args) {
        char[] miwen = KiCrypt.encrpy("iloveyou");
        System.out.println(Arrays.toString(miwen));
        char[] jiemi = KiCrypt.copy(miwen);
        System.out.println(Arrays.toString(jiemi));
    }

    static char[] encryptArr = new char[26];
    static char[] copyArr = new char[26];

    // 添加字符
    // 生成秘钥的对称映射关系
    static {
        for (int i = 0; i < 26; i++) {
            encryptArr[i] = ((char) (i + 97));
        }
        for (int i = 25, j = 97; i >= 0; i--, j++) {
            copyArr[i] = (char) (j);
        }
    }

    //加密
    public static char[] encrpy(String yuanwen) {
        char[] encryptArr2 = new char[yuanwen.length()];
        char[] encryptArr3 = new char[yuanwen.length()];
        for (int i = 0; i < yuanwen.length(); i++) {
            encryptArr2[i] = yuanwen.charAt(i);
        }
        for (int i = 0; i < encryptArr2.length; i++) {
            for (int j = 0; j < encryptArr.length; j++) {
                if (encryptArr[j] == encryptArr2[i]) {
                    encryptArr3[i] = copyArr[j];
                }
            }
        }
        return encryptArr3;
    }
    //解密
    public static char[] copy(char[] arr) {
        char[] copyArr2 = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < copyArr.length; j++) {
                if (arr[i] == copyArr[j]) {
                    copyArr2[i] = encryptArr[j];
                }
            }
        }
        return copyArr2;
    }

}
