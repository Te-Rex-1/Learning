package clg.assignment;

import java.util.*;

 class QuestionPrograms {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        evenOrOdd();
        largestAmongThree();
        profitOrLoss();
        divisibleBy5And11();
        checkNumbersEquality();
        leapYearCheck();
        floatingPointCheck();
        compareFloatUptoThreeDecimal();
        calculatePercentageAndGrade();
        triangleType();
        isAlphabet();
        vowelOrConsonant();
        characterType();
        caseCheck();
        areaVsPerimeter();
        dayName();
        calculator();
        generateRandomNumber();
        quadraticRoots();
        daysInMonth();
        vowelSwitchCase();
        daysOfMonthSwitch();
    }

    // 1
    public static void evenOrOdd() {
        System.out.println("Question 1");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println((n % 2 == 0) ? "Even" : "Odd");
    }

    // 2
    public static void largestAmongThree() {
        System.out.println("Question 2");

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Largest: " + max);
    }

    // 3
    public static void profitOrLoss() {
        System.out.println("Question 3");

        System.out.print("Enter cost price and selling price: ");
        double cp = sc.nextDouble(), sp = sc.nextDouble();
        if (sp > cp) System.out.println("Profit: " + (sp - cp));
        else if (cp > sp) System.out.println("Loss: " + (cp - sp));
        else System.out.println("No Profit, No Loss");
    }

    // 4
    public static void divisibleBy5And11() {
        System.out.println("Question 4");

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println((n % 5 == 0 && n % 11 == 0) ? "Divisible" : "Not Divisible");
    }

    // 5
    public static void checkNumbersEquality() {
        System.out.println("Question 5");

        System.out.print("Enter three numbers: ");
        int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        if (x == y && y == z) System.out.println("All numbers are equal");
        else if (x != y && y != z && x != z) System.out.println("All numbers are different");
        else System.out.println("Neither all are equal nor all are different");
    }

    // 6
    public static void leapYearCheck()
    {
        System.out.println("Question 6");

        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }

    // 7
    public static void floatingPointCheck() {
        System.out.println("Question 7");

        System.out.print("Enter a floating point number: ");
        float num = sc.nextFloat();
        if (num == 0) System.out.println("Zero");
        else if (num > 0) System.out.println("Positive");
        else System.out.println("Negative");
    }

    // 8
    public static void compareFloatUptoThreeDecimal() {
        System.out.println("Question 8");

        System.out.print("Enter two float numbers: ");
        float a = sc.nextFloat(), b = sc.nextFloat();
        if ((int)(a * 1000) == (int)(b * 1000))
            System.out.println("Same up to three decimal places");
        else
            System.out.println("Not same");
    }

    // 9
    public static void calculatePercentageAndGrade() {
        System.out.println("Question 9");

        System.out.print("Enter marks of 5 subjects: ");
        float total = 0;
        for (int i = 0; i < 5; i++) total += sc.nextFloat();
        float perc = total / 5;
        System.out.println("Percentage: " + perc);
        if (perc >= 90) System.out.println("Grade A");
        else if (perc >= 80) System.out.println("Grade B");
        else if (perc >= 70) System.out.println("Grade C");
        else if (perc >= 60) System.out.println("Grade D");
        else if (perc >= 40) System.out.println("Grade E");
        else System.out.println("Grade F");
    }

    // 10
    public static void triangleType() {
        System.out.println("Question 10");

        System.out.print("Enter 3 sides of triangle: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (a == b && b == c) System.out.println("Equilateral");
        else if (a == b || b == c || a == c) System.out.println("Isosceles");
        else System.out.println("Scalene");
    }

    // 11
    public static void isAlphabet() {
        System.out.println("Question 11");

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println((Character.isLetter(ch)) ? "Alphabet" : "Not Alphabet");
    }

    // 12
    public static void vowelOrConsonant() {
        System.out.println("Question 12");

        System.out.print("Enter an alphabet: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));
        System.out.println("aeiou".indexOf(ch) != -1 ? "Vowel" : "Consonant");
    }

    // 13
    public static void characterType() {
        System.out.println("Question 13");

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (Character.isLetter(ch)) System.out.println("Alphabet");
        else if (Character.isDigit(ch)) System.out.println("Digit");
        else System.out.println("Special Character");
    }

    // 14
    public static void caseCheck() {
        System.out.println("Question 14");

        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);
        if (Character.isUpperCase(ch)) System.out.println("Uppercase");
        else if (Character.isLowerCase(ch)) System.out.println("Lowercase");
        else System.out.println("Not an Alphabet");
    }

    // 15
    public static void areaVsPerimeter() {
        System.out.println("Question 15");

        System.out.print("Enter length and breadth: ");
        int l = sc.nextInt(), b = sc.nextInt();
        int area = l * b, peri = 2 * (l + b);
        System.out.println(area > peri ? "Area is greater" : "Perimeter is greater or equal");
    }

    // 16
    public static void dayName() {
        System.out.println("Question 16");

        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        if (day >= 1 && day <= 7) System.out.println(days[day - 1]);
        else System.out.println("Invalid day number");
    }

    // 17
    public static void calculator() {
        System.out.println("Question 17");

        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble(), b = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+': System.out.println("Result: " + (a + b)); break;
            case '-': System.out.println("Result: " + (a - b)); break;
            case '*': System.out.println("Result: " + (a * b)); break;
            case '/':
                if (b != 0) System.out.println("Result: " + (a / b));
                else System.out.println("Division by zero error");
                break;
            default: System.out.println("Invalid operator");
        }
    }

    // 18
    public static void generateRandomNumber() {
        System.out.println("Question 18");

        Random rand = new Random();
        int randNum = rand.nextInt(100); // 0 to 99
        System.out.println("Random Number: " + randNum);
    }

    // 19
    public static void quadraticRoots() {
        System.out.println("Question 19");

        System.out.print("Enter coefficients a, b, c: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double d = b * b - 4 * a * c;
        if (d > 0) {
            System.out.println("Roots: " + ((-b + Math.sqrt(d)) / (2 * a)) + " and " + ((-b - Math.sqrt(d)) / (2 * a)));
        } else if (d == 0) {
            System.out.println("One Root: " + (-b / (2 * a)));
        } else {
            System.out.println("Imaginary Roots");
        }
    }

    // 20
    public static void daysInMonth() {
        System.out.println("Question 20");

        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12: System.out.println("31 Days"); break;
            case 4, 6, 9, 11: System.out.println("30 Days"); break;
            case 2: System.out.println("28/29 Days"); break;
            default: System.out.println("Invalid Month");
        }
    }

    // 21
    public static void vowelSwitchCase() {
        System.out.println("Question 21");

        System.out.print("Enter a character: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u': System.out.println("Vowel"); break;
            default: System.out.println("Consonant");
        }
    }

    // 22
    public static void daysOfMonthSwitch() {
        System.out.println("Question 22");

        System.out.print("Enter month number: ");
        int month = sc.nextInt();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12: System.out.println("31 Days"); break;
            case 4, 6, 9, 11: System.out.println("30 Days"); break;
            case 2: System.out.println("28/29 Days"); break;
            default: System.out.println("Invalid Month");
        }
    }
}
