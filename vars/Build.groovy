#!/usr/bin/env groovy

import net.test.build.BuildUtils;

def call(context) {
    def build = new BuildUtils();
    build.build(context);
}
