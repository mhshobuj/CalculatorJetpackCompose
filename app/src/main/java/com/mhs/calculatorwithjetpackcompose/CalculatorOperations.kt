package com.mhs.calculatorwithjetpackcompose

sealed class CalculatorOperations(val symbol: String){
    object Add: CalculatorOperations("+")
    object Subtraction: CalculatorOperations("-")
    object Multiply: CalculatorOperations("x")
    object Divide: CalculatorOperations("/")
    data class Operation(val operation: CalculatorOperations): CalculatorActions()
}
