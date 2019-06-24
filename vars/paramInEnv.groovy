#!/usr/bin/env groovy
import net.test.config.ParamStore;

def call(context) {
	script{
		def storeParam = new ParamStore(context)
		storeParam.store();
	}
}