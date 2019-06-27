#!/usr/bin/env groovy

package net.test.config;

public enum PipelineVersion {
    v1_0("1.0"), v2_0("2.0");

    public PipelineVersion(String pipelineVersion) {
        this.pipelineVersion = pipelineVersion;
    }

    private final String pipelineVersion;

    public String getPipelineVersion() {
        return pipelineVersion;
    }



}
