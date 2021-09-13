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
변수의 선언에서 if와 else를 사용하는 것이다. 사실 파이썬에서도 가능하지만, print까지 가능하지는 않다.
### 3. 가변인자 vararg
매개변수 앞에 vararg 키워드를 붙이면 여러 개의 인수를 받을 수 있게 된다.
<pre>
<code>
fun main()
{
    println(getSumOf(1,2,3,4,5,6,7))
    println(getSumOf(10,20,30)
    println(getSumOf())
}

fun getSumOf(vararg numbers: Int):Int
{
    val count = numbers.size;
    var i = 0; var sum = 0;
    while(i < count){
        sum += numbers[i]
        i += 1
    }    
    return sum
}
</code>
</pre>
결과 : <code> 28 60 0 </code>
