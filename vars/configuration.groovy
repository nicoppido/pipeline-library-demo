#!/usr/bin/env groovy
import net.test.parser.utils.ParserUtils

def call(context, String configYaml) {
	//Load project configuration
	def projectConfigParser = new ParserUtils(context, configYaml)
}

