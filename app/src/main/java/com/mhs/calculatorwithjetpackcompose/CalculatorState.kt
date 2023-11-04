package com.mhs.calculatorwithjetpackcompose

data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operations: CalculatorOperations? = null
)
