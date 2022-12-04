package com.blogspot.jvalentino.gradle

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder

import spock.lang.Specification

class RandomTaskTestSpec extends Specification {

    RandomTask task
    
    def setup() {
        Project p = ProjectBuilder.builder().build()
        task = p.task('hello', type: RandomTask)
    }
    
    void "Test perform"() {
        when:
        task.perform()
        
        then:
        true
    }
}
