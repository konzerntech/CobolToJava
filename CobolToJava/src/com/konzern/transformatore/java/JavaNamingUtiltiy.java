/**
 * JavaNamingUtiltiy.java
 * 
 * 
 *
 */
package com.konzern.transformatore.java;

/**
 * @author konzernites
 * @version 1.0
 * @see https://www.oracle.com/technetwork/java/codeconventions-135099.html
 */
public class JavaNamingUtiltiy {
	
	/**
	 * 
	 * To Create a valid java class Name
	 * 
	 * 
	 * 
	 * @param name
	 * @return
	 */
	public String createClassName(String name) {
		String str = name.replace("-", "").trim();
		char[] chr = str.toCharArray();
		chr[0] = Character.toLowerCase(chr[0]);
		return new String(chr);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String createAuthorName(String authorName) {
		if(null!=authorName && !authorName.isEmpty()) {
			return authorName;
		}
		return "";
	}

}
