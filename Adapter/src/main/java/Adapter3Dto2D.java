
public class Adapter3Dto2D implements D3Painter{

	D2Painter d2NicePainter = new D2NicePainter();
		 
	public void paint3DShape(D3Shape s) {
		
		for(D2Shape d2 : s.getD2Shapes())
		{
			d2NicePainter.paint2DShape(d2);
		}
		
	}

}
