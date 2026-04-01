class Lock {
    int lockId;
    String lockType;
    String brand;
    String keyType;
    boolean isSmartLock;
    public void getLockDetails() {
        System.out.println("the lock Id is " + lockId);
        System.out.println("the lock type is " + lockType);
        System.out.println("the lock brand is " + brand);
        System.out.println("the lock keyType is " + keyType);
        System.out.println("the lock isSmartLock is " + isSmartLock);
    }
}