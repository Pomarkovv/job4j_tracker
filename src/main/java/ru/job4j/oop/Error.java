package ru.job4j.oop;

public class Error {
    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    private boolean active;
    private int status;
    private String message;

    public void printInfo() {
        System.out.println("activity: " + active);
        System.out.println("Status: " + status + " GB");
        System.out.println("message: " + message);
    }

    public static void main(String[] args) {
        Error error1 = new Error(true, 12, "a b c d");
        Error error2 = new Error(false, 12, "a b d");
        Error error3 = new Error();
        error1.printInfo();
        error2.printInfo();
        error3.printInfo();
    }
}
