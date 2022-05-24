interface Camera {
    void takeSnap();
    void recordVideo();
    // default method can be implemented instantly inside interface (to avoid huge amount of overriding in huge amount of implemented class by interface)
    // but also can be overridden inside implementation
    // default method can also call private method
    private void greet() {
        System.out.println("Good Morning...");
    }
    default void record4KVideo() {
        greet();
        System.out.println("Default Method Demo\nRecording 4K Video...");
    }
}

interface Wifi {
    String[] getNetworks();
    void connectToNetwork(String network);
}

class CellPhone {
    public void callNumber(int number) {
        System.out.println("Calling " + number);
    }
    public void pickCall() {
        System.out.println("Connecting...");
    }
}

class SmartPhone extends CellPhone implements Camera, Wifi {
    @Override
    public void takeSnap() {
        System.out.println("Taking Snapshot...");
    }
    @Override
    public void recordVideo() {
        System.out.println("Recording Video...");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of Networks...");
        String[] array = {"Harry", "Shubham", "SkillF", "Arjun150"};
        return array;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network + "...");
    }
}

public class polymorphism_in_interfaces {
    public static void main(String[] args) {
        SmartPhone sm = new SmartPhone();
        for (String net : sm.getNetworks()) {
            System.out.printf("SSID : %s\n", net);
            sm.connectToNetwork(net);
        }

        sm.takeSnap();
        sm.recordVideo();
        sm.record4KVideo();
        sm.callNumber(01701701701);
        sm.pickCall();
        // creating interface reference - only use methods inside that interface
        // smartphone acting as camera - polymorphism
        Wifi wap = new SmartPhone();

        for (String ssid : wap.getNetworks()) {
            System.out.format("SSID : %s\n", ssid);
            wap.connectToNetwork(ssid);
        }
        // not allowed
        // wap.takeSnap();
    }
}

