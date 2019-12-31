package com.study.homework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *    1.在当前项目根目录下，创建一个number1.txt文件。并手动写入以下内容：
 *    5
 *    6
 *    123
 *    123
 *    123
 *    77
 *    34
 *    88
 *    69
 *    23
 *    34
 */
public class Answer1 {
    public static void main(String[] args) {
        OutputStreamWriter outputStreamWriter = null;
        try {
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream("number.txt"));
            //图形5
            outputStreamWriter.write(53);
            //换行
            outputStreamWriter.write("\r\n");
            //图形6
            outputStreamWriter.write(54);
            outputStreamWriter.write("\r\n");
            //循环，打印3次123
            for(int i = 0; i < 3; i++) {
                outputStreamWriter.write(49);
                outputStreamWriter.write(50);
                outputStreamWriter.write(51);
                outputStreamWriter.write("\r\n");
            }
            //打印77
            outputStreamWriter.write(55);
            outputStreamWriter.write(55);
            outputStreamWriter.write("\r\n");
            //34
            outputStreamWriter.write(51);
            outputStreamWriter.write(52);
            outputStreamWriter.write("\r\n");
            //88
            outputStreamWriter.write(56);
            outputStreamWriter.write(56);
            outputStreamWriter.write("\r\n");
            //69
            outputStreamWriter.write(54);
            outputStreamWriter.write(57);
            outputStreamWriter.write("\r\n");
            //23
            outputStreamWriter.write(50);
            outputStreamWriter.write(51);
            outputStreamWriter.write("\r\n");
            //34
            outputStreamWriter.write(51);
            outputStreamWriter.write(52);
            outputStreamWriter.write("\r\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStreamWriter.flush();
                outputStreamWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
