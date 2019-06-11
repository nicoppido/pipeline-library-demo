#!/usr/bin/env groovy
package net.test.parser
package net.test.ProjectConfiguration

class configParser {

	static ProjectConfiguration parse(def yaml, def env){

		projectConfiguration = new ProjectConfiguration();
		projectConfiguration.enviroment = parseConfigEntity(yaml.enviroment)

		return projectConfiguration;
	}

	static def parseConfigEntity(def configEntity){
		if(!configEntity){
			return "";
		}
		return configEntity.collect { k, v -> "${k}=${v}" };
	}
}
