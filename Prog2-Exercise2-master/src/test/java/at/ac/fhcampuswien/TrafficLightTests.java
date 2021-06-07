package at.ac.fhcampuswien;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import trafficlight.ctrl.TrafficLightCtrl;
import trafficlight.gui.TrafficLight;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;




public class TrafficLightTests {




    @Test
    @DisplayName("Check green")
    public void checkGreen() {
        TrafficLight green = new TrafficLight(Color.green);
        assertFalse(green.isOn());
    }


    @Test
    @DisplayName("Check yellow")
    public void checkYellow() {
        TrafficLight yellow = new TrafficLight(Color.yellow);
        assertFalse(yellow.isOn());
    }

    @Test
    @DisplayName("Check red")
    public void checkRed() {
        TrafficLight red = new TrafficLight(Color.red);
        assertFalse(red.isOn());
    }


    @Test
    @DisplayName("GREEN to YELLOW")
    public void checkGreenToYellow() {
        TrafficLightCtrl trafficLight = TrafficLightCtrl.getController();
        trafficLight.setStates(trafficLight.getGreenState(),trafficLight.getYellowState());
        assertNotEquals(trafficLight.getCurrentState().getNextState(),trafficLight.getRedState());
    }



    @Test
    @DisplayName("RED to YELLOW")
    public void checkRedToYellow() {
        TrafficLightCtrl trafficLight = TrafficLightCtrl.getController();
        trafficLight.setStates(trafficLight.getRedState(),trafficLight.getYellowState());
        assertEquals(trafficLight.getCurrentState().getNextState(),trafficLight.getYellowState());
    }



    @Test
    @DisplayName("YELLOW to GREEN")
    public void checkYellowToGreen() {
        TrafficLightCtrl trafficLight = TrafficLightCtrl.getController();
        trafficLight.setStates(trafficLight.getYellowState(),trafficLight.getRedState());
        assertNotEquals(trafficLight.getCurrentState().getNextState(),trafficLight.getYellowState());
    }
    @Test
    @DisplayName("test Singleton")
    public void checkSingleton() {
        TrafficLightCtrl trafficLight = TrafficLightCtrl.getController();
        assertEquals(trafficLight,TrafficLightCtrl.getController());
    }




}
