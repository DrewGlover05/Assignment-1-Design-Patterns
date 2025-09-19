import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BrandASmartBulb implements SmartBulb {
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
            System.out.println("File not found: " + e.getMessage()); // catch if the file is not found and return an error
        }
}

    @Override
    public void displayUsage() {
        System.out.println(usageData); //prints off the vairable usageData
    }

}


