// Char Type, String Type
fun main() {
    // Char
    var ch:Char = 'A'
    var ch2:Char
    println(ch)
    
    ch = '\uAC00'
    println(ch)
    
    ch2 = '\uAC00' + 1
    println(ch2)
    
    ch = '한'
    println(ch.toInt())
    
    //String
    var str:String = "Hello"
    println(str)
    
    str = str + "\nKotlin!"
    println(str)
    
    println(str[8])
    
    val num = 10*5 + 3
    println(str+num)
}
