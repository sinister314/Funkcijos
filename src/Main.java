import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----Funkcijos-----");

        System.out.println("----uzt.1----");

        //1Sukurkite Funkciją kuri priima du int tipo kintamuosius.
        // Juos susumuoja ir atspausdina

        int x = 5;
        int y = 7;
        int rez = x + y;
        System.out.print("Suma:" + rez);

        System.out.println();

        System.out.println("-------uzt.2-------");
        double rezultatas = PISq();
        System.out.println("Reikšmė: " + rezultatas);


        //2.Sukurkite Funkciją kuri vadinasi PISq.
        // Funkcija gražina double tipo reikšmę. Reikšmė yra : 9.8596;
        // Gautą reikšmę atspausdinkite.
        System.out.println("-------uzt.3-------");

        int pirmasSk1 = 5;
        int antrasSk2 = 7;

        int sandauga = dauginti(pirmasSk1, antrasSk2);
        System.out.println(sandauga);
        System.out.println(dauginti(pirmasSk1, antrasSk2));

        System.out.println();
        //  Sukurkite Funkciją kuri priima int[] tipo kintamąį,
        //  prasuka ciklą ir atspausdina kiekvieną skaičių
        System.out.println("-----uzt.4-----");

        int[] masyvas = {1, 2, 3, 4, 5};
        spausdintiMasyva(masyvas);

        System.out.println();

        System.out.println("------uzt5-----");
        //Sukurkite Funkciją kuri priima du int tipo kintamuosius,
        // min ir max reikšmėms nustatyti ir sugeneruoja random int skaičių ir jį gražintų.

        int minReiksme = 5;
        int maxReiksme = 10;


        int atsitiktinisSkaicius = generuotiAtsitiktiniSkaiciu(minReiksme, maxReiksme);
        System.out.println("Sugeneruotas atsitiktinis skaicius:" + atsitiktinisSkaicius);

        System.out.println();

        System.out.println("------uzt.6-------");
        //Sukurkite Funkciją kuri sugeneruotų random int skaičių masyvą ir jį gražintų.
        // Funkcija priima tris int tipo kintamuosius, min, max ir length reikšmėms nustatyti.

        int mi = 2;
        int ma = 4;
        int Length = 50;
        int[] atsSk = genAtsSk(mi, ma, Length);
        spausdintiMasyva(atsSk);

        System.out.println();

        System.out.println("------uzt.7-------");
        //Sukurkite Funkciją kuri panaudotų 6tos užduoties masyvą
        // (priimtų kaip kintamąjį), susumuotų ir gražintų reikšmę.

        sumuotiMasyva(atsSk);
        int[] miau = genAtsSk(mi, ma, Length);
        int suma = susumuotiMasyva(miau);
        System.out.println("Suma: " + suma);

        System.out.println();

        System.out.println("-------uzt.8------");

        int[] atsitiktiniaiSkaiciai = genAtsSk(mi, ma, Length);
        double vidurkis = skaiciuVidurkis(atsitiktiniaiSkaiciai);
        System.out.println("Vidurkis: " + vidurkis);






    }

    private static void sumuotiMasyva(int[] miau) {
    }


    public static void sumAndPrint(int y, int x) {
        int sum = y + x;
        System.out.println(sum);
    }

    public static double PISq() {
        return 9.8596;
    }


    // Sukurkite Funkciją kuri priima du int tipo kintamuosius.
    // Funkcija gražina skaičių sandaugą.; Gautą reikšmę atspausdinkite.


    public static int dauginti(int x, int y) {

        int rezultatas = x * y;

        return rezultatas;

    }

    public static void spausdintiMasyva(int[] masyvas) {
        for (int skaicius : masyvas) {
            System.out.print(" " + skaicius);

        }

        System.out.println();
    }

    public static int generuotiAtsitiktiniSkaiciu(int minReiksme, int maxReiksme) {
        int atsitiktinisSkaicius = (maxReiksme - minReiksme + 5) + minReiksme;
        //   System.out.println("Sugeneruotas atsitiktinis skaicius:" + atsitiktinisSkaicius);
        return atsitiktinisSkaicius;

    }


        public static int[] genAtsSk ( int mi, int ma, int Length){
            int[] skMa = new int[Length];
            Random random = new Random();

            for (int i = 0; i < Length; i++) {
                skMa[i] = random.nextInt(mi,ma) ;
            }
            return skMa;
        }


        public static int susumuotiMasyva(int[] masyvas) {
            int suma = 0;

            for (int skaicius : masyvas) {
                suma += skaicius;
            }
            return suma;
        }


    public static double skaiciuVidurkis(int[] masyvas) {
        int suma = 0;

        for (int skaicius : masyvas) {
            suma += skaicius;
        }

        return (double) suma / masyvas.length;
    }
















    }




