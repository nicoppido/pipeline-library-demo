#!/usr/bin/env groovy
package net.test.config;

public enum Languages {
	JAVA("java"), DOTNET("dotnet");

	public Languages(String language) {
		this.language = language;
	}

	private final String language;

	public String getLanguage() {
		return language;
	}

}
