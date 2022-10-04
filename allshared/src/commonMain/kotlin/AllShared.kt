package co.touchlab.multirepodemo.allshared

import co.touchlab.multirepodemo.moduleA.FeatureA
import co.touchlab.multirepodemo.moduleb.FeatureB

class AllShared {
    private val featureA = FeatureA()
    private val featureB = FeatureB()

    fun doMultipleThings() {
        println("Hello from allshared!")
        featureA.doSomething()
        featureB.doSomething()
    }
}
