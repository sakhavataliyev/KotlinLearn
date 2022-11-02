package com.aliyev.kotlinlearn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Variables and Constant

        println("Hello Kotlin");
        println(5 * 8);

        var x = 2;
        var y = 9;

        x= 10;

        println(x * y);

        var age = 20;

        println(age/x * y);

//        val name = "Aliyev";

        val a = 6;

    //Defining
        val myInteger : Int;
    //Initialize
        myInteger = 6;

//        myInteger = 99;

        val b : Int = 7;

        println(b);

//        Double and Float
        val myFloat : Float = 3.14f;

        var h = myFloat / 2;
        println(h);

        val myDouble : Double = 8.4;

        var myValue = myDouble / 2.1;
        println(myValue);


//        String

        var myString = "aliyev test";

        println(myString);

        var name = "test"
        var surname = "aliyev"

        var fullname = name + " " + surname

        println(fullname)

        var myString2 : String = "String 2 test"
        println(myString2)

        println(fullname.capitalize())


//        Boolean
        var myBoolean : Boolean = true
        myBoolean = false

        var isAlive = true

        println(5 < 8)
        println(8 > 2)
        println(5 != 5)
        println(9 == 9)

//        Conversion

        var myNumber = 5
        var myLongNumber = myNumber.toLong()
        println(myLongNumber)

        var input = "8"
        var myIntNumber = input.toInt()
        println(myIntNumber * 5)


//       Collections
        val myArray = arrayOf("Salam", "Aliyev", "Test üçün", 8)

//        index
        println(myArray[2])
        myArray[2] = "Array Change Test"
        println(myArray[2])

        myArray.set(2, "Car Test" )
        println(myArray[2])

//        myArray[3] = "Array 3 Add Car Test"
//        println(myArray[3])

        val NumberArray = arrayOf(2,3,4,5,6)
        println(NumberArray[2])

        val DoubleArray = arrayOf("Aliyev", 8)
        println(DoubleArray[0])
        println(DoubleArray[1])

//      List Array list

        val myMusician = arrayListOf<String>("Artur","Jena")
        myMusician.add("Alex")
        println(myMusician[2])
        myMusician.add(0, "James")
        println(myMusician[0])

        val myArrayList = ArrayList<Int>()
        myArrayList.add(8)
        myArrayList.add(668)

        println(myArrayList[0])
        println(myArrayList[1])

        val myMixArrayList = ArrayList<Any>()
        myMixArrayList.add("Lila")
        myMixArrayList.add(8)
        myMixArrayList.add(5.67)
        myMixArrayList.add(true)

        println(myMixArrayList[0])
        println(myMixArrayList[1])
        println(myMixArrayList[2])
        println(myMixArrayList[3])


    //  Set

        val myExNumber = arrayOf(0, 1, 2, 3, 4)

        println("MyExNumber 1: ${myExNumber[1]} Number")
        println("MyExNumber 2: ${myExNumber[2]} Number")

        val mySet = setOf<Int>(1,1,2,3,4)
        println(mySet.size)

//        For each

        mySet.forEach{println(it)}

        val myStringFor = HashSet<String>()
        myStringFor.add("Aliyev")
        myStringFor.add("Aliyev")
        println(myStringFor.size)



//      Key - Map

        val fruitArray = arrayOf("Apple", "Banana")
        val priceArray = arrayOf(100, 300)

        println("Fruit and Price: ${fruitArray[0]} : ${priceArray[0]}")


        val fruitPriceMap = hashMapOf <String,Int>()
        fruitPriceMap.put("Apple", 100)
        fruitPriceMap.put("Banana", 300)
        println(fruitPriceMap["Banana"])

        val myNewHashMap = HashMap<String,String>()

        val myNewMap = hashMapOf<String, Int>("A" to 100, "B" to 4400, "C" to 8800)
        println(myNewMap["B"])

//      If - Else If - Else
        val myNewAge = 31

        if (myNewAge < 10) {
            println("Your age is ${myNewAge} < 10")
        }
        else if(myNewAge >= 10 && myNewAge <= 30) {
            println("Your age is 10 <= ${myNewAge} <= 30")
        }
        else{
            println("Your age is ${myNewAge} > 30")
        }

//      Switch - When

        val day = 2
        var dayString = ""

        when(day){
            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            else -> dayString = ""
        }

        println(dayString)

    }
}