#!/usr/bin/env groovy
package net.test.config;

class PipelineVersionConfiguration {
	
	String pipelineVersion;
	private final String DEFAULT_PIPELINE_VERSION = '0.0'

	PipelineVersionConfiguration(Map<String, String> pipelineVersionSettings){
		if (pipelineVersionSettings.get('version') != null){
			def version = pipelineVersionSettings.get('version');
			switch(version) {
				case ('1.0'):
					this.pipelineVersion = version;
					break;
				default:
					this.pipelineVersion = DEFAULT_PIPELINE_VERSION;
					break
			}
		}
		else
			this.pipelineVersion = DEFAULT_PIPELINE_VERSION;
	}
}
