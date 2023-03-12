package com.streamoperations;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Optional;

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
    public void peekShowFirstEven(){
        List<Integer> list_int = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Optional<Integer> firstEven = list_int.stream().filter(num -> num%2==0)
                                           .peek(n-> System.out.println("First even number: " + n))
                                           .findFirst();
        }

    public static void main(String[] args) {
        StreamOperations streamTest = new StreamOperations();
        streamTest.peekShowFirstEven();
    }
}

