package JavaSEAdvance.com.luozhijia.day16Junit.Demo3Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @anthor longway
 * @create 2022-06-30
 * 14:42
 */
//可以放在方法上
@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)  //JVM虚拟机可以识别
public @interface Check {
}
