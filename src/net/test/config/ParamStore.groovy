#!/usr/bin/env groovy
package net.test.config;
import net.test.config.ParamStore;

class ParamStore {
	
	private final String language = "java";
	private final def context;

	ParamStore(context){
		this.context = context;
	}

	def store(){
		this.context.env.LANGUAGE = this.language;
	}
}
