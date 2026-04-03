class Amazon
{
    String products[] = new String[6];
    int index;

    public boolean addAmazon(String product)
    {
        boolean isAmazonAdded = false;

        if(product != null && !product.isEmpty())
        {
            products[index++] = product;
            isAmazonAdded = true;
        }
        else
        {
            System.out.println(product + " is invalid");
        }

        return isAmazonAdded;
    }

    public void getAmazon()
    {
        System.out.println("Get Method is Added");

        for(String product : products)
        {
            System.out.println(product);
        }
    }
}