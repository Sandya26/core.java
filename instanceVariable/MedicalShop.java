class MedicalShop
{
    String medicalShops[] = new String[10];
    int index;

    public boolean addMedicalShop(String medicalShop)
    {
        boolean isMedicalShopAdded = false;

        if(medicalShop != null && !medicalShop.isEmpty())
        {
            medicalShops[index++] = medicalShop;
            isMedicalShopAdded = true;
        }
        else
        {
            System.out.println(medicalShop + " is invalid");
        }

        return isMedicalShopAdded;
    }

    public void getMedicalShop()
    {
        System.out.println("Get Method is Added");

        for(String medicalShop : medicalShops)
        {
            System.out.println(medicalShop);
        }
    }
}