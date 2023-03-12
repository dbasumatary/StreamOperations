package com.streamoperations;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

    //UC-2.1: Create a stream and show each element of the stream using forEach()
    public void  createIterateStream() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add((11));

        //Using forEach() to print the stream
        System.out.println("The original elements:");
        arrayList.stream().forEach(a-> System.out.print(a + " "));
    }

    //UC-2.2: Transform each element to double and store the result

    public void elementDouble(){
        ArrayList<Integer> arrayInteger = new ArrayList<>();
        arrayInteger.add(5);
        arrayInteger.add(3);
        arrayInteger.add((11));

        //Using map() to perform an operation to double each element
        Stream<Double> array_double = arrayInteger.stream().map(a -> a.doubleValue());
        System.out.println("\nThe numbers are transformed to double:");
        array_double.forEach(a -> System.out.print(a + " "));
    }

    //UC-2.3: Store transformed double value into a new list
    public void elementStoreInArray(){
        ArrayList<Integer> arrayInteger = new ArrayList<>();
        arrayInteger.add(5);
        arrayInteger.add(3);
        arrayInteger.add((11));

        //Using map() to perform an operation to double each element
        Stream<Double> array_double = arrayInteger.stream().map(a -> a.doubleValue());

        //Using collect() to store the transformed values in a new list
        List<Double> newList = array_double.collect(Collectors.toList());

        System.out.println("\nThe numbers that are transformed to double and stored in a new list:");
        newList.forEach(a -> System.out.print(a + " "));
    }


    //UC-2.4: Filter the even numbers from the stream and store the result in list
    public void filterEvenNumberAndStore(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Using filter to write the expression
        List<Integer> listEven = list.stream().filter(number -> (number % 2 == 0)).collect(Collectors.toList());
        listEven.forEach(number -> System.out.print(number + " "));
    }


   //UC-2.5: Peek and show first even number in the number stream
    public void findFirstEven() {
        ArrayList<Integer> arrayInteger = new ArrayList<>();
        arrayInteger.add(5);
        arrayInteger.add(3);
        arrayInteger.add(11);
        arrayInteger.add(2);
        arrayInteger.add(8);

        // Create a stream of integers from the list
        Stream<Integer> integerStream = arrayInteger.stream();

        // Use findFirst() and filter() to find the first even number in the stream
        Integer firstEven = integerStream.filter(n -> n % 2 == 0).findFirst().orElse(null);

        // Print the result to the console
        System.out.println("First even number: " + firstEven);
    }

    //UC-2.6: Find minimum and maximum number in the number stream
    public void findMinMax() {
        ArrayList<Integer> arrayInteger = new ArrayList<>();
        arrayInteger.add(5);
        arrayInteger.add(3);
        arrayInteger.add(11);

        // Create a stream of integers from the list
        Stream<Integer> integerStream = arrayInteger.stream();

        // Use min() and max() to find the minimum and maximum values in the stream
        Integer minimum = integerStream.min(Integer::compareTo).orElse(null);
        Integer maximum = arrayInteger.stream().max(Integer::compareTo).orElse(null);

        // Print the results to the console
        System.out.println("Minimum number in the stream : " + minimum);
        System.out.println("Maximum number in the stream : " + maximum);
    }

    public static void main(String[] args) {
        StreamOperations streamTest = new StreamOperations();
        streamTest.findMinMax();
    }
}

