package jenkins;

public class Read_Data_Cmd
{

	public void readcmddata() 
	{
		  String USERNAME=System.getProperty("username");
		  String PASSWORD=System.getProperty("password");
		  String URL=System.getProperty("url");
		  String BROWSER=System.getProperty("browser");
		  
		  System.out.println(USERNAME);
		  System.out.println(PASSWORD);
		  System.out.println(URL);
		  System.out.println(BROWSER);
		
		
		
	}
		
}
