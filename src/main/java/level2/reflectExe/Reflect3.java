package level2.reflectExe;

import level2.reflectExe.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 使用java中的反射技术将类中的属性与map中的key相同名称的，
 * 使用反射技术将key对应的value值赋值给属性
 */
public class Reflect3 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        Method setUsername = personClass.getMethod("setUsername", String.class);
        Method setAge = personClass.getMethod("setAge", int.class);
        Method setSex = personClass.getMethod("setSex", String.class);
        setUsername.invoke(person, "白笑嫣");
        setAge.invoke(person,18);
        setSex.invoke(person,"女");

        Map<String,Object> map = new HashMap<>();
        map.put("username",person.getUsername());
        map.put("age",person.getAge());
        map.put("sex",person.getSex());
//        map.put("username","白笑嫣");
//        map.put("age",18);
//        map.put("sex","女");
        Set<String> keySet = map.keySet();
        for(String string : keySet) {
            System.err.println(map.get(string));
        }
    }
}
