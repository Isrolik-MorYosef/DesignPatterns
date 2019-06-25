
public class TunaSaladBuilder extends SaladBuilder {

	@Override
	protected void prepareVegg() {
		this.salad.prepareVegg("Tomato and cucumber");
		
	}

	@Override
	protected void prepareMain() {
		this.salad.prepareMain("Tuna lots of tuna");
	}

	@Override
	protected void prepareGraving() {
		this.salad.prepareGraving("Thousand islands");
		
	}

	@Override
	protected void preparePrice() {
		this.salad.preparePrice("Today special offer 49.90");
		
	}

}
