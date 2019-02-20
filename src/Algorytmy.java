public class Algorytmy {
    public static void main(String[] args) {
        Main a = new Main();
        System.out.println("Wynik potęgowania: " + a.power(3, 4));
        System.out.println("Wynik silni: " + a.factorial (4));
        System.out.println("Suma cg: " + a.geoSequence (2,2,3));
        System.out.println("Suma cg: " + a.algSequence (2,2,4));
        System.out.println("Czy doskonała: " + a.perfectNum (6));
        System.out.println("Czy doskonała: " + a.perfectNum (11));
        System.out.println("Czy doskonała: " + a.perfectNum (28));
        System.out.println("NWD: " + a.getNWD (12, 9));
        System.out.println("DtB: " + a.decimalToBinary(12));
    }

}
