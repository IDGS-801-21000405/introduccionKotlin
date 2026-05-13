fun main(){
    val saludo: String = "Hola" //inmutable
    var nombre: String = "Kotlin" //mutable
    println("$saludo, $nombre")

    println("\nIngresa el primer numero:")
    val num1 = readln().toInt()

    println("\nIngresa el segundo numero:")
    val num2 = readln().toInt()
    var res = num1 - num2
    println("La resta de los numeros es: $res")
}