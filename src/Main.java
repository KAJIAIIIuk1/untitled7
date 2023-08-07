public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int age = 18;
        if (age > 18) {
            System.out.println(" возраст совершеннолетия еще не наступил и нужно немного подождать. ");
        } else {
            System.out.println("человеку 18 или больше лет");
        }
        if (age < 18) {
            System.out.println("человеку 18 или больше лет");
        } else {
            System.out.println("возраст совершеннолетия еще не наступил и нужно немного подождать.");
        }
        int Temperature = 0;
        if (Temperature < -5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        if (Temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        int speed = 60;
        if (speed < 60) {
            System.out.println("скорость превышена, если она больше 60 км/ч");
        } else {
            System.out.println("превышения скорости нет, если она равна 60 км/ч и меньше");
        }
        if (speed > 60) {
            System.out.println("скорость превышена, если она больше 60 км/ч");
        } else {
            System.out.println("скорость превышена, если она больше 60 км/ч");
        }
        int Age = 0;
        if (Age < 2) {
            System.out.println("если человеку " + Age + " то ему пора спать");
        } else if (Age >= 2 && Age <= 6) {
            System.out.println("если человеку " + Age + " то ему нужно ходить в детский сад");
        } else if (Age >= 7 && Age <= 18) {
            System.out.println("если человеку " + Age + "то ему нужно ходить в школу");
        } else if (Age >= 18 && Age <= 24) {
            System.out.println("если человеку " + Age + " то его место в университете");
        } else if (Age > 24) {
            System.out.println("если человеку " + Age + " то ему пора ходить на работу");
        } else if (Age > 60) {
            System.out.println("если человеку " + Age + " то он может отдохнуть");

        }
        int AtrakcionAge = 14;
        if (AtrakcionAge < 5) {
            System.out.println("если ребенку " + AtrakcionAge + " лет.то он не может кататся на атракционе ");
        }else if (AtrakcionAge >= 5 && AtrakcionAge < 14) {
            System.out.println("если ребенку " + AtrakcionAge + " лет.но меньше 14 лет то он может кататся на атракционе но в сопровождении взрослого.если взрослого нет то нельзя");
        } else if (AtrakcionAge >= 14) {
            System.out.println("если ребенку " + AtrakcionAge + " то он может кататся на атрокционе без сопровождения взрослого");



    }
        int placesVan = 67;
        if (placesVan < 102) {
            System.out.println("В вагоне места есть");
        }else {
            System.out.println("В вагоне мест нет");
        }
        if (placesVan <= 102 && placesVan <= 60) {
            System.out.println("вы поедите сидя");
        }
        if (placesVan <= 102 && placesVan > 60){
            System.out.println("вы поедите стоя");
        }
        int one = 3;
        int two = 16;
        int three = 341;
        if (one >= two && one >= three) {
            System.out.println(one);
        } else if (two >= one && two >= three) {
            System.out.println(two);
        } else if (three >= one && three >= two) {
            System.out.println(three);


    }
    }
}