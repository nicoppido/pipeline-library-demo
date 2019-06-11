#!/usr/bin/env groovy
package net.test.parser;
import net.test.ProjectConfiguration;
import net.test.config.PipelineVersionConfiguration;

class ConfigParser {

	static ProjectConfiguration parse(def yaml, def env){

		ProjectConfiguration projectConfiguration = new ProjectConfiguration();
		
		projectConfiguration.environment = parseConfigEntity(yaml.environment);

		projectConfiguration.pipelineVersionConfiguration = parsePipelineVersionConfiguration(yaml);

		projectConfiguration.env = env

		return projectConfiguration;
	}


	static def parseConfigEntity(def configEntity){
		if(!configEntity){
			return "";
		}
		return configEntity.collect { k, v -> "${k}=${v}" };
	}


	static def parsePipelineVersionConfiguration(def pipelineVersion){
		if(!pipelineVersion){
			return;
		}
		Map<String, String> pipelineVersionSettings = new LinkedHashMap();

		pipelineVersion.collect { k, v -> 
			pipelineVersionSettings.put(k, v);
		}
		return new PipelineVersionConfiguration(pipelineVersionSettings)
	}
}
