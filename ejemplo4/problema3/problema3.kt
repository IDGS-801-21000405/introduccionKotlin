fun main() {
    val CLAVE_CORRECTA = "1234"
    var intentos = 0
    val MAX_INTENTOS = 3
    var accesoConcedido = false
    
    while (intentos < MAX_INTENTOS && !accesoConcedido) {
        print("Ingresa la clave de seguridad: ")
        val claveIngresada = readLine()
        
        if (claveIngresada == CLAVE_CORRECTA) {
            accesoConcedido = true
            println("Acceso concedido. Bienvenido.")
        } else {
            intentos++
            val intentosRestantes = MAX_INTENTOS - intentos
            if (intentosRestantes > 0) {
                println("Clave incorrecta. Te quedan $intentosRestantes intentos.")
            }
        }
    }
    
    if (!accesoConcedido) {
        println("ACCESO BLOQUEADO. Demasiados intentos fallidos.")
    }
}