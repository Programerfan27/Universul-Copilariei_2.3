public class UniversulCopilarieiAnimat {

    public static void main(String[] args) throws InterruptedException {
        String[] soare = {
                "     \\   |   /    ",
                "      .-'☀'-._    ",
                "  ― (    o    ) ― ",
                "      `-._.-'     ",
                "     /   |   \\    "
        };

        String iarba = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        String copac =
                "      🌳        \n" +
                "     /|\\       \n" +
                "    //|\\\\      \n" +
                "     |||        \n" +
                "     |||        ";

        String nor =
                "      ☁☁☁       \n" +
                "    ☁☁☁☁☁      \n" +
                "      ☁☁☁       ";

        for (int i = 10; i >= 0; i--) {
            // Șterge ecranul (doar vizual, nu funcționează în toate consolele)
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Spațiu vertical pentru efectul de ridicare a soarelui
            for (int j = 0; j < i; j++) {
                System.out.println();
            }

            // Desenează soarele
            for (String linie : soare) {
                System.out.println("   " + linie);
            }

            // Adaugă norul sus
            if (i < 5) {
                System.out.println("\n\n" + nor);
            }

            // Adaugă copacul
            System.out.println("\n\n" + copac);

            // Adaugă iarba
            System.out.println("\n" + iarba);

            Thread.sleep(400); // așteaptă 0.4 secunde
        }

        System.out.println("\n🌞 Soarele a răsărit deasupra copilăriei!");
        System.out.println("💛 O zi frumoasă în Universul Copilăriei începe acum!");
    }
}
