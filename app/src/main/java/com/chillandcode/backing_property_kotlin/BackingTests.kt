package com.chillandcode.backing_property_kotlin

// view kotlin byte code
// Alt+Shift+A => enter bytecode select kotlin byte code and then click decompile to see the system generated methods

//*******************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************
fun main() {

 //RUN THIS CODE FILE FROM LEFT SIDE GREEN TRIANGLE
 // READ--- AND COMMENT OUT ACCORDINGLY
 //YOUTUBE LINK https://www.youtube.com/watch?v=oM4I2vDeYik
    //*******************************************************************************************************************************************************************************************************************************************************************************************************************************************************************************
    println("welcome to kotlin backing property")

//**case 1 111111111111111111111111111111111

//If I run this there will be stack over flow error because inside the person class

//val person=Person()
//    person.name="Sam"

//    Exception in thread "main" java.lang.StackOverflowError
//    at com.chillandcode.backing_property_kotlin.Person.setName(BackingTests.kt:14)
//    at com.chillandcode.backing_property_kotlin.Person.setName(BackingTests.kt:14)
//    at com.chillandcode.backing_property_kotlin.Person.setName(BackingTests.kt:14)
//    at com.chillandcode.backing_property_kotlin.Person.setName(BackingTests.kt:14)
//    at com.chillandcode.backing_property_kotlin.Person.setName(BackingTests.kt:14)

    //reason : //check the kotlin byte code state
    // when we use set method for the property name => using the name key word inside the set method it creates another call of name.set method which in turn keep on going creating a stack overflow

    //solution = >


//    case 2 222222222222222222222222222222222222222
    //using get
    val person2 = Person()
    println("case 2 using get  ${person2.name}")
}


//**case 1 111111111111111111111111111111111111111111

//class Person{
//    var name="Vishnu"
//        set(value:String) {
//            name=value
//        }
//}

//case1 solution
//use field instead of using the variable name
class Person {
    var name = "Vishnu"
        set(value: String) {
            field = value//uses field instead of name
        }
    //case 2 using get

    //ERROR
    // on name gives errors

    //get() = name.uppercase()

        //solution
        //we use field instead of the variables name itself
        get() = field.uppercase()
}