class History {
    int transactionId;
    String transactionType;
    double amount;
    String date;
    String status;

    public void getHistoryDetails() {
        System.out.println("the history transactionId is " + transactionId);
        System.out.println("the history transactionType is " + transactionType);
        System.out.println("the history amount is " + amount);
        System.out.println("the history date is " + date);
        System.out.println("the history status is " + status);
    }
}