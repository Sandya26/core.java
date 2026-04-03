class PoliceStationExecutor
{
    public static void main(String args[])
    {
        PoliceStation ref = new PoliceStation();
        boolean added = ref.addPoliceStation("Dowry Harassment Case");
        System.out.println(added);

        added = ref.addPoliceStation("Robbery");
        System.out.println(added);

        added = ref.addPoliceStation("Murder");
        System.out.println(added);

        added = ref.addPoliceStation("Theft");
        System.out.println(added);

        added = ref.addPoliceStation("Minor Assault");
        System.out.println(added);

        added = ref.addPoliceStation("Rape");
        System.out.println(added);

        added = ref.addPoliceStation("Defamation");
        System.out.println(added);

        added = ref.addPoliceStation("Hacking");
        System.out.println(added);

        added = ref.addPoliceStation("Online Fraud");
        System.out.println(added);

        added = ref.addPoliceStation("Cyber Bullying");
        System.out.println(added);

        added = ref.addPoliceStation("Mobile Theft Case");
        System.out.println(added);

        added = ref.addPoliceStation("Double Murder Case");
        System.out.println(added);

        added = ref.addPoliceStation("Attempt to Murder");
        System.out.println(added);

        added = ref.addPoliceStation("Dacoity Case");
        System.out.println(added);

        added = ref.addPoliceStation("Extortion Case");
        System.out.println(added);

        added = ref.addPoliceStation("Vehicle Theft Case");
        System.out.println(added);

        ref.getPoliceStation();
    }
}