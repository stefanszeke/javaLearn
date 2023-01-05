// Array vs ArrayList:
// 1. Array is fixed size, ArrayList is dynamic size
// 2. Array is faster, ArrayList is slower
// 3. Array is not type safe, ArrayList is type safe
// 4. Array is not thread safe, ArrayList is thread safe
// 5. Array is not synchronized, ArrayList is synchronized
// 6. Array is not iterable, ArrayList is iterable

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        // add elements to the list
        list.add("Java");
        list.add("C++");
        list.add("C#");
        list.add("Python");

        // print the list
        System.out.println(list);

        // add an element at a specific index
        System.out.println("Adding an element at index 1");
        list.add(1, "JavaScript");

        // print the list
        System.out.println(list);
        System.out.println();

        //replace an element at a specific index
        System.out.println("Replacing an element at index 1");
        list.set(1, "PHP");

        
        // print the list
        System.out.println(list);
        System.out.println();

        // remove an element from the list
        System.out.println("Removing an element from the list");
        list.remove("C#");

        // print the list
        System.out.println(list);
        System.out.println();

        // get the size of the list
        System.out.println("Size of the list: " + list.size());

        // check if the list is empty
        System.out.println("Is the list empty? " + list.isEmpty());

        // check if the list contains an element
        System.out.println("Does the list contain Java? " + list.contains("Java"));

        // get the index of an element
        System.out.println("Index of Java: " + list.indexOf("Java"));

        // get the element at a specific index
        System.out.println("Element at index 1: " + list.get(1));

        // clear the list
        list.clear();

        // print the list
        System.out.println(list);
        
        
    }
}