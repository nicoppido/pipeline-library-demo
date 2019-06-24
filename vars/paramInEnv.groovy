#!/usr/bin/env groovy

def call(context) {
	script{
		def storeParam = new ParamStore(context)
		storeParam.store();
	}
}