
public abstract class TemplateQuery {

	protected abstract void createDbConnection();
	protected abstract void openConnection();
	protected abstract void runSqlQuery();
	protected abstract void closeConnection();
	
	public void run()
	{
		createDbConnection();
		openConnection();
		runSqlQuery();
		closeConnection();
	}
}
