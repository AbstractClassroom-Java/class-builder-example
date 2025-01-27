package org.example;

public class Main {
    public static void main(String[] args) {
        DriverRecord driverOne;
        driverOne = new DriverRecord(
                "Nathan",
                "Russell",
                3,
                20,
                1990,
                "R11-234-567",
                "100 Big Red Bird Way",
                "Louisville",
                "KY",
                "USA",
                6,
                0,
                4,
                20,
                2025,
                true,
                true
        );
        System.out.println(driverOne);

        DriverRecord driverTwo;
        DriverRecord.Builder tmp = new DriverRecord.Builder();

        driverTwo = new DriverRecord.Builder()
                .heightFeet(5)
                .lastName("Smith")
                .firstName("John")
                .firstName("Andrew")
                .dobMonth(3)
                .dobDay(29)
                .dobYear(1995)
                .licenseId("R11-234-999")
                .licenseAddress("100 Big Blue Bird Way")
                .licenseCity("Lexington")
                .licenseState("KY")
                .licenseCountry("USA")
                .heightInches(10)
                .licenseExpirationMonth(7)
                .licenseExpirationDay(15)
                .licenseExpirationYear(2023)
                .isOrganDonor(true)
                .isActive(true)
                .build();

        System.out.println(driverTwo);

    }
}