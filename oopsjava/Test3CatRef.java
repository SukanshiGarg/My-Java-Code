package oopsjava;

class Cat {
    String name;
}

public class Test3CatRef {
    public static void main(String[] args) {
        Cat a = new Cat(); 
        // Step 1: Create a new Cat object and assign it to reference a
        a.name = "bobbyyyy"; 
        // Step 2: Set the name attribute of the Cat object to "bobbyyyy"
        Cat cat = makeCatNameUpperCase(a); 
        // Step 3: Call makeCatNameUpperCase method and assign the returned Cat object to cat
        System.out.println(cat.name); 
        // Step 4: Print the name attribute of the returned Cat object
        System.out.println(a.name );
    }

    public static Cat makeCatNameUpperCase(Cat cat) {
        cat.name = cat.name.toUpperCase(); 
        // Convert the name attribute to uppercase and set it back
        return cat; 
        // Return the Cat object
    }
}

