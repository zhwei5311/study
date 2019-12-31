package com.study.mapExe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *  - 创建一个HashMap集合，存储三个键值对元素，每一个键值对元素的键是String，值是ArrayList
 *   - 每一个ArrayList的元素是String，并遍历。
 */
public class MapExe7 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();

        //创建ArrayList集合，并添加元素
        ArrayList<String> sgyy = new ArrayList<String>();
        sgyy.add("诸葛亮");
        sgyy.add("赵云");
        //把ArrayList作为元素添加到HashMap集合
        hm.put("三国演义",sgyy);

        ArrayList<String> xyj = new ArrayList<String>();
        xyj.add("唐僧");
        xyj.add("孙悟空");
        //把ArrayList作为元素添加到HashMap集合
        hm.put("西游记",xyj);

        ArrayList<String> shz = new ArrayList<String>();
        shz.add("武松");
        shz.add("鲁智深");
        //把ArrayList作为元素添加到HashMap集合
        hm.put("水浒传",shz);
        for(String s : hm.keySet()) {
            System.err.println(s);
            for(String s1 : hm.get(s)) {
                System.err.println("  " + s1);
            }
        }
    }
}
