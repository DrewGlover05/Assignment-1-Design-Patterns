// Abstract factory interface, each factory implements this to produce SmartBulb and SmartLock objects

public interface SmartDeviceFactory {
    SmartBulb createBulb();
    SmartLock createLock();
}
