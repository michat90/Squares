public class DataTypes {
    public static void main(String[] args) {
//        liczby calkowite
        //byte - 1  00000000
        //short -2  00000000 00000000
        //int - 4   00000000 00000000 00000000 00000000
        //long - 8  00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000

        //domyślnie liczby traktowane są jako int
        System.out.println(2315);
        System.out.println(23156544525L);  // dodając L to liczba jest traktowana jako long

        byte b = -120;
        short s = 31678;
        int i = 1_113_521_854;
        long l = i * b;
        long itemsNumbers = 23546655555422155L;
        char c = 12;
        System.out.println(c);


        //liczby zmiennoprzecinkowe
        //float -4
        //double -8


        //domyślnie traktowane sa jako double

        double a= 34.35;
        float f = 15.12f;

        //typ znakowy
        System.out.println('\''); // znak apostrofu
        System.out.println('\t'); // znak tabulatora
        char d =64; //ASCII
        System.out.println(64);
        System.out.println((int)d); //konwersja do ASCII

        //Typ logiczny
        System.out.println(true);
        System.out.println(false);

        boolean choosen = true;


        //Ciągi znaków

        String name = "Ala";
        System.out.println(name);
        System.out.println("Cześć jestem " + name);
        System.out.println(1 + 2 + "tekst");
        System.out.println("" + 1 + 2 + "tekst");


    }
}
