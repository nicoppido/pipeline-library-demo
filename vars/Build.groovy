#!/usr/bin/env groovy

import net.test.init.BuildUtils;

def call(context) {
    def build = new BuildUtils();
    build.build(context);
}
