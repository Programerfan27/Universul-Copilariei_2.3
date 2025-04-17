public class Main {

    public static void main(String[] args) throws InterruptedException {
        String soare = "    \\   |   /   \n" +
                       "     .-'☀'-.\n" +
                       "  ― (   o   ) ―\n" +
                       "     '-._.-'\n" +
                       "    /   |   \\";

        for (int i = 10; i >= 0; i--) {
            // Curățăm ecranul (doar simulare în consolă)
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Afișăm spații verticale pentru efectul de „ridicare”
            for (int j = 0; j < i; j++) {
                System.out.println();
            }

            System.out.println(soare);
            System.out.println("\n Iarba verde de acasă...");

            Thread.sleep(500); // pauză de 0.5 secunde între cadre
        }

        System.out.println("\n Soarele a răsărit! Bună dimineața, copilărie!");
    }
}
