class RefrigeratorExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");
      
      System.out.println("the price " + Refrigerator.getPrice());
      System.out.println("the product dimensions " + Refrigerator.getProductDimensions());
      System.out.println("the energy consumption " + Refrigerator.getEnergyConsumption());
      System.out.println("the material " + Refrigerator.getMaterial());
      System.out.println("the item model number " + Refrigerator.getItemModelNumber());
     
      System.out.println("the color " + Refrigerator.getColor());
      System.out.println("the manufacturer " + Refrigerator.getManufacturer());
      System.out.println("the item weight " + Refrigerator.getItemWeight());
      System.out.println("the country of origin " + Refrigerator.getCountryOfOrigin());
      System.out.println("the net quantity " + Refrigerator.getNetQuantity());
      System.out.println("the capacity " + Refrigerator.getCapacity());
      System.out.println("the part number " + Refrigerator.getPartNumber());
      System.out.println("the ASIN " + Refrigerator.getAsin());
      System.out.println("the generic name " + Refrigerator.getGenericName());
   }
}