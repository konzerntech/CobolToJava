/**
 * JavaCodeCreator.java
 * 
 * For Creation JavaCode from JavaPojo
 */
package com.konzern.transformatore.templates;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import com.konzern.transformatore.java.JavaPojo;

import freemarker.core.ParseException;
/**
 *  JavaCodeCreator.java
 */
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;

/**
 * 
 * @author konzernites
 * @version 1.0
 *
 */
public class JavaCodeCreator extends JavaTemplate {

	private Configuration cfg = null;
	private Template template = null;
	private String fileLocation = "E:\\PROXIMOTECH\\cobol_to_java_convertor\\output_files\\";
	private JavaPojo javaPojo = null;
	private Map<String, Object> data = null;

	public JavaCodeCreator(String fileLocation) {
		this.fileLocation = fileLocation;
		intitalize();
	}

	private String getFileName() {
		return javaPojo.getClassName() + fileExtention;
	}

	public void setJavaPojo(JavaPojo javaPojo) {
		this.javaPojo = javaPojo;
	}

	private void intitalize() {
		cfg = new Configuration();
		try {
			cfg.getTemplate("JavaCodeTemplate.ftl");
			data = new HashMap<String, Object>();
		} catch (TemplateNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedTemplateNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void createJavaCode() {
		data.put("className", javaPojo.getClassName());
		data.put("authorName", javaPojo.getAuthorName());

		writeJavaCode();

	}

	private void writeJavaCode() {

		try {
			Writer out = new OutputStreamWriter(System.out);
			template.process(data, out);
			out.flush();
			File javaFile = new File(fileLocation + "" + getFileName());
			Writer file = new FileWriter(javaFile);
			template.process(data, file);
			file.flush();
			file.close();
		} catch (TemplateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
