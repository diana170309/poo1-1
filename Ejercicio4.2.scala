println ("Tiempo recorrido del atleta")


var Promedio=0.0

for (i <- 1 to 10){
println ("Ingresa el tiempo que realizaste en correr el dia de hoy:  " + i)
val Tiempo=readInt()

 
if (Tiempo < 16){
println ("El corredor es apto para la prueba de 5 kilometros")
}

else {
println ("Usted ha sobrepasado el tiempo permitido paraser apto para la prueba")
}
 
 Promedio =  Tiempo  
}
val Promedio1=Promedio/10  
println ("El promedio del corredor es " + Promedio)

if (Promedio <= 15){

println ("El corredor es apto para la prueba" )

}
 
else {
 println ( "El corredor debe buscar otra especialidad")
}








