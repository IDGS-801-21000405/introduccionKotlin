fun main(){
    val numeros = arrayOf(1,2,3,4,5)
    println(numeros[0])
    
    val nombres = arrayOf("Ana", "Luis", "Carlos") 
    println(nombres[1])
    
    val frutas = arrayOf("Manzana", "Pera", "Uva")
    for(fruta in frutas) {
        println(fruta)
    }

    val numeros = Array(5) (0)

    val matriz = arrayOf(
        arrayOf(1,2),
        arrayOf(3,4)
    )
    println(matriz[1][0])
}