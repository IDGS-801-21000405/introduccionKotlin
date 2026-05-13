fun main() {
    var diametro: Double
    
    do {
        print("Ingresa el diámetro de la tubería (debe ser > 0): ")
        diametro = readLine()?.toDoubleOrNull() ?: 0.0
        
        if (diametro <= 0) {
            println("Error: No se permiten valores negativos o cero. Intenta de nuevo.")
        }
    } while (diametro <= 0)
    
    println("Diámetro válido ingresado: $diametro")
}