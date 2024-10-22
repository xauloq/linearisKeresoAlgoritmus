public class Main {
    public static void main(String[] args) {
        int[] numArr = {6, 19, 1, 23, 89}; // five numbers in an array
        int searchNum = 23; // it is the number we are looking for
        int index = -1; // the index hasn't been found yet, so we declare it as -1

        // loop through the array
        for (int i = 0; i < numArr.length; i++) { // loop through the array
            if (numArr[i] == searchNum) { // if the number we are looking for is found
                index = i; // we store the index of the number
                break; // we exit the loop
            }
        }

        // print the result
        if (index != -1) { // number is found
            System.out.println("The index of the searched element: " + index); // print the index of the number
        } else { // number is not found
            System.out.println("There is no such element in the array."); // print that there is no such element
        }
    }
}