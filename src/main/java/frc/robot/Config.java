package frc.robot;

import java.util.HashMap;
import java.util.Map;

public final class Config {
    private static Map<String, Integer> canIDs = new HashMap<>();
    private static Map<String, Integer> dioPorts = new HashMap<>();

    static {
    // Map canIDs
    canIDs.put("ELEVOTOR_MOTOR", 30);
    canIDs.put("SHOOTER_MOTOR_L", 33);
    canIDs.put("SHOOTER_MOTOR_R", 32);
    
    // Map dioPorts
    dioPorts.put("ELEVATOR_LIMIT_SWITCH", 0);
    dioPorts.put("CORAL_SENSOR_F", 2);
    dioPorts.put("CORAL_SENSOR_B", 1);
    }

    // Map.copyOf creates an immutable HashMap from the previous HashMap
    public static final Map<String, Integer> CAN_ID = Map.copyOf(canIDs);
    public static final Map<String, Integer> DIO_PORT = Map.copyOf(dioPorts);

    // Getter method for retrieving a canIDs ID for a Device
    public static final int getCanID(String canIDsDeviceName) {
        return canIDs.get(canIDsDeviceName);
    }

    // Getter method for retrieving a dioPorts port number for a Device
    public static final int getDioPort(String dioPortsDeviceName) {
            return dioPorts.get(dioPortsDeviceName);
    }

}
