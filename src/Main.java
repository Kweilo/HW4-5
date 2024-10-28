//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задача 1

        int age = 17;
        if (age >= 18) {
            System.out.println("Он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
         age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний ");
        } else {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
        }

        //Задача 2
        int weather = 10;
        if (weather > 5) {
            System.out.println("На улице " + weather + " градусов,  можно идти без шапки");
        } else {
            System.out.println("На улице " + weather + " градусов , нужно надеть шапку");

        }
        weather = -10;
        if (weather > 5) {
            System.out.println("На улице " + weather + " градусов,  можно идти без шапки");
        } else {
            System.out.println("На улице " + weather + " градусов , нужно надеть шапку");

            //Задача 3
             int drive = 60;
            if (drive > 60) {
                System.out.println("Если скорость " + drive + ", то придется заплатить штраф");
            } else {
                System.out.println("Если скорость " + drive + ", то можно ездить спокойно");
            }
            drive = 70;
            if (drive > 60) {
                System.out.println("Если скорость " + drive + ", то придется заплатить штраф");
            } else {
                System.out.println("Если скорость " + drive + ", то можно ездить спокойно");
            }

            //Задача 4
            int age2 = 5;
            if (age2 >= 2 && age2 <= 6) {
                System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");
            }
            age2 = 16;
            if (age2 >= 7 && age2 <= 17) {
                System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить  в школу");
            }
            age2 = 20;
            if (age2 >= 18 && age2 <= 24) {
                System.out.println("Если возраст человека равен " + age2 + ", то его место в университете.");
            }
            age2 = 30;
            if (age2 >= 24) {
                System.out.println("Если возраст человека равен " + age2 + ", то ему пора ходить на работу.");
            }

            //Задача 5
            int age3 = 4;
            if (age3 < 5) {
                System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе ");
            }
            age3 = 5;
            if (age3 >= 5 && age3 < 14) {
                System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе в сопровождении взрослого ");
            }
            age3 = 14;
            if (age3 >= 14) {
                System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе без сопровождения взрослого ");
            }
            //Задача 6
            int train = 101;
            if (train <= 60) {
                System.out.println("Если число мест " + train + ", то остались сидячие места ");
            } else if (train > 60 && train < 102) {
                System.out.println("Если число мест " + train + ", то остались только стоячие места ");
            } else if  (train >= 102) {
                System.out.println("Если число мест " + train + ", то мест нет");
            }
            //Задача 7
            byte one = 10;
            byte two = 6;
            byte three = 7;
            if (one > two && one > three ) {
                System.out.println("Число one больше остальных");
            } else if (two > one &&  two > three) {
                System.out.println("Число two больше остальных");
            } else {
                System.out.println("Число three больше остальных");
            }
        }
    }
}