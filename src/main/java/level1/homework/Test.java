package com.study.homework;

import java.io.*;
import java.util.*;

/**
 * 2.定义一个测试类：Test
 * <p>
 * 2.1创建一个File对象，关联number1.txt文件
 * 2.2通过File对象进行判断，如果当前对象是一个文件的话，则继续执行下面步骤
 * 2.3创建一个BufferedReader对象，关键已有的File对象
 * 2.4创建HashSet集合对象，泛型为String
 * 2.5通过输入流对象读取文件中内容，将每个数字都保存到集合中
 * 2.6创建一个List集合，将HashSet集合中的所有元素全部添加到List集合中
 * 2.7对List集合元素进行排序。按照从小到大的顺序
 * 2.8创建一个BufferedWriter对象，关联到当前项目下的number2.txt文件
 * 2.9通过输出流对象将List集合中的所有元素全部写出
 * 2.10number2.txt文件中最终内容如下：
 * 5
 * 6
 * 23
 * 34
 * 69
 * 77
 * 88
 * 123
 */
public class Test {
    public static void main(String[] args) {
        //    2.1创建一个File对象，关联number1.txt文件
        File file = new File("number1.txt");
        //     2.6创建一个List集合，将HashSet集合中的所有元素全部添加到List集合中
        List<String> stringList = new ArrayList<>();
        //     2.2通过File对象进行判断，如果当前对象是一个文件的话，则继续执行下面步骤
        if (file.isFile()) {
            //     2.3创建一个BufferedReader对象，关键已有的File对象
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                 InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
                 //     2.8创建一个BufferedWriter对象，关联到当前项目下的number2.txt文件
                 BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("number2.txt"))) {
//                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                //     2.4创建HashSet集合对象，泛型为String
                Set<String> stringSet = new HashSet<>();
                //     2.5通过输入流对象读取文件中内容，将每个数字都保存到集合中
//                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("file"));
                char[] chars = new char[1024];
                int len;
                while ((len = inputStreamReader.read(chars)) != -1) {
                    String string = new String(chars, 0, len);
                    String[] strings = string.split("\r\n");
                    for (String s : strings) {
                        stringSet.add(s);
                    }
                }
                for (String s : stringSet) {
                    stringList.add(s);
                }
                //     2.7对List集合元素进行排序。按照从小到大的顺序
                Collections.sort(stringList, new Comparator<String>() {
                    @Override
                    public int compare(String s1, String s2) {
                        int num1 = s1.length() - s2.length();
                        int num2 = num1 == 0 ? Integer.parseInt(s1) - Integer.parseInt(s2) : num1;
                        return num2;
                    }
                });
        //     2.9通过输出流对象将List集合中的所有元素全部写出
                for(String s : stringList) {
                    bufferedWriter.write(s);
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
