package mjg.tos

import spock.lang.Unroll;
/*
 * Copyright 2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

class HelloSpock extends spock.lang.Specification {
    @Unroll({"$name should be $length"})
	def "length of Spock's and his friends' names"() {
		expect:
		name.size() == length

		where:
		name     | length
		"Spock"  | 5
		"Kirk"   | 5
		"Scotty" | 6
	}
	
	def "check lengths using arrays"() {
		expect: name.size() == length

        where:
		name << ["Spock","Kirk","Scotty"]
		length << [5,4,6]
	}
	
	def "check lengths using pairs"() {
		expect: name.size() == length
		where:
		[name,length] << [["Spock",5],["Kirk",4],["Scotty",6]]
	}
}