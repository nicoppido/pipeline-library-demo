#!/usr/bin/env groovy
package net.test.config;

public enum Languages {
	java("java"), dotnet("dotnet");

	public Languages() {
		
	}
	
	public Languages(String language) {
		this.language = language;
	}

	private final String language;

	public int getLanguage() {
		return language;
	}

}
