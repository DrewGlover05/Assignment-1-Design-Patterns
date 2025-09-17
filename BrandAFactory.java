// Factory to create Brand A bulbs and locks

public class BrandAFactory implements SmartDeviceFactory {
    @Override
    public SmartBulb createBulb() {
        SmartBulb bulb = new BrandASmartBulb(); // Create new Brand A bulb
        bulb.loadUsage("brandASmartBulb.txt"); // Load data from external file
        return bulb;
    }
    @Override
    public SmartLock createLock() {
        SmartLock lock = new BrandASmartLock(); // Create new Brand A lock
        lock.loadUsage("brandASmartLock.txt"); // Load data from external file
        return lock;
    }
}
