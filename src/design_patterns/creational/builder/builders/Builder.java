package design_patterns.creational.builder.builders;

import design_patterns.creational.builder.cars.Type;
import design_patterns.creational.builder.components.Engine;
import design_patterns.creational.builder.components.GPSNavigator;
import design_patterns.creational.builder.components.Transmission;
import design_patterns.creational.builder.components.TripComputer;

/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
	public void setType(Type type);
    public void setSeats(int seats);
    public void setEngine (Engine engine);
    public void setTransmission(Transmission transmission);
    public void setTripComputer(TripComputer tripComputer);
    public void setGPSNavigator(GPSNavigator gpsNavigator);
}