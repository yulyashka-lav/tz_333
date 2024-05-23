import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
public class Mainn {
    static int _min(int[] sp) {
        int m = sp[0];
        for (int i: sp){
            m = Math.min(m, i);
        }
        return m;
    }
    static int _max(int[] sp) {
        int m = sp[0];
        for (int i: sp){
            m = Math.max(m, i);
        }
        return m;
    }
    static int _sum(int[] sp) {
        int m = 0;
        for (int i: sp){
            m = m + i;
        }
        return m;
    }
    static int _mult(int[] sp) {
        int m = 1;
        for (int i: sp){
            m = m * i;
        }
        return m;
    }
    public static int[] readFromFile(String file_name) throws FileNotFoundException {
        File file = new File(
                file_name);
        Scanner sc = new Scanner(file);
        String line = sc.nextLine();
        String[] tokens = line.split(" ");
        int[] numbers = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            numbers[i] = Integer.parseInt(tokens[i]);
        }
        return numbers;
    }

    public static void main(String[] args) {
        try {
            int[] nums = readFromFile("C:\\Users\\User\\IdeaProjects\\untitled\\src\\input.txt");
            int minim = _min(nums);
            int maxim = _max(nums);
            int summa = _sum(nums);
            int proizv = _mult(nums);
            System.out.println("Минимальное: " + minim);
            System.out.println("Максимальное: " + maxim);
            System.out.println("Сумма: " + summa);
            System.out.println("Произведение: " + proizv);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}