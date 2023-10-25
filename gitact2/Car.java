class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String type, int year, int numberOfDoors) {
        super(type, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Override the base class method 'start'
    @Override
    public void start() {
        System.out.println("The engine is Setting in motion.");
    }

    // Add a new method specific to the Car class
    public void drive() {
        System.out.println("The car is now Moving.");
    }

    // Override the base class method 'displayInfo'
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}