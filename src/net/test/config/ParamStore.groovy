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
    	try{
            this.l = Languages.valueOf(this.language);
            this.context.env.LANGUAGE = this.l.getLanguage();
        }
        catch(Exception e){
        	throw new Exception("Language ${n} not allowed");
        	//throw e;
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
