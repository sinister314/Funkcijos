import java.util.Arrays;
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

        System.out.println();

        System.out.println("-----uzt.9-----");
        //9.Sukurkite Funkciją kuri priimtų du int skaičius ir atspausdintų stačiakampį užpildytą žvaigždutėmis.
        // Pirmas int - išoriniam ciklui, antras vidiniam.

        int eilutes = 4;
        int stulpeliai = 7;

        spausdintiStaciakampy(eilutes, stulpeliai);

        System.out.println();

        System.out.println("-----uzt.10-----");
        //10.Sukurkite Funkciją kuri priimtų sakinį kaip kintamąjį ir atspausdintų kiek jame yra raidžių ir tarpų.
        // Sakinys - “Šiandien labai graži diena”. (kodas turi veikti padavus bet kokį sakinį)

        String sakinys = "Siandien Labai GraziDiena";

        skaiciuotiRaidesIrTarpus(sakinys);

        System.out.println();

        System.out.println("---------uzt.11--------");
        //11.Sukurkite Funkciją kuri priimtų sakinį, jį užkoduotų ir grąžintų.
        // Kodavimas - sakinį apsukame iš kitos pusės. Pvz “Naglis” turi gautis “silgaN”

        String pradinisSakinys = "sulA";
        String uzduotas = uzduotiSakini(pradinisSakinys);

        System.out.println("Pradinis Sakinys" + " " + pradinisSakinys);
        System.out.println("Uzduotas Sakinys" + " " + uzduotas);

        System.out.println();
        System.out.println("----Sunksni Uzt.1----- ");
        //Parašykite funkciją, kurios argumentas būtų tekstas,
        // kuris būtų atspausdinamas konsolėje pridedant “---” pradžioje ir gale.
        // PVZ (---labas---)

        String ManoTextas = "Vilnius Coding School";
        spausdintiSuBruksniukais(ManoTextas);

        System.out.println();
        System.out.println("-----uzt.2-----");
        //Sugeneruokite atsitiktinį stringą iš raidžių ir skaičių (10 simbolių).
        // Atspausdinkite simbolius stulpeliu. Jei tai skaičius apgaubkite “ [ 7 ]”.
        // Jei skaičiai eina keli iš eilės, apgaubkite juos kartu. [75].

        int ilgis = 10;
        String atsitiktinisStringas = generuotiAtsitiktiniStringa(ilgis);

        System.out.println("Atsitiktinis stringas: " + atsitiktinisStringas);
        System.out.println("Simboliai stulpeliu:");
        atspausdinti(atsitiktinisStringas);

        System.out.println();
        System.out.println("-----uzt.3-----");
        //Parašykite funkciją, kuri skaičiuotų,
        // ir gražintų iš kiek sveikų skaičių jos argumentas dalijasi be liekanos
        // (išskyrus vienetą ir patį save).

        int skaicius = 12;
        int dalikliuSk = skaiciuotiDaliklius(skaicius);

        System.out.println(" Skaicius : " + skaicius + " Dalijasi be liekanos is :" + dalikliuSk + " " + "skaiciu");

        System.out.println();
        System.out.println("-----uzt.4-----");
        //Sugeneruokite masyvą iš 100 elementų, kurio reikšmės atsitiktiniai skaičiai nuo 33 iki 77.
        // Išrūšiuokite masyvą pagal daliklių be liekanos kiekį mažėjimo tvarka, panaudodami trečio uždavinio funkciją.

        int[] masyvas1 = new int[100];
        int  dalikliuSk1 = skaiciuotiDa(skaicius);


        Random rand = new Random();

        for (int i = 0; i < masyvas1.length; i++) {
            masyvas1[i] = rand.nextInt(45) + 33;
        }

        Arrays.sort(masyvas1);

        System.out.println(dalikliuSk1);
        System.out.println(Arrays.toString(masyvas1));



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

    public static int[] genAtsSk(int mi, int ma, int Length) {
        int[] skMa = new int[Length];
        Random random = new Random();

        for (int i = 0; i < Length; i++) {
            skMa[i] = random.nextInt(mi, ma);
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

    public static void spausdintiStaciakampy(int eilutes, int stulpeliai) {
        for (int i = 0; i < eilutes; i++) {
            for (int j = 0; j < stulpeliai; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void skaiciuotiRaidesIrTarpus(String sakinys) {
        int RaidziuSkaicius = 0;
        int TarpuSkaicius = 0;

        for (char simbolis : sakinys.toCharArray()) {
            if (Character.isLetter(simbolis)) {
                RaidziuSkaicius++;
            } else if (simbolis == ' ') {
                TarpuSkaicius++;
            }
        }
        System.out.println("Raidziu Skaicius" + RaidziuSkaicius);
        System.out.println("Tarpu Skaicius" + TarpuSkaicius);
    }

    public static String uzduotiSakini(String sakinys) {
        StringBuilder uzkoduotasSakinys = new StringBuilder();
//String txt = "";
        for (int i = sakinys.length() - 1; i >= 0; i--) {
            uzkoduotasSakinys.append(sakinys.charAt(i));
//txt += sakinys.charAt(i);
        }
        return uzkoduotasSakinys.toString();

    }

    public static void spausdintiSuBruksniukais(String textas) {
        System.out.println("----" + textas + "----");
    }

    public static String generuotiAtsitiktiniStringa(int ilgis) {
        String galimosRaides = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder atsitiktinisStringas = new StringBuilder();

        for (int i = 0; i < ilgis; i++) {
            char simbolis = galimosRaides.charAt(rand.nextInt(galimosRaides.length()));
            atsitiktinisStringas.append(simbolis);
        }

        return atsitiktinisStringas.toString();
    }

    public static void atspausdinti(String tekstas) {
        for (char simbolis : tekstas.toCharArray()) {
            if (Character.isDigit(simbolis)) {
                System.out.print(" [" + simbolis + "] ");
            } else {
                System.out.print(simbolis + " ");
            }
            if (simbolis == ' ' || !Character.isLetterOrDigit(simbolis)) {
                System.out.println();
            }
        }
    }

   /* public static String generateRndStr(int length) {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345678901234567890";
        String text = "";
        for (int i = 0; i < length; i++) {
            text += symbols.charAt((int) (Math.random()*symbols.length()));
        }
        return text;
    }
    */

    public static int skaiciuotiDaliklius (int skaicius){
        int dalikliuSkaicius = 0;
        for (int i = 2; i <= skaicius / 2; i++) {
            if (skaicius % i == 0) {
                dalikliuSkaicius++;
            }
        }
        return dalikliuSkaicius;

    }


    public static int skaiciuotiDa(int skaicius) {
        int dalikliuSk1 = 0;

        for (int i = 2; i <= skaicius / 2; i++) {
            if (skaicius % i == 0) {
                dalikliuSk1++;
            }
        }

        return dalikliuSk1;
    }









}