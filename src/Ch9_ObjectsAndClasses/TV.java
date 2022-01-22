package Ch9_ObjectsAndClasses;

public class TV {
    // default values with empty constructor
//    int channel = 1;
//    int volumeLevel = 1;
//    boolean on = false;
//
    int channel;
    int volumeLevel;
    boolean on;

    public TV(){
        // default values
        channel = 1;
        volumeLevel = 1;
        on = false;
    }

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setChannel(int newChannel){
        if (1 <= newChannel && newChannel <= 120)
            channel = newChannel;
        else
            System.out.println("TV channel must be between 1 and 120");
    }

    public void setVolume(int newVolumeLevel){
        if (1 <= newVolumeLevel && newVolumeLevel <= 7)
            volumeLevel = newVolumeLevel;
    }

    public void channelUp(){
        if (channel < 120)
            channel++;
    }

    public void channelDown(){
        if (channel > 1)
            channel--;
    }

    public void volumeUp(){
        if (volumeLevel < 7)
            volumeLevel++;
    }

    public void volumeDown(){
        if (volumeLevel > 1)
            volumeLevel--;
    }

    @Override
    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volumeLevel=" + volumeLevel +
                ", on=" + on +
                '}';
    }
}
