import java.util.Random;

public class Bear {
    Random percentage = new Random();

    private int batteryLevel;
    private String name;
    private boolean sangSadSong;
    private boolean isSleeping;


    public Bear(String name) {
        this.name = name;
        this.batteryLevel = 10;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }


    public void talk() {
        int randomPercentage = percentage.nextInt(10);
        if (batteryLevel > 0) {
            if (this.name.equals("CrankyBear") && batteryLevel <= 50) {
                singSadSong();
            } else if ((this.name.equals("DrunkBear") && ( randomPercentage < 2 && !isSleeping ))  ) {
                System.out.println("Bear " + getName() + ": *starts snoring* " + randomPercentage);
                goesToSleep();
            } else {
                System.out.println("This cute " + name + " bear says: I love you");
                batteryLevel--;
                System.out.println("Battery Level: " + batteryLevel);
            }
        } else {
            System.out.println("This cute " + name + " bear is out of battery");
        }
    }

    private void checkBatteryLevel() {
        if (this.name.equals("CrankyBear") && batteryLevel <= 50) {
            singSadSong();
        }
    }

    public void singSadSong() {
        if (!sangSadSong) {
            System.out.println("Bear " + getName() + ": *sings a sad song*");
            sangSadSong = true;
            batteryLevel--;
            System.out.println("Battery Level: " + batteryLevel);
            checkBatteryLevel();
        }
    }

    public void goesToSleep() {
        while (batteryLevel > 0) {
            System.out.println("Bear " + getName() + ": *is now snoring*");
            batteryLevel--;
            System.out.println("Battery Level: " + batteryLevel);
            isSleeping = true;
        }
    }
}

