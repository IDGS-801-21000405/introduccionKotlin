import kotlin.math.PI

fun main() {
    var opcion: Int
    
    do {
        mostrarMenu()
        print("Elige una opcion: ")
        opcion = readLine()?.toIntOrNull() ?: 0
        
        when (opcion) {
            1 -> areaCirculo()
            2 -> areaCuadrado()
            3 -> areaRectangulo()
            4 -> areaTriangulo()
            5 -> println("Saliendo del programa...")
            else -> println("Opcion inválida. Intenta de nuevo.")
        }
        println() 
        
    } while (opcion != 5)
}

fun mostrarMenu() {
    println("=== CÁLCULO DE AREAS ===")
    println("1. Círculo")
    println("2. Cuadrado") 
    println("3. Rectángulo")
    println("4. Triángulo")
    println("5. Salir")
}

fun areaCirculo() {
    print("Ingresa el radio del circulo: ")
    val radio = readLine()?.toDoubleOrNull() ?: 0.0
    
    if (radio <= 0) {
        println("Error: El radio debe ser mayor a 0")
        return
    }
    
    val area = PI * radio * radio
    println("El area del círculo es: ${String.format("%.2f", area)}")
}

fun areaCuadrado() {
    print("Ingresa el lado del cuadrado: ")
    val lado = readLine()?.toDoubleOrNull() ?: 0.0
    
    if (lado <= 0) {
        println("Error: El lado debe ser mayor a 0")
        return
    }
    
    val area = lado * lado
    println("El area del cuadrado es: ${String.format("%.2f", area)}")
}

fun areaRectangulo() {
    print("Ingresa la base del rectangulo: ")
    val base = readLine()?.toDoubleOrNull() ?: 0.0
    print("Ingresa la altura del rectángulo: ")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0
    
    if (base <= 0 || altura <= 0) {
        println("Error: Base y altura deben ser mayores a 0")
        return
    }
    
    val area = base * altura
    println("El área del rectángulo es: ${String.format("%.2f", area)}")
}

fun areaTriangulo() {
    print("Ingresa la base del triángulo: ")
    val base = readLine()?.toDoubleOrNull() ?: 0.0
    print("Ingresa la altura del triángulo: ")
    val altura = readLine()?.toDoubleOrNull() ?: 0.0

    if (base <= 0 || altura <= 0) {
        println("Error: Base y altura deben ser mayores a 0")
        return
    }
    
    val area = (base * altura) / 2
    println("El área del triángulo es: ${String.format("%.2f", area)}")
}