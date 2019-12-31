package com.study.iOExe;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 请用户从控制台输入信息，程序将信息存储到文件Info.txt中。
 * 可以输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束
 */
public class IOExe7 {
    public static void main(String[] args) {
        try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\info.txt"))) {
//            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\info.txt"));
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.err.println("请随意输入：");
                String string = scanner.nextLine();
                if (!string.equals("886")) {
                    bos.write(string.getBytes());
                    bos.write("\r\n".getBytes());
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
