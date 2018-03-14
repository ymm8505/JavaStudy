package singletonFactory;

import java.lang.reflect.Constructor;

/**
 * @author : mayuan
 * @description :
 * @date : 2018/3/6
 */

/**
 * 通过工厂模式实现单例
 */
public class PersonFactory {
    private static Person person;
   static {
       try {
           Class clazz = Class.forName(Person.class.getName());
           Constructor constructor = clazz.getDeclaredConstructor();
           constructor.setAccessible(true);
           person = (Person) constructor.newInstance();
       } catch (Exception e) {
            System.out.println(e);
       }

    }
    public static Person getPersonInstance(){
       return person;
    }
}
