fun main(){
    println("Ingresa el sueldo del empleado")
    val sueldo = readln().toDouble()
    if (sueldo > 300){
        println("Paga impuestos")
    } else 
        println("No paga impuestos")


    val a = 3
    val b = 4
    val mayor = if(a > b) a else b
    println("\nEl numero mayor entre $a y $b es: $mayor")
}
