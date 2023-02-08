import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* There is a folk rule stating the number of pages you should read before giving up on a book is 100 - your age. For example, a 21 year old needs to read 79 pages ( 100 - 21 ).
Write a program that stores your age as an integer in a variable named age. The program then computes and displays the minimal number of pages to read.

A sample run could be:

Prompt + input :
Enter your age: 30

Output :
30 year olds should read at least 70 pages before giving up on a book.

Credit: Thanks to Jim Cohoon at The University */

        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?:");

        int age = scanner.nextInt();

        int pages = 100 - age;

        String output = ""+age+" year olds should read at least "+pages+" pages before giving up on a book";

        System.out.println(output);

    }
}