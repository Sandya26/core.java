class Machine {
    int machineId;
    String machineName;
    String machineType;
    int powerConsumption;
    String status;
    public void getMachineDetails() {
        System.out.println("the machine Id is " + machineId);
        System.out.println("the machine Name is " + machineName);
        System.out.println("the machine type is " + machineType);
        System.out.println("the machine powerConsumption is " + powerConsumption);
        System.out.println("the machine status is " + status);
    }
}