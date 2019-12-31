package com.study.fileExe;

import java.io.File;
import java.io.IOException;

/**
 * 检查D盘下是否存在文件a.txt,如果不存在则创建该文件
 */
public class FileExe2 {
    public static void main(String[] args) {
        File file = new File("c:\\a.txt");
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
