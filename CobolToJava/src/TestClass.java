import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import com.konzern.transformatore.convertors.CodeIndentifier;
import com.konzern.transformatore.utils.TransformatoreFileReader;
import com.konzern.transformatore.utilsInf.TransformatoreFileReaderInf;

/**
 * 
 */

/**
 * @author Apple
 *
 */
public class TestClass {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Map<String, BufferedReader> i = null;
		try {
			i = TransformatoreFileReader.creatInputFiles("E:\\PROXIMOTECH\\cobol_to_java_convertor\\input_files", "ASCII");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader br = i.get("sourceformat.txt");
		
		CodeIndentifier ci = new CodeIndentifier(br);
		Map<String, List<String>> mp = ci.createJavaFile();
		
		


	}

}
