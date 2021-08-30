// 증감 연산자와 비트 연산자 and 출력 기법
fun main() {
    var a = 10
    var b = 5
    println("++a = "+ ++a)
    println("b++ = ${b}")
    println("${b}")
    
    val c: Boolean 
    val d: Boolean
    c = true
    d = false
    println(c and d)
    println(c or d)
    
    var one = 1
    println(one shl 3)
}
