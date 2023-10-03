package com.oop.basicconcepts.garbage_collection;

public class GarbageCollection {

    public static void main(String[] args) {

        B obj;
        for(int i = 0; i<1000000; i++){
            obj = new B("random string");
        }

    }
}

class B{
    String str;

    B(String str){
        this.str = str;
    }

//   finalize method will be invoked whenever an object of class B will be garbage collected
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is garbage collected");
    }
}

