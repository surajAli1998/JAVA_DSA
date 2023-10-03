package com.oop.day2.singleton_class;

/*
singleton class is a class which can be instantiated only once. That means we can create an object of that
only once
 */
public class SingletonClass {
    private SingletonClass(){

    }
    private static SingletonClass obj;

//    getInstance method will check if obj is null or not, if null that means no objects are created yet, in
//    that case create one obj and return it, and if not null then that means already one obj created then
//    simply return the same obj
    public static SingletonClass getObj() {
        return obj;
    }

    public static SingletonClass getInstance(){
        if (obj == null){
            obj = new SingletonClass();
        }
        return obj;
    }

}
