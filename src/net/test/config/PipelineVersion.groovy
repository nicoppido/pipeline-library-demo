#!/usr/bin/env groovy

package net.test.config;
enum PipelineVersion {
    v1_0("1.0"),
    v2_0("2.0");

    private final String pipelineVersion;
    private static final Map<String,MyEnum> ENUM_MAP;

    PipelineVersion(String pipelineVersion) {
        this.pipelineVersion = pipelineVersion;
    }

    String getPipelineVersion() {
        return pipelineVersion;
    }

    static {
        Map<String,PipelineVersion> map = new ConcurrentHashMap<String, PipelineVersion>();
        for (PipelineVersion instance : PipelineVersion.pipelineVersion()) {
            map.put(instance.getName(),instance);
        }
        ENUM_MAP = Collections.unmodifiableMap(map);
    }

    static PipelineVersion get (String pipelineVersion) {
        return ENUM_MAP.get(pipelineVersion);
    }


}

