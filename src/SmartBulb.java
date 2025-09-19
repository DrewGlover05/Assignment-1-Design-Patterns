// Interface for all SmartBulbs

public interface SmartBulb {
    void loadUsage(String filename); // Load the bulb's usage from data file
    void displayUsage(); // Print the bulb's power usage
}
