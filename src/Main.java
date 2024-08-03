public class Main {
    public static void main(String[] args) {
        //Задание 1
        int trees = 467;
        byte flowers = 125;
        short weight = 30000;
        long height = 444444444L;
        float a1 = 2.456777f;
        double b1 = 3.3456888888888;
        System.out.println("Значение переменной trees с типом int равно " + trees);
        System.out.println("Значение переменной flowers с типом byte равно " + flowers);
        System.out.println("Значение переменной weight с типом short равно " + weight);
        System.out.println("Значение переменной height с типом long равно " + height);
        System.out.println("Значение переменной a с типом float равно " + a1);
        System.out.println("Значение переменной b с типом double равно " + b1);

        //Задание 2
        float a = 27.12f;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        //Задание 3
        byte pupilsLyP = 23;
        byte pupilsAnS = 27;
        byte pupilsEkA = 30;
        short sheetsOfPaperAll = 480;
        // byte paperToEachPupil = (byte) (sheetsOfPaperAll / (pupilsLyP + pupilsAnS + pupilsEkA));
        // В обсуждении домашки был похожий вопрос, наставник написал, что лучше использовать int, тк это увеличивает надежность кода. Но я немного не поняла, так можно было бы написать в этом ДЗ или так в принципе не рекомендуется записывать?
        // Если не рекомендуется, то в будущем мы можем забить на byte short и просто везде использовать int (long, как понимаю, редко где используется)? А что тогда на счет высоконагруженных систем, где объем памяти важен?
        int paperToEachPupil = sheetsOfPaperAll / (pupilsLyP + pupilsAnS + pupilsEkA);
        System.out.println("На каждого ученика рассчитано " + paperToEachPupil + " листов бумаги");

        //Задание 4
        byte time = 2;
        byte bottles = 16;
        int inOneMinuteW = bottles / time;
        byte time20Min = 20;
        int in20MinW = inOneMinuteW * time20Min;
        System.out.println("За 20 минут машина произвела " + in20MinW + " штук бутылок");
        short time24Hour = 24;
        int in1DayW = time24Hour * 60 * inOneMinuteW;
        System.out.println("За сутки машина произвела " + in1DayW + " штук бутылок");
        short time3Days = 3;
        int in3DaysW = time3Days * 60 * 24 * inOneMinuteW;
        System.out.println("За 3 суток машина произвела " + in3DaysW + " штук бутылок");
        int time1Month = 30;
        int inOneMonthW = time1Month * 24 * 60 * inOneMinuteW;
        System.out.println("За месяц (30 дней) машина произвела " + inOneMonthW + " штук бутылок");

        //Задание 5
        byte tinsAll = 120;
        byte whiteColorOneClass = 2;
        byte brownColorOneCLass = 4;
        int classesInSchool = tinsAll / (whiteColorOneClass + brownColorOneCLass);
        int whiteTinsAll = whiteColorOneClass * classesInSchool;
        int brownTinsAll = brownColorOneCLass * classesInSchool;
        System.out.println("В школе, где " + classesInSchool + " классов, нужно " + whiteTinsAll + " банок белой краски и " + brownTinsAll + " банок коричневой краски");

        //Задание 6
        byte bananasAll = 5;
        short milkAll = 200;
        byte iceCreamAll = 2;
        byte eggsAll = 4;
        int bananasWeight = bananasAll * 80;
        System.out.println("Вес бананов равен " + bananasWeight + "г");
        int milkWeight = (milkAll * 105) / 100;
        System.out.println("Вес молока равен " + milkWeight + "г");
        int iceCreamWeight = iceCreamAll * 100;
        System.out.println("Вес мороженого равен " + iceCreamWeight + "г");
        int eggsWeight = eggsAll * 70;
        System.out.println("Вес яиц равен " + eggsWeight + "г");
        int breakfastWeightG = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        System.out.println("Вес спортзавтрака в граммах равен " + breakfastWeightG);
        float breakfastWeightKg = breakfastWeightG / 1000f;
        System.out.println("Вес спортзавтрака в килограммах равен " + breakfastWeightKg);

        //Задание 7
        short weightLossInDay = 250;
        short weightLossInDay2 = 500;
        byte weightToLose = 7;
        int days1 = (weightToLose * 1000) / weightLossInDay;
        System.out.println("На похудение уйдет " + days1 +" дней, если спортсмен будет терять каждый день по " + weightLossInDay + " грамм");
        int days2 = (weightToLose * 1000) / weightLossInDay2;
        System.out.println("На похудение уйдет " + days2 +" дней, если спортсмен будет терять каждый день по " + weightLossInDay2 + " грамм");
        int daysAverage = (days1 + days2) / 2;
        System.out.println("В среднем понадобится " + daysAverage + " день, чтобы добиться результата похудения");

        //Задание 8
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int mashaSalaryYear = mashaSalary * 12;
        float masha10 = mashaSalary + (mashaSalary * 0.1f);
        float mashaSalaryYear10 = masha10 * 12;
        float mashaIncome = mashaSalaryYear10 - mashaSalaryYear;
        System.out.println("Маша теперь получает " + masha10 + " рублей. Годовой доход вырос на " + mashaIncome + " рублей");
        int denisSalaryYear = denisSalary * 12;
        int denis10 = denisSalary + ((denisSalary * 10) / 100);
        int denisSalaryYear10 = denis10 * 12;
        int denisIncome = denisSalaryYear10 - denisSalaryYear;
        //а так корректно или лучше через float записывать?
        System.out.println("Денис теперь получает " + denis10 + " рублей. Годовой доход вырос на " + denisIncome + " рублей");
        int krisSalaryYear = kristinaSalary * 12;
        int kris10 = kristinaSalary + ((kristinaSalary * 10) / 100);
        int krisSalaryYear10 = kris10 * 12;
        int krisIncome = krisSalaryYear10 - krisSalaryYear;
        System.out.println("Кристина теперь получает " + kris10 + " рублей. Годовой доход вырос на " + krisIncome + " рублей");

    }
}