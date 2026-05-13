import kotlin.math.pow

fun mostrarMayor(v1: Int, v2: Int, v3: Int){
    println("Mayor")
    if(v1 > v2 && v1 > v3){
        println(v1)
    } else {
        if (v2 > v3){
            println(v2)
        } else {
            println(v3)
        }
    }
}

fun retornarMayor2(v1: Int, v2: Int): Int {
    if (v1 > v2){
        return v1
    } else {
        return v2
    }
}

fun limpiarPantalla(){
    ProcessBuilder("cmd", "/c", "cls")
        .inheritIO()
        .start()
        .waitFor()
}

fun main(){
    limpiarPantalla()
    println("Ingrese el primer parametro valor")
    val val1 = readln().toInt()
    println("Ingrese el segundo parametro valor")
    val val2 = readln().toInt()
    println("Ingrese el tercer parametro valor")
    val val3 = readln().toInt()

    println(String.format("%.2f", 3.141698))
    mostrarMayor(val1, val2, val3)
}