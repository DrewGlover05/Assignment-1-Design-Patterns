// Factory to create Brand B bulbs and locks

public class BrandBFactory implements SmartDeviceFactory {
    @Override
    public SmartBulb createBulb() {
        SmartBulb bulb = new BrandBSmartBulb(); // Create new Brand B bulb
        bulb.loadUsage("C:\\Users\\Drew\\OneDrive - Ontario Tech University\\Documents\\Software Architechture\\Assignment-1-Design-Patterns-main\\BrandBBulb.txt"); // Load data from external file
        return bulb;
    }
    @Override
    public SmartLock createLock() {
        SmartLock lock = new BrandBSmartLock(); // Create new Brand B lock
        lock.loadUsage("C:\\Users\\Drew\\OneDrive - Ontario Tech University\\Documents\\Software Architechture\\Assignment-1-Design-Patterns-main\\BrandBLock.txt"); // Load data from external file
        return lock;
    }
}
