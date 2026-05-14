fun main() {
    val matriz1 = Array(3) { IntArray(3) }
    val matriz2 = Array(3) { IntArray(3) }
    val resultado = Array(3) { IntArray(3) }

    // Captura de datos para la primera matriz
    println("--- Ingresa los valores para la Primera Matriz (3x3) ---")
    for (i in 0..2) {
        for (j in 0..2) {
            print("Ingrese el valor para matriz1[$i][$j]: ")
            matriz1[i][j] = readln().toInt()
        }
    }

    // Captura de datos para la segunda matriz
    println("\n--- Ingresa los valores para la Segunda Matriz (3x3) ---")
    for (i in 0..2) {
        for (j in 0..2) {
            print("Ingrese el valor para matriz2[$i][$j]: ")
            matriz2[i][j] = readln().toInt()
        }
    }

    // Proceso de suma de matrices
    for (i in 0..2) {
        for (j in 0..2) {
            resultado[i][j] = matriz1[i][j] + matriz2[i][j]
        }
    }

    // Impresión del resultado
    println("\n--- Resultado de la Suma ---")
    for (i in 0..2) {
        for (j in 0..2) {
            print("${resultado[i][j]}\t")
        }
        println() // Salto de línea para formar las filas de la matriz
    }
}