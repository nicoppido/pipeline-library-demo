#!/usr/bin/env groovy
import net.test.parser.utils.ParserUtils;
import net.test.ProjectConfiguration;

def call(context, String configYaml) {
	//Load project configuration
	def projectConfigParser = new ParserUtils(context, configYaml)
	//projectConfigParser.storeConfigInEnvVariables();

}

