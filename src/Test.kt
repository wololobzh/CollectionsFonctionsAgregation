fun main(args: Array<String>)
{
    val list = listOf(5,10,15,20)
    println(list.any{it>5})//true
    println(list.all{it%5==0})//true
    println(list.count())//4
    println(list.forEach{println(it)})
    println(list.forEachIndexed{index,valeur->println("$index : $valeur")})
    println(list.max())//20
    println(list.maxBy{it*-1})//5
    println(list.none{it>50})//true
    println(list.sumBy{it+5})//70
}
