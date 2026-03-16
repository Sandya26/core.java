class WashingMachine
{
    static int maxSpeed = 5;
    static int minSpeed = 0;
    static int currentSpeed;

    static boolean powerOn;

    static void powerOn(boolean status)
    {
        powerOn = status;

        if(powerOn)
        {
            System.out.println("The WashingMachine is On");
        }
        else
        {
            System.out.println("The WashingMachine is Off");
        }
    }

    static void increaseSpeed()
    {
        if(powerOn)
        {
            if(currentSpeed < maxSpeed)
            {
                currentSpeed++;
                System.out.println("Increased WashingMachine speed: " +currentSpeed);
            }
            else
            {
                System.out.println("Reached maximum WashingMachine speed");
            }
        }
        else
        {
            System.out.println("The WashingMachine is Off");
        }
    }

    static void decreaseSpeed()
    {
        if(powerOn)
        {
            if(currentSpeed > minSpeed)
            {
                currentSpeed--;
                System.out.println("Decreased WashingMachine speed: " +currentSpeed);
            }
            else
            {
                System.out.println("Reached minimum WashingMachine speed");
            }
        }
        else
        {
            System.out.println("The WashingMachine is Off");
        }
    }
}

