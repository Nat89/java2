//public class Main {
//    // algorytm potęgowania
//    public int power (int x, int y) {
//
//        int result = 1;
//        // 3
//        for (int i = 1; i <= y; i++) {
//            result = result * x;
//        }
//        return result;
//    }
//        // algorytm silnia z n
//        public int factorial (int n) {
//            // 2
//            int result = 1;
//            // 3 }
//            for (int i = n; i > 1; i--) {
//                result = result * i;
//
//            }
//
//        return result;
//
//    }
//    // algorytm ciągu geometrycznego
//    public int geoSequence(int a0, int q, int n) {
//        int sum = 0;
//        for (int i = 0; i <= n-1; i++) {
//            sum = sum + (a0 * power(q, i));
//
//        }
//        return sum;
//
//    }
//    public int algSequence (int a0, int r, int n) {
//        int sum = 0;
//        for (int i = 0; i <= n-1; i++) {
//            sum = sum + (a0 + i*r);
//
//        }
//        return  sum;
//
//    }
//    public boolean perfectNum(int num) {
//        int sum = 0;
//        for (int i = 1; i < num; i++) {
//            if (num % i == 0) {
//                sum = sum + i;
//            }
//        }
//        return num == sum ? true : false;
//    }
//    public int getNWD(int x, int y) {
//        int less = x;
//        int greater = y;
//        if (x > y) {
//            less = y;
//            greater = x;
//        }
//        // 2. Iterujemy w petli i sprawdzamy czy dzielnik less jest tez dzielnikiem greater
//        for(int i = less; less > 1; i--){
//            if(less % i == 0 && greater % i == 0){
//                return i;
//            }
//        }
//        return 1;
//    }
//    public String decimalToBinary(int decimal) {
//        String binary = "";
//        while (decimal >= 1) {
//            binary = binary.concat(String.valueOf(decimal % 2));
//            decimal = decimal / 2;
//        }
//        return  binary;
//
//
//    }
//    public boolean isPrimary(int number) {
//        // 1. inicjalizacja licznika podlicznikow
//        // 2 w petli for zliczamy wszystkie liczby naturalne do liczby number kazdorazowo sprawdzajac w instrukcji if czy te liczby sa dzielnikami number
//        // tak - licznik ++
//        // nie = nic
//        // 3 zwracamy true jezeli licznik == 0 : false jezeli licznik > 0
//
//        public boolean int;
//        int
//    }
//}
