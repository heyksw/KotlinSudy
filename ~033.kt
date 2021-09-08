fun main() {
    println(getAverage(80,100))
    getAverage(100,50,true)
    println(getAverage(90))
    getAverage(66,print=true)
    getAverage(print=true)
    getAverage(print=true, a=10, b=30)	// 매개변수를 이름을 직접 지정하면 인수의 위치를 마음대로 변경 가능하다..
}

fun getAverage(a:Int = 0, b:Int = 0, print:Boolean=false):Double
{
    val result = (a+b) / 2.0
    if(print)
    	println("print : "+result)
    return result
}
