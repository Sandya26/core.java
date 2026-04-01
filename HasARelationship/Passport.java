class Passport {
    String passportNumber;
    String issuedCountry;
    String issueDate;
    String expiryDate;
    String visaType;
    public void getPassportDetails() {
        System.out.println("the passport Number is " + passportNumber);
        System.out.println("the passport issuedCountry is " + issuedCountry);
        System.out.println("the passport issueDate is " + issueDate);
        System.out.println("the passport expiryDate is " + expiryDate);
        System.out.println("the passport visaType is " + visaType);
    }
}