// Interface for all SmartLocks

public interface SmartLock {
    void loadUsage(String filename); // Load the lock's usage from data file
    void displayUsage(); // Print the lock's battery consumption
}
