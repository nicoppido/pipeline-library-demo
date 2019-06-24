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
                this.l = this.language as Languages;
                break; 
            case "dotnet": 
                this.l = this.language as Languages;
                break; 
            default: 
                this.l = this.language as Languages; //TO-DO
        } 
		this.context.env.LANGUAGE = this.l.getLanguage();
	}

}

