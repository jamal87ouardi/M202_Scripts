package com.example.m202_coroutines_1








    fun main() {

        val numbers = ArrayList<Int>()


        numbers.add(7)
        numbers.add(100)
        numbers.add(35)

        //println("Liste initiale: $numbers")

        numbers.add(1, 4)

       // println("Liste : $numbers")

        numbers[0] = 5



        numbers.add(2)

        numbers.add(2)
        //println("Liste : $numbers")

        numbers.remove(2)

        println("Liste : $numbers")
        //println("Liste : $numbers")

        //println("Liste mise à jour: $numbers")


        val contains3 = numbers.contains(3)
        println("La liste contient le nombre 3 : $contains3")


        val size = numbers.size
        println("Taille de la liste : $size")


        println("Éléments de la liste :")
        for (number in numbers) {
            println(number)
        }

        var list = arrayOf(1,3,6) //read Only

        var l = listOf(1,4,5)  // READ oNLY

        var listm = mutableListOf(2,"Jeudi",true,56)  // List héterogène



    }


