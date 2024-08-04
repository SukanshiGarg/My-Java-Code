/*
 Primitive vs Object Passing:

When a primitive type (like int) is passed to a method, 
Java passes a copy of the value, 
so changes made to the parameter inside the method do not affect the original value.


When an object is passed to a method,
 Java passes a copy of the reference to the object. 
 Thus, changes to the object's fields within the method do affect the original object.

 
 */



package Polymorphism;

class Data {
    int data;
}

public class LearnHeap {
    public static void main(String[] args) {
        Integer a = 5; // for primitive type data the value does not change in the stack
        Data obj = new Data();
        obj.data = 5;
        changeValue(a, obj);
        System.out.println(a);
        System.out.println(obj.data);
    }

    static void changeValue(Integer a, Data obj) {
        a = 10; // this change is local and does not affect the original Integer 'a'
        obj.data = 100; // this changes the 'data' field of the original 'obj'
    }
}



