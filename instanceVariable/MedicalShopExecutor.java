class MedicalShopExecutor
{
    public static void main(String args[])
    {
        MedicalShop ref = new MedicalShop();
        boolean added = ref.addMedicalShop("Paracetamol");
        System.out.println(added);

        added = ref.addMedicalShop("Ibuprofen");
        System.out.println(added);

        added = ref.addMedicalShop("Amoxicillin");
        System.out.println(added);

        added = ref.addMedicalShop("Cetirizine");
        System.out.println(added);

        added = ref.addMedicalShop("Aspirin");
        System.out.println(added);

        added = ref.addMedicalShop("Metformin");
        System.out.println(added);

        added = ref.addMedicalShop("Omeprazole");
        System.out.println(added);

        added = ref.addMedicalShop("Azithromycin");
        System.out.println(added);

        added = ref.addMedicalShop("Dolo 650");
        System.out.println(added);

        added = ref.addMedicalShop("Cough Syrup");
        System.out.println(added);

        ref.getMedicalShop();
    }
}