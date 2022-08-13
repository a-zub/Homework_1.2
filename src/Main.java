// homework #2
// Aleksandar Zubanov
// 2022/07/29


public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    // task # 1
    public static void task1(){
        // byte age = 50;
        // short tasks = 259;
        // int peopleInChina = 1_500_000;
        // long starsOnTheSky = 3_243_242_423_42l;

        // float myWeight = 87.5f;
        // double widthNeve = 115.5789543787;

        // boolean isTrue = 2 < 4;
        // char E = 69;
    }

    // task # 2
    public static void task2(){

        float boxer_1 = 78.2f;
        float boxer_2 = 82.7f;

        float allWeight = boxer_1 + boxer_2;
        float weightDifference = Math.abs(boxer_1 - boxer_2);

        System.out.println("All weight of boxers is: " + allWeight + "kg.");
        System.out.println("Is weight difference of boxers: " + weightDifference + "kg.");
    }

    // task # 3
    public static void task3(){

        int bananas = 5;
        int bananasGrams = 80;
        int bananasWeight = bananas * bananasGrams;

        int milk = 200;
        int milkGrams = 105;
        int milkWeight = (milk / 100) * milkGrams;

        int iceCream = 2;
        int iceCreamCrams = 100;
        int iceCreamWeight = iceCream * iceCreamCrams;

        int eggs = 4;
        int eggsGrams = 70;
        int eggsWeight = eggs * eggsGrams;

        int kilogram = 1000;

        float totalWeight = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;

        System.out.println("Total Weight is: " + totalWeight / kilogram + " kg.");
    }

    // task # 4
    public static void task4(){

        int startingWeight = 7;
        int weightLoss_1 = 250;
        int weightLoss_2 = 500;

        int translateKg = startingWeight * 1000;
        int stopWeight250 = translateKg / weightLoss_1;
        int stopWeight500 = translateKg / weightLoss_2;
        int average = (stopWeight250 + stopWeight500) / 2;

        System.out.println("if you lose weight by 250 grams per day: " + stopWeight250 + " days");
        System.out.println("if you lose weight by 500 grams per day: " + stopWeight500 + " days");
        System.out.println("Average amount of days: " + average + " days");
    }

    // task # 5
    public static void task5(){

        int masha = 67760;
        int denise = 83690;
        int kristina = 76230;

        int mashaSalary = ((masha / 100) * 10) + masha;
        int mashaGrowth = (mashaSalary * 12) - (masha * 12);

        int deniseSalary = ((denise / 100) * 10) + denise;
        int deniseGrowth = (deniseSalary * 12) - (denise * 12);

        int kristinaSalary = ((kristina / 100) * 10) + kristina;
        int kristinaGrowth = (kristinaSalary * 12) - (kristina * 12);

        System.out.println("Маша теперь получает " + mashaSalary + " рублей. Годовой доход вырос на " + mashaGrowth + " рублей.");
        System.out.println("Денис теперь получает " + deniseSalary + " рублей. Годовой доход вырос на " + deniseGrowth + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaSalary + " рублей. Годовой доход вырос на " + kristinaGrowth + " рублей.");
    }
}
