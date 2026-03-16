class ClockExecutor
{
   public static void main(String[] args)
   {
      System.out.println("main started");

      System.out.println("the price " + Clock.getPrice());
      System.out.println("the product dimensions " + Clock.getProductDimensions());
      System.out.println("the energy consumption " + Clock.getEnergyConsumption());
      System.out.println("the number of items " + Clock.getNumberOfItems());
      System.out.println("the material " + Clock.getMaterial());
      System.out.println("the item model number " + Clock.getItemModelNumber());
      System.out.println("the color " + Clock.getColor());
      System.out.println("the manufacturer " + Clock.getManufacturer());
      System.out.println("the item weight " + Clock.getItemWeight());
      System.out.println("the country of origin " + Clock.getCountryOfOrigin());
      System.out.println("the net quantity " + Clock.getNetQuantity());
      System.out.println("the capacity " + Clock.getCapacity());
      System.out.println("the part number " + Clock.getPartNumber());
      System.out.println("the ASIN " + Clock.getAsin());
      System.out.println("the generic name " + Clock.getGenericName());
   }
}