fun main() {
    var carga = 0
    var minutos = 0
    
    println("Iniciando carga de batería...")
    
    while (carga < 100) {
        carga += 5  
        minutos++
        println("Minuto $minutos: Carga al $carga%")
        
        if (carga > 100) carga = 100
    }
    
    println("Batería cargada. Tiempo total: $minutos minutos")
}