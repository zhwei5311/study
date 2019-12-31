package com.study.exercise2;

import java.util.Random;

/**
 * 在登录注册页面中，除了用户名和密码外，通常也会包含验证码。
 * 验证码是用来区分用户是计算机还是人，防止恶意破解密码、刷票、灌水等行为。
 * 请查看Random、StringBuilder相关API，定义方法，获取一个包含4个字符的验证码，
 * 每一位字符是随机选择的字母和数字，可包含a-z,A-Z,0-9。例如：
 * 7Kt5
 */
public class API1 {
    public static void main(String[] args) {
        while (true) {
            String code = getCode();
            String inputCode = "abcd";
            if (inputCode.equalsIgnoreCase(code)) {
                System.err.println("输入正确");
                break;
            } else {
                System.err.println("输入有误请重新输入！");
            }
        }
    }

    public static String getCode() {
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            stringBuilder.append(ch);
        }
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            stringBuilder.append(ch);
        }
        for (char ch = '0'; ch <= '9'; ch++) {
            stringBuilder.append(ch);
        }
        String code = "";
        for (int i = 0; i < 4; i++) {
            int index = new Random().nextInt(stringBuilder.length());
            code += stringBuilder.charAt(index);
        }
        return code;
    }
}
