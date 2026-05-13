fun main(){
    var x = 0;
    while(x <= 10){
        print(x)
        x+=1
    }

    var cant = 0
    var suma = 0
    do {
        print("Ingrese un numero mayor (0 para finalizar)")
        val valor = readln().toInt()
        if (valor != 0) {
            suma += valor
            cant++
        }
    } while (valor != 0){
        val promedio = suma / cant
        print("El promedio es: $promedio")
    } else {
        print("No se ingresaron valores.")
    }
        
}