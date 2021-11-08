package marktplaats.dao;

import static marktplaats.App.scanner;

public class Dao {
    int parseId(String id) {
        boolean invalid = true;
        while (invalid) {
            try {
                Integer.parseInt(id);
            } catch (NumberFormatException e) {
                System.out.println("Foute invoer! Voer een getal in:");
                id = scanner.nextLine();
                parseId(id);
                break;
            }
            invalid = false;
        }
        return Integer.parseInt(id);
    }
}
