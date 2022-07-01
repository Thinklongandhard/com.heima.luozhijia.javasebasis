package JavaSEAdvance.com.luozhijia.day16Junit.Demo2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @anthor longway
 * @create 2022-06-30
 * 10:58
 */
/*
元注解：
	     @Target: 描述注解能够作用的位置
		 @Retention: 描述注解被保留的阶段
		 @Documented: 描述注解是否被抽取到api文档中
		 @Inherited: 描述注解是否被子类继承
 */

//    TYPE,  //作用在类上
//    /** Field declaration (includes enum constants) */
//    FIELD, //作用在成员变量上
//    /** Method declaration */
//    METHOD, //作用在方法上
@Target(value = {ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Annor {
    String className();
    String methodName();
}
