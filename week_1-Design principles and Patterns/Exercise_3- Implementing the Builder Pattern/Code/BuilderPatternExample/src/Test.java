public class Test{
    public static void main(String[] args) {
        // Basic configuration
        Computer basicPC = new Computer.Builder("Intel i3", "4GB")
                .build();

        // Gaming configuration
        Computer gamingPC = new Computer.Builder("Intel i7", "16GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3060")
                .build();

        // Workstation configuration
        Computer workstationPC = new Computer.Builder("AMD Ryzen 9", "32GB")
                .setStorage("2TB NVMe SSD")
                .setGraphicsCard("NVIDIA Quadro RTX 6000")
                .build();

        System.out.println("Basic PC: " + basicPC);
        System.out.println("Gaming PC: " + gamingPC);
        System.out.println("Workstation PC: " + workstationPC);
    }
}
