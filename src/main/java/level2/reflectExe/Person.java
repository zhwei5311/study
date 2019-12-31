package level2.reflectExe;

/**
 * 定义一个标准的Person类，包含属性name，包含setget方法,包含空参构造。
 *
 * 使用反射的方式创建一个实例、并初始化，使用反射方式调用setName方法对名称进行设置,设置之后 在通过反射方式执行getName()方法
 */
public class Person {
    private String username;

    private String sex;

    private int age;

    public Person() {
    }

    public Person(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
