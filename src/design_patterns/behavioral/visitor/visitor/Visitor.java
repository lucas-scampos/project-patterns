package design_patterns.behavioral.visitor.visitor;

import design_patterns.behavioral.visitor.shapes.Circle;
import design_patterns.behavioral.visitor.shapes.CompoundShape;
import design_patterns.behavioral.visitor.shapes.Dot;
import design_patterns.behavioral.visitor.shapes.Rectangle;

public interface Visitor {

	public String visitDot(Dot dot);

    public String visitCircle(Circle circle);

    public String visitRectangle(Rectangle rectangle);

    public String visitCompoundGraphic(CompoundShape cg);
}