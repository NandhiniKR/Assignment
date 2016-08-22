import java.util.Properties;

public class MapUsingDBPropertiesEx2 {

	public static void main(String[] args)throws Exception {
		
		Properties properties = new Properties();
		String EnvName = System.getProperty("app.env.name");
		if(EnvName != null){
		properties.load(MapUsingDBPropertiesEx2.class.getResourceAsStream(EnvName+"database.properties"));
System.out.println(properties);
System.out.println(properties.get("username"));
System.out.println(properties.get("password"));
	}
		else{
			System.err.println("Environment is Missing");
			System.exit(-345);
		}
	}

}
