package mjg.tos

import static spock.util.matcher.HamcrestMatchers.closeTo
import spock.lang.Shared
import spock.lang.Specification

class LibraryComputerSpec extends Specification {
	@Shared LibraryComputer computer
	
	def setupSpec() { 
		computer = new LibraryComputer() 
		computer.start()
	}
	
	def "compute to the last decimal the value of PI"() {
		expect: 
        Math.abs(computer.computePi() - 3.1415926535) < 0.0001
	}
	
	def "in the 60's, TV thought computers made typewriter noises"() {
		expect: 
		computer.makeTypewriterNoises() is("clickity-clickity-click")
	}
	
	def cleanupSpec() {
		computer?.stop()
	}
}
