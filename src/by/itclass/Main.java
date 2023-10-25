package by.itclass;

import by.itclass.model.Cat;
import by.itclass.model.Dog;
import static by.itclass.utils.CompetitionUtils.*;
import static by.itclass.utils.CompetitionUtils.sortByBirthDate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        List<Dog> dogs = new  ArrayList<>();
        Map<String, String > errors = new HashMap<>();

        parseFile(cats, dogs, errors);

      // CompetitionUtils.printResult(cats, dogs, errors);


        //CompetitionUtils.printResults(sortedCats, sortedDogs, errors);

        List<Cat> youngSortedCats = filterAnimals(sortByBirthDate(cats), true);
        List<Cat> oldSortedCats = filterAnimals(sortByBirthDate(cats), false);

        List<Dog> youngSortedDogs = filterAnimals(sortByBirthDate(dogs), true);
        List<Dog> oldSortedDogs = filterAnimals(sortByBirthDate(dogs), false);

       printResults(youngSortedCats, youngSortedDogs, oldSortedCats, oldSortedDogs, errors);

    }
}
