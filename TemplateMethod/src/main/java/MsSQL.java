
public abstract class MsSQL extends TemplateQuery {

	@Override
	protected void createDbConnection() {
		System.out.println("Creating db connection for mssql");
		
	}

	@Override
	protected void openConnection() {
		System.out.println("Opening db connection for mssql");
	}

	@Override
	protected void closeConnection() {
		System.out.println("Closing db connection for mssql");
		
	}

}
