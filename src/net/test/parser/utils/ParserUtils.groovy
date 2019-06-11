#!/usr/bin/env groovy
package net.test.parser.utils;

import net.test.parser.ConfigParser;
import net.test.ProjectConfiguration;

class ParserUtils implements Serializable {
	private String configYaml;
	private final def context;
	private ProjectConfiguration projectConfig;

	ParserUtils(context, String configYaml){
		this.context = context;
		this.configYaml = configYaml;
	}

	def parseProjectConfiguration(){
		def yaml;
		try {
			yaml = this.context.readYaml file: this.configYaml
		}
		catch(Exception e) {
			this.context.echo "Esplosione"
		}
		this.projectConfig = ConfigParser.parse(yaml,context.env);
	}

	def storeConfigInEnvVariables(){
		if (this.projectConfig.pipelineVersionConfiguration){
			this.context.env.PIPELINE_VERSION = this.projectConfig.pipelineVersionConfiguration.pipelineVersion;
		}
		
	}
}
