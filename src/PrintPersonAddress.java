public class PrintPersonAddress {
    public static void main(String[] args) {
        printPersonAddress("Franz", "Meier", "Wolfgangstrasse 18", 7000, "Chur");
    }

    public static void printPersonAddress(String firstName, String lastName, String street, int zipCode, String place) {
        System.out.println(firstName + " " + lastName);
        System.out.println("Wohnhaft in " + zipCode + " " + place);
        System.out.println("Strasse: " + street);
    }
}



