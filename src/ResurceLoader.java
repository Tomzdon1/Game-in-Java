import java.io.InputStream;

final public class ResurceLoader {

	public static InputStream load(String path){
		
		InputStream input = ResurceLoader.class.getResourceAsStream(path);
		if(input == null){
			input = ResurceLoader.class.getResourceAsStream("/" +path);
		}
		return input;
			
		}
	}
