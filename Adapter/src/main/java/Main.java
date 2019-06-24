
public class Main {

	public static void main(String[] args) {
		
		D3Shape d3Shape = new D3Shape();
		
		draw(new D3NicePainter(), d3Shape);
		
		draw(new Adapter3Dto2D(), d3Shape);
	}
	
	private static void draw(D3Painter painter, D3Shape shape)
	{
		painter.paint3DShape(shape);
	}

}
