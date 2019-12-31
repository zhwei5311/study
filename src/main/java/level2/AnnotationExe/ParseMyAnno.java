package level2.AnnotationExe;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * 2:定义一个注解解析类ParseMyAnno，并定义方法parse()，
 * <p>
 * 方法中：反射解析注解，先运行@MyBefore的方法，
 * <p>
 * 然后运行@MyTest的方法，最后运行@MyAfter的方法
 */
public class ParseMyAnno {
    @Test
    public void parse() throws Exception {
        Class personClass = Class.forName("level2.reflectExe.Person");
        Object obj = personClass.newInstance();
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyBefore.class)) {
                method.invoke(obj);
            }
        }
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)) {
                method.invoke(obj);
            }
        }
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyAfter.class)) {
                method.invoke(obj);
            }
        }
    }
}
