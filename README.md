# SOFE3650 Assignment 1 – Design Patterns
**Group 12**
+ Drew Glover - 100914229
+ Reid Hillis - 100915844
+ Ebubechukwu Agwagah - 100937022

**Structure:**

```bash
├── src/                    # Source code directory
│   ├── BrandAFactory.java          # Factory to create Brand A bulbs and locks
│   ├── BrandASmartBulb.java        # Defines Brand A bulbs
│   ├── BrandASmartLock.java        # Defines Brand A locks
│   ├── BrandBFactory.java          # Factory to create Brand B bulbs and locks
│   ├── BrandBSmartBulb.java        # Defines Brand B bulbs
│   ├── BrandBSmartLock.java        # Defines Brand B bulbs
│   ├── SmartBulb.java              # Interface for Smart Bulbs
│   ├── SmartDeviceFactory.java     # Abstract factory interface
│   └── SmartLock.java              # Interface for Smart Locks
│
├── test/                   # Test file directory
│   └── TestDriver.java             # Main class for testing files
│
├── resources/              # Data files directory
│   ├── BrandABulb.txt              # Usage data for Brand A bulbs
│   ├── BrandALock.txt              # Usage data for Brand A locks
│   ├── BrandBBulb.txt              # Usage data for Brand B bulbs
│   └── BrandBLock.txt              # Usage data for Brand B locks
│
└── README.md               # This summary file
```
**Test Methods:**

The Test.java method

- Creates factories for Brand A & B
- Creates instance of a Brand A bulb and a Brand B lock (The 2 requested examples)
- Displays the usage data of the bulb and lock

<img width="1665" height="760" alt="code1" src="https://github.com/user-attachments/assets/a4c1dfe0-9c39-4178-95af-94e52a2ecd7d" />
