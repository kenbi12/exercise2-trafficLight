import trafficlight.ctrl.TrafficLightCtrl;

//https://www.philipphauer.de/study/se/design-pattern/observer.php
//https://stackabuse.com/the-observer-design-pattern-in-java
//https://www.baeldung.com/java-observer-pattern
//https://www.roseindia.net/answers/viewqa/Java-Beginners/19175-how-to-make-traffic-light-code-in-java.html

//worked with: Zeynep Avci, Nur Sarhan



public class MCP {
    public static void main(String[] args) {
        //implemented Singleton
        TrafficLightCtrl ctrl = TrafficLightCtrl.getController();
        ctrl.run();
    }
}