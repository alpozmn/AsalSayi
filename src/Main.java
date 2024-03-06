public class Main {
    public static void main(String[] args) {
        System.out.println("1 ile 100 arasındaki asal sayılar:");

        // Asal sayıları kontrol etmek için döngü
        for (int i = 2; i <= 100; i++) {
            boolean asal = true;

            // Asal kontrolü
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    asal = false;
                    break;
                }
            }

            // Asal sayıyı ekrana yazdır
            if (asal) {
                System.out.print(i + " ");
            }
        }
    }
}
