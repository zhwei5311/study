package level2.reflectExe;

import level2.reflectExe.PrintString;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 使用反射手段创建该类的对象， 并调用该对象中的方法
 */
public class PrintTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<PrintString> printClass = PrintString.class;
        PrintString printString = printClass.newInstance();
        Method prints = printClass.getMethod("prints", String.class);
        prints.invoke(printString,"String");
    }
}
