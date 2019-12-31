package level2.AnnotationExe;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义三个注解：@MyTest，@MyBefore，@MyAfter，分别模拟JUnit中的@Test，@Before，@After三个注解的作用，并测试使用
 *
 * 注意:
 *
 * 1:定义三个注解：@MyTest， @MyBefore，@MyAfter，无需任何属性，要求三个注解均只能用在方法上，而且作用域范围在运行时.
 *
 * 2:定义一个注解解析类ParseMyAnno，并定义方法parse()，
 *
 * 方法中：反射解析注解，先运行@MyBefore的方法，
 *
 * 然后运行@MyTest的方法，最后运行@MyAfter的方法
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTest {

}
