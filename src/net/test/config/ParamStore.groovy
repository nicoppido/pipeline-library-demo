#!/usr/bin/env groovy
package net.test.config;
import net.test.config.Languages;
import net.test.config.PipelineVersion;
import net.test.error.RequiredKeysException;

class ParamStore {

	private final String language = "java"; // Simulo la stringa letta da config.yaml
	private final String pvString = "1.0";

	private final def context;
	private Languages l;
	private PipelineVersion pv;

	ParamStore(context) {
		this.context = context;
	}

	def store() throws RequiredKeysException {
		try {
			this.l = Languages.valueOf(this.language);
			this.context.env.LANGUAGE = this.l.getLanguage();
		}
		catch (Exception e) {
			throw new RequiredKeysException("programming_language", "${language}");
		}

		try {
			this.pv = PipelineVersion.get(pvString);
			this.context.echo "{$pv.name()}";
			this.context.env.PIPELINE_VERSION = this.pv.getPipelineVersion();
			this.context.echo "{$env.PIPELINE_VERSION()}";
		}
		catch (Exception e) {
			throw new Exception();

		}
	}


}


        /*	
            case "java": 
                this.l = this.language as Languages;
                break; 
            case "dotnet": 
                this.l = this.language as Languages;
                break; 
            default: 
                this.l = this.language as Languages; //Error Handling Pipeline Abort
        } 
		this.context.env.LANGUAGE = this.l.getLanguage();
		*/
