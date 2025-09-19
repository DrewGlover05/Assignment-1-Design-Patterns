import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BrandBSmartBulb implements SmartBulb {
    private String usageData;

    @Override
    public void loadUsage(String filename) {
        try {
            File file = new File(filename);
            try (Scanner scanner = new Scanner(file)) { // scans the file and saves the data into the variable usageData 
                while (scanner.hasNextLine()) {
                    usageData = scanner.nextLine();
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage()); // catches if file cannot be found and sends an error
        }
    }

    @Override
    public void displayUsage() {
        System.out.println(usageData);
    }

}
