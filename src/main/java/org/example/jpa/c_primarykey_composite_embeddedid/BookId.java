package org.example.jpa.c_primarykey_composite_embeddedid;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class BookId implements Serializable {
	private static final long serialVersionUID = 3532742571930649471L;

	private String title;
	private String language;
	
	
	// GETTERS
	public String getTitle() {
		return title;
	}
	public String getLanguage() {
		return language;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	// EQUALS & HASHCODE
	public boolean equals(Object obj) {
		// implement
		return true;
	}
	public int hashCode() {
		// implement
		return 0;
	}

}
