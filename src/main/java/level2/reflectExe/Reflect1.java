package level2.reflectExe;

import level2.reflectExe.Person;

import java.lang.reflect.Method;

/**
 * 使用反射的方式创建一个实例、并初始化，
 * 使用反射方式调用setName方法对名称进行设置,设置之后 在通过反射方式执行getName()方法
 */
public class Reflect1 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException {
        //使用反射的方式创建一个实例
        Class personClass = Person.class;
        Person person = (Person)personClass.newInstance();
        person.setUsername("白笑嫣");
        Method getName = personClass.getMethod("getUsername");
        System.err.println(person.getUsername());
    }
}
