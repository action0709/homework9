import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1,2");
        // Пишем код для задачи 1

        int[] numbers = new int[]{1, 2, 3};
        double[] dbl = {1.57, 7.654, 9.986};
        long[] budget = {1_000_000_000L, 345000000L, 65737509837097L};
        for (int i = 0; i < (numbers.length); i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {

                System.out.print(numbers[i] + ", ");
            }

        }
        System.out.println();
        for (int i = 0; i < (dbl.length); i++) {
            if (i == dbl.length - 1) {
                System.out.print(dbl[i]);
            } else {

                System.out.print(dbl[i] + ", ");
            }

        }
        System.out.println();
        for (int i = 0; i < (budget.length); i++) {
            if (i == budget.length - 1) {
                System.out.print(budget[i]);
            } else {

                System.out.print(budget[i] + ", ");
            }

        }
        System.out.println();
    }


    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3

        int[] numbers = new int[]{1, 2, 3};
        double[] dbl = {1.57, 7.654, 9.986};
        long[] budget = {1_000_000_000L, 345000000L, 65737509837097L};
        int i = 0;

        for (i = numbers.length - 1; i <= (numbers.length - 1) && i >= 0; i--) {
            if (i == 0) {
                System.out.print(numbers[i]);
            } else {

                System.out.print(numbers[i] + ", ");


            }

        }
        System.out.println();
        for (i = dbl.length - 1; i <= (dbl.length - 1) && i >= 0; i--) {
            if (i == 0) {
                System.out.print(dbl[i]);
            } else {

                System.out.print(dbl[i] + ", ");


            }

        }
        System.out.println();
        for (i = budget.length - 1; i <= (budget.length - 1) && i >= 0; i--) {
            if (i == 0) {
                System.out.print(budget[i]);
            } else {

                System.out.print(budget[i] + ", ");


            }

        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        int[] numbers = new int[]{1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = numbers[i] + 1;
            }}
            System.out.println(Arrays.toString(numbers));
    }
}
