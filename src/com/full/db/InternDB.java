/**
 * 
 */
package com.full.db;

import java.util.HashMap;
import java.util.Map;

import com.full.bean.Intern;

/**
 * @author Johnson Abraham
 * @since 13-Apr-2017, 10:32:59 AM AJAX-JSON
 */
public class InternDB {

	private static Map <Integer, Intern> interns = new HashMap<>();

	/**
	 * 
	 */
	public InternDB() {
		
	}

	public static void populateDB() {

		Intern intern1 = new Intern();
		intern1.setId(105371);
		intern1.setName("Johnson Abraham");
		intern1.setAge(21);
		intern1.setTeam("CWA");

		Intern intern2 = new Intern();
		intern2.setId(105375);
		intern2.setName("Sathish Kumar");
		intern2.setAge(22);
		intern2.setTeam("iOS Development");
		
		Intern intern3 = new Intern();
		intern3.setId(105372);
		intern3.setName("Yhawhas Joshua");
		intern3.setAge(23);
		intern3.setTeam("Adaptiveu");
		
		Intern intern4 = new Intern();
		intern4.setId(105373);
		intern4.setName("Salman Khan");
		intern4.setAge(23);
		intern4.setTeam("CWA");
		
		interns.put(intern1.getId(), intern1);
		interns.put(intern2.getId(), intern2);
		interns.put(intern3.getId(), intern3);
		interns.put(intern4.getId(), intern4);

	}

	public static Intern getInternObject(int id) {

		if (interns.containsKey(id)) {
			return interns.get(id);
		} else {
			return null;
		}
	}
}
