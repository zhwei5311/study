package level2.reflectExe;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 通过反射技术，在这个泛型为Integer的ArrayList中存放一个String类型的对象
 */
public class Reflect4 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        Method add = integerList.getClass().getMethod("add", Object.class);
        add.invoke(integerList,"白笑嫣");
        for(int i = 0; i < integerList.size();i++) {
            System.err.println(integerList.get(i));
        }
    }
}
