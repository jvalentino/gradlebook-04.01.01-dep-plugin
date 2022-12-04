package com.blogspot.jvalentino.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

import org.apache.commons.rng.UniformRandomProvider
import org.apache.commons.rng.simple.RandomSource

/**
 * <p>Generates a random number.</p>
 * @author jvalentino2
 */
@SuppressWarnings(['Println'])
class RandomTask extends DefaultTask {

    @TaskAction
    void perform() {
        UniformRandomProvider rng = RandomSource.create(RandomSource.MT)

        double random = rng.nextDouble()
        println "RANDOM: ${random}"
    }
}
