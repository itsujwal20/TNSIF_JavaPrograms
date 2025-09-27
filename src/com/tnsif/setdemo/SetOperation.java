package com.tnsif.setdemo;

package com.setdemo;

import java.util.HashSet;
import java.util.Set;

// This class demonstrates basic operations on a Set.
public class SetOperation {

    public static void operations() {
        // A Set is a collection that cannot contain duplicate elements.
        Set<String> fruitSet = new HashSet<>();

        // Add elements to the set.
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Orange");
        
        // Trying to add a duplicate element will be ignored.
        fruitSet.add("Apple"); 

        System.out.println("Set after adding elements: " + fruitSet);

        // Check if an element exists in the set.
        boolean containsBanana = fruitSet.contains("Banana");
        System.out.println("Does the set contain 'Banana'? " + containsBanana);

        // Remove an element from the set.
        fruitSet.remove("Orange");
        System.out.println("Set after removing 'Orange': " + fruitSet);
    }
}

