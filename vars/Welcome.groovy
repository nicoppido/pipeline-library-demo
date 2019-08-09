#!/usr/bin/env groovy

import net.test.init.SayHello

def call(context) {
    def sayHello = new SayHello("Nicolò");
    sayHello.hello(context);
}
