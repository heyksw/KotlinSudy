// example 001~003
fun main() {
    var total: Int
    total = 0
    
    val a: Int = 10 + 20
    println(a)
    
    val b: Int = 43 + 75 + a
    println(b)
    
    total = a+b
    println(total)
    
    total = total + 1
    println(total)
    
    /* error : Val cannot be reassigned
    a = a+1
    println(a)
    */
}
