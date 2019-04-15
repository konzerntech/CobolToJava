/**
 * 
 */
package com.konzern.transformatore.cobolInf;

import java.util.List;

import com.konzern.transformatore.java.JavaPojo;

/**
 * @author Konzernites
 * @version 1.0
 *
 */
public interface CobolDivisionInf {
	
	public void setJavaPojo(JavaPojo javaPojo);
	
	public JavaPojo convertCobolToJava(String functionName , List<String> cobolCode);

}
