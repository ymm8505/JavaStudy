package singletonFactory;

/**
 * @author : mayuan
 * @description :
 * @date : 2018/3/6
 */
public class Person {
    private Person(){}

    public void say(){
        System.out.println("Say  Hello");
    }
    public static Person getPerson(){
        return new Person();
    }
}
