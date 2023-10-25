class Vehicle {
    private String type;
    private int year;

    public Vehicle(String type, int year) {
        this.type = type;
        this.year = year;
    }

    public void start() {
        System.out.println("The vehicle is starting.");
    }

    public void stop() {
        System.out.println("The vehicle is Braking.");
    }

    public void displayInfo() {
        System.out.println("Type: " + type);
        System.out.println("Year: " + year);
    }
}
