package org.example;

public record DriverRecord(
        String firstName,
        String lastName,
        int dobMonth,
        int dobDay,
        int dobYear,
        String licenseId,
        String licenseAddress,
        String licenseCity,
        String licenseState,
        String licenseCountry,
        int heightFeet,
        int heightInches,
        int licenseExpirationMonth,
        int licenseExpirationDay,
        int licenseExpirationYear,
        boolean isActive,
        boolean isOrganDonor
) {
    public String toString() {
        String info = "Driver License Information\n";
        info += "\tFirst Name: " + firstName + "\n";
        info += "\tLast Name: " + lastName + "\n";
        info += "\tDate of Birth: " + dobMonth + "/" + dobDay + "/" + dobYear + "\n";
        info += "\tLicense ID: " + licenseId + "\n";
        info += "\tLicense Address: " + licenseAddress + "\n";
        info += "\tLicense City: " + licenseCity + "\n";
        info += "\tLicense State: " + licenseState + "\n";
        info += "\tLicense Country: " + licenseCountry + "\n";
        info += "\tHeight: " + heightFeet + " feet " + heightInches + " inches\n";
        info += "\tLicense Expiration Date: " + licenseExpirationMonth + "/" + licenseExpirationDay + "/" + licenseExpirationYear + "\n";
        info += "\tActive: " + (isActive ? "YES" : "NO") + "\n";
        info += "\tOrgan Donor: " + (isOrganDonor ? "YES" : "NO") + "\n";
        return info;
    }

    public static class Builder {
        private  String firstName;
        private  String lastName;
        private  int dobMonth;
        private  int dobDay;
        private  int dobYear;
        private  String licenseId;
        private  String licenseAddress;
        private  String licenseCity;
        private  String licenseState;
        private  String licenseCountry;
        private  int heightFeet;
        private  int heightInches;
        private  int licenseExpirationMonth;
        private  int licenseExpirationDay;
        private  int licenseExpirationYear;
        private  boolean isActive;
        private  boolean isOrganDonor;

        public Builder() {}

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder dobMonth(int dobMonth) {
            this.dobMonth = dobMonth;
            return this;
        }

        public Builder dobDay(int dobDay) {
            this.dobDay = dobDay;
            return this;
        }

        public Builder dobYear(int dobYear) {
            this.dobYear = dobYear;
            return this;
        }

        public Builder licenseId(String licenseId) {
            this.licenseId = licenseId;
            return this;
        }

        public Builder licenseAddress(String licenseAddress) {
            this.licenseAddress = licenseAddress;
            return this;
        }

        public Builder licenseCity(String licenseCity) {
            this.licenseCity = licenseCity;
            return this;
        }

        public Builder licenseState(String licenseState) {
            this.licenseState = licenseState;
            return this;
        }

        public Builder licenseCountry(String licenseCountry) {
            this.licenseCountry = licenseCountry;
            return this;
        }

        public Builder heightFeet(int heightFeet) {
            this.heightFeet = heightFeet;
            return this;
        }

        public Builder heightInches(int heightInches) {
            this.heightInches = heightInches;
            return this;
        }

        public Builder licenseExpirationMonth(int licenseExpirationMonth) {
            this.licenseExpirationMonth = licenseExpirationMonth;
            return this;
        }

        public Builder licenseExpirationDay(int licenseExpirationDay) {
            this.licenseExpirationDay = licenseExpirationDay;
            return this;
        }

        public Builder licenseExpirationYear(int licenseExpirationYear) {
            this.licenseExpirationYear = licenseExpirationYear;
            return this;
        }

        public Builder isActive(boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        public Builder isOrganDonor(boolean isOrganDonor) {
            this.isOrganDonor = isOrganDonor;
            return this;
        }

        public DriverRecord build() {
            return new DriverRecord(
                    firstName,
                    lastName,
                    dobMonth,
                    dobDay,
                    dobYear,
                    licenseId,
                    licenseAddress,
                    licenseCity,
                    licenseState,
                    licenseCountry,
                    heightFeet,
                    heightInches,
                    licenseExpirationMonth,
                    licenseExpirationDay,
                    licenseExpirationYear,
                    isActive,
                    isOrganDonor
            );
        }

    }

}
