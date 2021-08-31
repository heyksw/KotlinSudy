# Kotlin Study 
## [Kotlin 200제]
### 1. 문장
Kotlin도 Python과 마찬가지로, semicolon으로 문장을 구별할 수 있다.
<pre>
<code>
var num:Int; num = 5; println(num)
</code>
</pre>
결과 : <code>5</code>
### 2. if-else를 표현식으로 사용하기
Kotlin은 신기하게도, 다음과 같은 코드를 작성할 수 있다.
<pre>
<code>
// typealias & if else

fun main() {
    val value:Int = if(10>5)
    {
        println("10은 5보다 크다.")
        10
    }
    else
    {
     	println("10보다 5가 클까?")
        5
    }
    println(value)
}
</code>
</pre>
