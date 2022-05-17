package _8pattern_syntax_checker;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.nextLine();
        for (int i = 0; i < N; i++) {
            try {
                String string = input.nextLine();
                System.out.println(string);
                Pattern.compile(string);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
    }
}