#!/usr/bin/env groovy
package com.test

class GlobalVars {
   static String foo = "Nico"

   // refer to this in a pipeline using:
   //
   // import com.cleverbuilder.GlobalVars
   // println GlobalVars.foo
}
