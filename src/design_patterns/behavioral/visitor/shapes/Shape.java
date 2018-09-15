package design_patterns.behavioral.visitor.shapes;

import design_patterns.behavioral.visitor.visitor.Visitor;

public interface Shape {

	public void move(int x, int y);

    public void draw();

    public String accept(Visitor visitor);
}