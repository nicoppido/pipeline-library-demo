#!/usr/bin/env groovy
package net.test.config;
import net.test.config.Languages;

class ParamStore {
	
	private final String language = "java"; // Simulo la stringa letta da config.yaml
	private final def context;
	private Languages l;

	ParamStore(context){
		this.context = context;
	}

	def store(){
        switch(this.language) 
        { 
            case "java": 
                this.l = new Languages(language);
                break; 
            case "dotnet": 
                this.l = new Languages(language);
                break; 
            default: 
                this.l = new Languages(language); //TO-DO
        } 
		this.context.env.LANGUAGE = this.l.getLanguage();
	}

}

