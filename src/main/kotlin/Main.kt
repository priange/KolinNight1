fun main(args: Array<String>) {
    citizenDetails("Ityaku",24,"Uganda")
    addedValues(2,14,6,5)
    personDetails()

    averagedValue(1,8,29,4,39)
}

//1. Create and invoke a function that takes in a users name, age, and nationality and
// prints out “Hello my name is ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy, I am 23 years old
// and I am from Kenya” (2 points)
fun citizenDetails(name:String,age:Int,nationality:String){
    println("Hello my name is ${name},I am ${age} years old and I am from ${nationality}")
}
//2. Create and invoke a function that returns the sum of any given 4 numbers (3 points)
fun addedValues(num1:Int,num2:Int,num3:Int,num4:Int){
    var addition=num1+num2+num3+num4
    println(addition)
}
//3. Create and invoke a function that given any 5 numbers, it returns their average (2 points)
fun averagedValue(num1: Int,num2: Int,num3: Int,num4: Int,num5: Int){
var sum=num1+num2+num3+num4+num5
var available=sum/5
    println(available)

}
//4. You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not. (3 points)
fun personDetails(){
    var fullname="Omara Emmanuel"
    println("${fullname}")
    var age=23
    println("${age}")
    var phonenumber="O787303683"
    println("{$phonenumber}")
    var email="marie@gmail.com"
    println("${email}")
    var weight=40.0F
    println("${weight}")
    var citizen="Ugandan"
//    println("${citizen})
     var Kenyan:Boolean=false
    println("Student isnot a Kenyan")
}
