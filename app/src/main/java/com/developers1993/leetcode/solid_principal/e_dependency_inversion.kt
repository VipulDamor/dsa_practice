package com.developers1993.leetcode.solid_principal

/**
 * High-level modules should not depend on low-level modules.
 * Both should depend on abstractions.
 * inShort Depend on Abstraction not concrete
 * */


//todo Violation of DependencyInversionPrincipal:
// The HighLevelModule depends directly on LowLevelModule.
class LowLevelModule{
    fun performAction(){
        println("Low-level action")
    }
}

class HighLevelModule {
    private val lowLevelModule = LowLevelModule() // violation concrete implementation

    fun execute(){
        lowLevelModule.performAction()
    }
}

//todo Correct way: Depend on abstractions, not on concrete implementations.
interface ActionModule{
    fun performAction()
}

class LowLevelModuleDI : ActionModule{
    override fun performAction() {
        println("Low-level action")
    }
}
class HighLevelModuleDI(private val actionModule: ActionModule){
    fun execute(){
        actionModule.performAction()
    }
}

fun main(){
    val lowLevelModule = LowLevelModuleDI()
    val highLevelModuleDI = HighLevelModuleDI(lowLevelModule)
    highLevelModuleDI.execute()

}
//todo These examples follow the SOLID principles to ensure
// your Kotlin code is more modular, maintainable, and flexible!