var menor = 11
var calificacion = 0.0

for (i <- 1 to 40) {

println ("Ingresa tu calificacion: ") {
calificacion = readFloat ()


if (calificacion < menor ) {
menor = calificacion
}

}
 println ("La calificacion menor obtenida es: " + menor)
 