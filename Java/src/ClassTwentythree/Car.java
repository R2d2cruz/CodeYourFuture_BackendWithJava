package ClassTwentythree;

import Utils.OwnFunctions;
import java.time.LocalDate;

public class Car {
    private String make;
    private String model;
    private Integer year;
    private static LocalDate calendar = LocalDate.now();

    public Car(String make, String model, Integer year) {
        this.make = OwnFunctions.capitalizeString(make);
        this.model = OwnFunctions.capitalizeString(model);
        if (verifyYear(year)) {
            this.year = year;
        }
    }

    public Car(String make, String model) {
        this.make = OwnFunctions.capitalizeString(make);
        this.model = OwnFunctions.capitalizeString(model);
        year = calendar.getYear();
    }

    public Car(String make) {
        this.make = OwnFunctions.capitalizeString(make);
        this.model = "Inombrable";
        year = calendar.getYear();
    }

    public Car() {
        this.make = "Aston Martin";
        this.model = "DB5";
        year = calendar.getYear();
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = OwnFunctions.capitalizeString(make);
    }

    public void setModel(String model) {
        this.model = OwnFunctions.capitalizeString(model);
    }

    public void setYear(Integer year) {
        if (verifyYear(year)) {
            this.year = year;
        }
    }

    public static boolean verifyYear(Integer year) {
        return year >= 0 && year <= calendar.getYear();
    }

    public void printData() {
        if (make != null || model != null || year != null) {
            int n = Math.max(12 + Math.max(make.length(), model.length()), 26) + 5;
            System.out.println("\u2554" + "\u2550".repeat(n) + "\u2557");
            System.out.println("\u2551" + "Caracteristicas del auto:" + " ".repeat(n - 25) + "\u2551");
            String line;
            if (make != null) {
                line = "Marcar:     " + make;
                System.out.println("\u2551" + line + " ".repeat(n - line.length()) + "\u2551");
            }
            if (model != null) {
                line = "Modelo:     " + model;
                System.out.println("\u2551" + line + " ".repeat(n - line.length()) + "\u2551");
            }
            if (year != null) {
                line = "Año:        " + year;
                System.out.println("\u2551" + line + " ".repeat(n - line.length()) + "\u2551");
            }
            System.out.println("\u255A" + "\u2550".repeat(n) + "\u255D");
        } else {
            System.out.println("Informacion insuficiente...");
        }
    }

}
