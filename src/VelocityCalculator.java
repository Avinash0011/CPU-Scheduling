import java.util.Scanner;

public class VelocityCalculator {
//
    // Method to calculate velocity with integer inputs
    public int calculateVelocity(int distance, int time) {
        return distance / time;
    }

    // Method to calculate velocity with double inputs
    public double calculateVelocity(double distance, double time) {
        return distance / time;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integer inputs
        int distanceInt = scanner.nextInt();
        int timeInt = scanner.nextInt();

        // Read double inputs
        double distanceDouble = scanner.nextDouble();
        double timeDouble = scanner.nextDouble();

        // Create VelocityCalculator object
//        VelocityCalculator calculator = new VelocityCalculator();
//
//        // Calculate and print velocity with integer inputs
//        int velocityInt = calculator.calculateVelocity(distanceInt, timeInt);
//        double velocityDouble = calculator.calculateVelocity(distanceDouble, timeDouble);
        int velocityInt=distanceInt/timeInt;
        double velocityDouble=distanceDouble/timeDouble;

        System.out.println("Velocity with integer inputs: " + velocityInt + " m/s");
        System.out.printf("Velocity with double inputs: %.2f m/s", velocityDouble);
        scanner.close();
    }
}
//mport java.util.Scanner;i

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main{
//
////    enum GameLevel {
////        EASY,
////        MEDIUM,
////        HARD
////    }
//     public static void main(String[] args) {
//Type your code here
//        Scanner sc = new Scanner(System.in);
//        double a=sc.nextDouble();
//        if(a<-100 || a>150){
//            System.out.println("Temperature outside the human-survivable range");
//        }
//        else{
//            double b=(a - 32)*5/9;
//            System.out.print("Temperature in Celsius: "+ b + " C");
//        }

//
//                    Scanner sc = new Scanner(System.in);
//                    System.out.print("Enter a number: ");
//                    int n = sc.nextInt();
//                    int originalNumber = n;
//                    int evenDigitCount = 0;
//
//                    // Count even digits using a while loop
//                    while (n > 0) {
//                         int digit = n % 10; // Get the last digit
//                         if (digit % 2 == 0) { // Check if the digit is even
//                              evenDigitCount++;
//                         }
//                         n /= 10; // Remove the last digit
//                    }
//
//                    // Check results based on the count of even digits
//                    if (evenDigitCount == 0) {
//                         System.out.println("There are no even digits in the number.");
//                    } else {
//                         if (originalNumber % evenDigitCount == 0) {
//                              System.out.println("It is a divisor of the original number.");
//                         } else {
//                              System.out.println("It is not a divisor of the original number.");
//                         }
//                    }


//         Scanner sc=new Scanner(System.in);
//          long n = sc.nextLong(); // Read the input number
//          long product = 1; // Initialize product to 1 (multiplicative identity)
//          boolean hasNonZeroDigit = false; // Flag to check if there are non-zero digits
//
//          // Convert the number to a string to iterate through each digit
//          String numberStr = Long.toString(n);
//
//          // Iterate through each character in the string representation of the number
//          for (char digitChar : numberStr.toCharArray()) {
//               int digit = Character.getNumericValue(digitChar); // Convert char to int
//               if (digit != 0) { // Check if the digit is non-zero
//                    product *= digit; // Multiply non-zero digit to the product
//                    hasNonZeroDigit = true; // Set flag to true if we found a non-zero digit
//               }
//          }
//
//          // If there were no non-zero digits, we should handle that case
//          if (!hasNonZeroDigit) {
//               product = 0; // If there are no non-zero digits, set product to 0 (though this case won't occur with given constraints)
//          }
//
//          System.out.println(product); // Output the result

//         int [][] a={{1, 2, 3},
//                    {4, 5, 6}};
//        int [][] b={{2, 6, 8},
//                    {9, 3, 3}};

//         int a[][]=new int[2][3];
//         int b[][]=new int[2][3];
//        int [][] result={{0, 0, 0},
//                        {0, 0, 0}};
//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<a[i].length;j++){
//                result[i][j]=a[i][j] * b[i][j];
//                System.out.print(result[i][j]+" ");
//            }
//            System.out.println(" ");
//        }


//         Scanner sc = new Scanner(System.in);
//
//         // Taking rows and columns as input
//         System.out.print("Enter number of rows: ");
//         int rows = sc.nextInt();
//         System.out.print("Enter number of columns: ");
//         int cols = sc.nextInt();
//
//         // Declaring a 2D array
//         int[][] arr = new int[rows][cols];
//
//         // Taking input for the 2D array
//         System.out.println("Enter the elements of the 2D array:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//
//         // Printing the 2D array
//         System.out.println("The 2D array is:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }







//                 Scanner scanner = new Scanner(System.in);
//                 int score = scanner.nextInt();
//                 scanner.close();
//
//                 GameLevel level;
//                 if (score >= 0 && score <= 50) {
//                     level = GameLevel.EASY;
//                 } else if (score > 50 && score <= 75) {
//                     level = GameLevel.MEDIUM;
//                 } else {
//                     level = GameLevel.HARD;
//                 }
//
//                 System.out.println(level);


//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//
//         int product=1;
//         for(int i=0;i<n;i++){
//             if(i % 2 == 0){
//                 product*=arr[i];
//             }
//         }
//         System.out.println(product);






//     }
//}
