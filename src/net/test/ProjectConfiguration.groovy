#!/usr/bin/env groovy
package net.test;
import net.test.config.PipelineVersionConfiguration;

class ProjectConfiguration {
   def environment;
   def env;
   def buildNumber;

   PipelineVersionConfiguration pipelineVersionConfiguration;
}
