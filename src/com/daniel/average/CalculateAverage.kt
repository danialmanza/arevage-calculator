package com.daniel.average

import java.lang.Exception

fun main (args: Array<String>){
    println("Calculate verage")
    println("how many notes do you have")
    val numNotes = try {
        readLine()?.toInt() ?: 0
    }catch (e: Exception){
        println("this is not a valid number")
        0
    }
    val note: MutableList<Double> = mutableListOf()
    val percentage: MutableList<Double> = mutableListOf()
    for (notes in 1..numNotes){
        note.add(getNotes())
        percentage.add(getPercentage())
    }

    note.forEachIndexed { index, value ->
        println("note${index + 1}")
        println("$value")
        println("percentage: ${percentage[index]}")
    }

    var resultPercentage: Double
    var result = 0.0
    var result2 = 0.0
    percentage.forEachIndexed { index, value ->
        resultPercentage = value
        resultPercentage /= 100.0
        result += note[index] * resultPercentage
    }

    var conditionResult = 0.0
    percentage.forEach { value ->
        conditionResult +=value
    }

    println()
    print("Your average is: $result")
}

fun getNotes ():Double {
    do {
        println("Write your note")
        val number = try {
            readLine()?.toDouble() ?: 0.0
        } catch (e: Exception) {
            println("this is not a valid number")
            0.0
        }
        if (number in 1.0..10.0) {
            return number
        }
        println("number incorrect")
    } while (true)
}

    fun getPercentage(): Double{
        do {
            println("write your percentage of to respective matters")
            val perce = try {
                readLine()?.toDouble() ?: 0.0
            }catch (e: Exception){
                println("this is not a valid number")
                0.0
            }
            if (perce in 1..100) {
                return perce
            }
            println("number incorrect")
        }while (true)
    }