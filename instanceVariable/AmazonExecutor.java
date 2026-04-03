class AmazonExecutor
{
    public static void main(String args[])
    {
        Amazon ref = new Amazon();
        boolean added = ref.addAmazon("Electronics");
        System.out.println(added);

        added = ref.addAmazon("Fashion");
        System.out.println(added);

        added = ref.addAmazon("Home & Kitchen");
        System.out.println(added);

        added = ref.addAmazon("Books");
        System.out.println(added);

        added = ref.addAmazon("Beauty");
        System.out.println(added);

        added = ref.addAmazon("Toys");
        System.out.println(added);

        added = ref.addAmazon("Sports");
        System.out.println(added);

        added = ref.addAmazon("Automotive");
        System.out.println(added);

        added = ref.addAmazon("Grocery");
        System.out.println(added);

        added = ref.addAmazon("Health");
        System.out.println(added);

        added = ref.addAmazon("Jewelry");
        System.out.println(added);

        added = ref.addAmazon("Shoes");
        System.out.println(added);

        added = ref.addAmazon("Furniture");
        System.out.println(added);

        added = ref.addAmazon("Music");
        System.out.println(added);

        added = ref.addAmazon("Movies");
        System.out.println(added);

        added = ref.addAmazon("Software");
        System.out.println(added);

        added = ref.addAmazon("Pet Supplies");
        System.out.println(added);

        added = ref.addAmazon("Baby Products");
        System.out.println(added);

        added = ref.addAmazon("Office Products");
        System.out.println(added);

        added = ref.addAmazon("Garden");
        System.out.println(added);

        added = ref.addAmazon("Industrial");
        System.out.println(added);

        ref.getAmazon();
    }
}