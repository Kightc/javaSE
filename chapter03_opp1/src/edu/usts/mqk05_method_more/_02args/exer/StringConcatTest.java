package edu.usts.mqk05_method_more._02args.exer;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/13 17:57
 * @Version 1.0
 */
public class StringConcatTest {
    public static void main(String[] args) {
        StringConcatTest test = new StringConcatTest();
        String info = test.concat(" ", "hello", "my", "baby");
        System.out.println(info);
    }
    public String concat(String str1, String ... str2){
        String result = "";
        for (int i = 0; i < str2.length; i++) {
            if(i == 0)
                result += str2[i];
            else
                result += (str1 + str2[i]);
        }
        return result;
    }
}
