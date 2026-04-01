class Cart {
    int cartId;
    String customerName;
    int totalItems;
    double totalAmount;
    String paymentMethod;
    Order order;
    public void getCartDetails() {
        System.out.println("the cart Id is " + cartId);
        System.out.println("the cart customerName is " + customerName);
        System.out.println("the cart totalItems is " + totalItems);
        System.out.println("the cart totalAmount is " + totalAmount);
        System.out.println("the cart paymentMethod is " + paymentMethod);
		System.out.println("-------");
        order.getOrderDetails();
    }
}