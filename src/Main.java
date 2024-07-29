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
        // В обсуждении домашки был похожий вопрос, но я немного не поняла, так можно было бы написать в этом ДЗ или так в принципе не рекомендуется записывать?
        // Если не рекомендуется, то в будущем мы можем забить на byte short и просто везде использовать int (long, как понимаю, редко где используется)? А что тогда на счет высоконагруженных систем, где объем памяти важен?
        int paperToEachPupil = sheetsOfPaperAll / (pupilsLyP + pupilsAnS + pupilsEkA);
        System.out.println("На каждого ученика рассчитано " + paperToEachPupil + " листов бумаги");

        //Задание 4
        byte time = 2;
        byte bottles = 16;
        int inOneMinuteW = bottles / time;
        byte time1 = 20;
        int in20MinW = inOneMinuteW * time1;
        System.out.println("За 20 минут машина произвела " + in20MinW + " штук бутылок");
        short time2 = 24;
        time2 = 24 * 60;
        int in1DayW = inOneMinuteW * time2;
        System.out.println("За сутки машина произвела " + in1DayW + " штук бутылок");
        short time3 = 3;
        time3 = 24 * 3 * 60;
        int in3DaysW = inOneMinuteW * time3;
        System.out.println("За 3 суток машина произвела " + in3DaysW + " штук бутылок");
        int time4 = 30;
        time4 = 30 * 24 * 60;
        int inOneMonthW = inOneMinuteW * time4;
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

        //Задание 7
        //Задание 8
    }
}