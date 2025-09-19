public class main {
    public static void main(String[] args) {
        // Creates the objects BrandAFactory & BrandBFactory
        SmartDeviceFactory brandAFactory = new BrandAFactory();
        SmartDeviceFactory brandBFactory = new BrandBFactory();

        // Creates the objects BrandABulb & BrandBLock
        SmartBulb brandABulb = brandAFactory.createBulb();
        SmartLock brandBLock = brandBFactory.createLock();

        // displays both of the usages by calling the method displayUsage();
        System.out.println("Brand A Smart Bulb Usage:");
        brandABulb.displayUsage();
        System.out.println("Brand B Smart Lock Usage:");
        brandBLock.displayUsage();
    }

}
