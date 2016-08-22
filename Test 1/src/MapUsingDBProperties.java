import java.util.Properties;

public class MapUsingDBProperties {

	public static void main(String[] args)throws Exception {
		Properties properties = new Properties();
		properties.load(MapUsingDBProperties.class.getResourceAsStream("database.properties"));
System.out.println(properties);
System.out.println(properties.get("username"));
	}

}
