println ("Ingresa las horas trabajadas")
val HorasTrabajadas=readFloat()

if (HorasTrabajadas<=40)
{
val Salario1=HorasTrabajadas*160
println ("El salario total del obrero es: "+ Salario1)
}

if  (HorasTrabajadas>=40)
{
val HorasExtra=HorasTrabajadas-40

val SalarioTotal=HorasExtra*200+160*40

println ("El Salario obtenido es: "+ SalarioTotal)
}

else 
{
("Valores Fuera de rango")
}