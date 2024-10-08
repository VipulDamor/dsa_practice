package com.developers1993.leetcode.solid_principal

/*
 * 1. Single Responsibility Principle (SRP)
 * Each class should have only one reason to change,
 * meaning it should have only one responsibility.
 * */


/**
 *Violation of SingleResponsibility:
 * The Report class is responsible for both
 * generating and saving the report.
 */

class Report {
    fun getReport(): String {
        return "Report 1"
    }

    fun saveReport(data: String) {
        println("report saved $data")
    }
}


/*
* Correct way: Each class has one responsibility.
* */
class ReportGenerator{
    fun generate():String{
        return "Report 1"
    }
}
class ReportSaver{
    fun saveReport(data : String){
        println("report saved $data")
    }
}

fun main() {
    val generator = ReportGenerator()
    val saver = ReportSaver()
    val report = generator.generate()
    saver.saveReport(report)
}