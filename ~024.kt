// when : switch case의 상위호환
fun main() {
    val score = 64
    
    when(score/10)
    {
        6->{println('D')}
        7->{println('C')}
        8->{println('B')}
        9,10->{println('A')}
        else->{println('F')}
    }
    println("test")
    
    val score2 = 90
    val grade:Char = when(score/10)
    {	
        6->'D'
        7->'C'
        8->'B'
        9,10->'A'
        else->'F'
	}
    println("grade: "+grade)
}
