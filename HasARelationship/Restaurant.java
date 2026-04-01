class Restaurant {
    int restaurantId;
    String restaurantName;
    String cuisine;
    String location;
    double rating;
    Chef chef;
    public void getRestaurantDetails() {
        System.out.println("the restaurant Id is " + restaurantId);
        System.out.println("the restaurant Name is " + restaurantName);
        System.out.println("the restaurant cuisine is " + cuisine);
        System.out.println("the restaurant location is " + location);
        System.out.println("the restaurant rating is " + rating);
		System.out.println("-------");
        chef.getChefDetails();
    }
}