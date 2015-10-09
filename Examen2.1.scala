var maximo = 0
var minimo = 100
var puntosContaminantes = 0
var suma = 0

for (i <- 1 to 25) {
println ("Ingresa los puntos Contaminantes: ")
puntosContaminantes = readInt ()

if (puntosContaminantes < minimo) {
minimo = puntosContaminantes
}

if (puntosContaminantes > maximo) {
maximo = puntosContaminantes
}

suma += puntosContaminantes 
}

 println ("El promedio es: " + (suma/25))
println ("El mas contaminanate es:  " + maximo) 
println ("El menos contaminanates es:  " + minimo)