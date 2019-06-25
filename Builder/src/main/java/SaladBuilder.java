
public abstract class SaladBuilder {
	
	protected Salad salad;
	
	public Salad getSalad()
	{
		return this.salad;
	}
	
	public void buildSalad()
	{
		this.salad = new Salad();
		prepareVegg();
		prepareMain();
		prepareGraving();
		preparePrice();
	}
	
	protected abstract void prepareVegg();

	
	protected abstract void prepareMain();

	
	protected abstract void prepareGraving();

	
	protected abstract void preparePrice();

}
