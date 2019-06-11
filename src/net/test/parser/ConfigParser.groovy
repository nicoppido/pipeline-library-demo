#!/usr/bin/env groovy
package net.test.parser;
import net.test.ProjectConfiguration;

class ConfigParser {

	static ProjectConfiguration parse(def yaml, def env){

		ProjectConfiguration projectConfiguration = new ProjectConfiguration();
		projectConfiguration.enviroment = parseConfigEntity(yaml.enviroment)
		echo projectConfiguration.enviroment
		return projectConfiguration;
	}

	static def parseConfigEntity(def configEntity){
		if(!configEntity){
			return "";
		}
		return configEntity.collect { k, v -> "${k}=${v}" };
	}
}
