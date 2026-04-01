class Order 
{
    int orderId;
    String productName;
    String orderStatus;
    String deliveryDate;
    String address;
    public void getOrderDetails() 
	{
        System.out.println("the order Id is " + orderId);
        System.out.println("the order productName is " + productName);
        System.out.println("the order status is " + orderStatus);
        System.out.println("the order deliveryDate is " + deliveryDate);
        System.out.println("the order address is " + address);
    }
}