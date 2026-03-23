package com.gla.interface1;
interface BackupSerializable {
    // marker interface (empty)
}
class UserData implements BackupSerializable {
    String name;
    int age;
    public UserData(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class BackupManager {
    public static void processBackup(Object obj) {
        if (obj instanceof BackupSerializable) {
            System.out.println("Backing up data...");
        } else {
            System.out.println("Object not allowed for backup.");
        }
    }
}
class Prototype implements Cloneable {
    int value;
    public Prototype(int value) {
        this.value = value;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
interface SensitiveData {
}
class Account implements SensitiveData {
    String accountNumber = "1234567890";
}
class SecurityManager {
    public static void checkSecurity(Object obj) {
        if (obj instanceof SensitiveData) {
            System.out.println("Sensitive data detected! Encrypting...");
        } else {
            System.out.println("Normal data.");
        }
    }
}
public class MarkerInterfaceExamples {
    public static void main(String[] args) {
        System.out.println("=== Backup System ===");
        UserData user = new UserData("Alice", 22);
        BackupManager.processBackup(user);
        String normalData = "Hello";
        BackupManager.processBackup(normalData);
        System.out.println("\n=== Cloning Prototype ===");
        try {
            Prototype p1 = new Prototype(100);
            Prototype p2 = (Prototype) p1.clone();
            System.out.println("Original Value: " + p1.value);
            System.out.println("Cloned Value: " + p2.value);
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }
        System.out.println("\n=== Sensitive Data Check ===");
        Account acc = new Account();
        SecurityManager.checkSecurity(acc);
        SecurityManager.checkSecurity("Public Info");
    }
}