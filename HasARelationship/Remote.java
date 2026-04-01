class Remote {
    int remoteId;
    String remoteType;
    String connectivity;
    int buttons;
    String batteryType;
    public void getRemoteDetails() {
        System.out.println("the remote Id is " + remoteId);
        System.out.println("the remote type is " + remoteType);
        System.out.println("the remote connectivity is " + connectivity);
        System.out.println("the remote buttons is " + buttons);
        System.out.println("the remote batteryType is " + batteryType);
    }
}