package frc.robot;

import java.util.HashMap;
import java.util.Map;

public final class Config {

    // Place HashMap Objects outside of main() method to prevent them from being modified (scope)
    private final HashMap<String, Integer> canIDs = new HashMap<>();
    private final HashMap<String, Integer> dioPorts = new HashMap<>();

    public void main(String[] args) {
    
    // Map CanIDs
    canIDs.put("ELEVOTOR_MOTOR", 30);
    canIDs.put("SHOOTER_MOTOR_L", 33);
    canIDs.put("SHOOTER_MOTOR_R", 32);
    
    // Map DIO ports
    dioPorts.put("ELEVATOR_LIMIT_SWITCH", 0);
    dioPorts.put("CORAL_SENSOR_F", 2);
    dioPorts.put("CORAL_SENSOR_B", 1);
    }

    // Getter method for retrieving a CAN ID for a Device
    public final int getCanID(String can_device) {
        return canIDs.get(can_device);
    }

    // Getter method for retrieving a DIO port number for a Device
    public final int getDioPort(String dio_device) {
            return dioPorts.get(dio_device);
    }

}
