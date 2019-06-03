#!/usr/bin/env groovy

@Grab('org.apache.commons:commons-math3:3.4.1')
import org.apache.commons.math3.primes.Primes

def external(int count) {
	if (!Primes.isPrime(count)) {
	    error "${count} was not prime"
	}
	// …
f p