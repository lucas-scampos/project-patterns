package design_patterns.structural.decorator.decorators;

// The common interface for all components.
public interface DataSource {

	void writeData(String data);

    String readData();
}