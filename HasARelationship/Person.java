class Person {
    int personId;
    String personName;
    int age;
    String gender;
    String address;
    Passport passport;
    public void getPersonDetails() {
        System.out.println("the person Id is " + personId);
        System.out.println("the person Name is " + personName);
        System.out.println("the person age is " + age);
        System.out.println("the person gender is " + gender);
        System.out.println("the person address is " + address);
		System.out.println("-------");
        passport.getPassportDetails();
    }
}