
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 计算list中每个内容出现了多少次
 */
public class TestCount {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("zhang");
        list.add("zhang");
        list.add("zhang");
        list.add("wang");
        list.add("wang");
        list.add("li");
        list.add("li");
        if (list == null || list.size() == 0) {
            System.err.println(0);
        }
        Map<String, Integer> map = new HashMap<>();
        for (String temp : list) {
            Integer count = map.get(temp);
            map.put(temp, (count == null) ? 1 : count + 1);
        }
        for (String key : map.keySet()) {
            Integer value = map.get(key);
            System.err.println(key + "---" +value);
        }
    }
}
