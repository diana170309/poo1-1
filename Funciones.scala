println ("Elige el numero del Ejercicio que deseas:  ")
println ("1. Salario")
println ("2. Compra ")
println ("3. Descuento")


var Opcion= readInt ()

Opcion match {
	case 1 => Salario ()
	case 2 => Compra  ()
	case 3 => Descuento ()
	case 4 => println ("Opcion invalida")
}

def  Salario () {

	println ("ingresar las horas trabajadas por el obrero")
val HorasTrabajadas=readFloat

if  (HorasTrabajadas<=40){
  val salario=HorasTrabajadas* 160
  println("se le pagara al empleado $160 por hora, el salario total es: " + salario)
}
else {
	val HorasExtra=HorasTrabajadas- 40 
	 val SalarioTotal=HorasExtra *200 + 6400

	println ("Se le pagara al  empleado $160 las primeras 40 horas y cada hora extra $200, la cantidad que se le pagara es:  " + SalarioTotal)

}

}

def Compra  () {
	
	println ("Monto total de la compra")
val MontoTotal=readFloat ()


if (MontoTotal<=500000)
{
val PagoEmpresa=(MontoTotal*.70)
val PagoFabricante=(MontoTotal*.30)
val ConceptoIntereses=(PagoFabricante*.20)
println ("El pago que  efectuara la empresa es " + PagoEmpresa)
println ("El credito que se le solicitara al fabricante es " + PagoFabricante)
println ("El interes que se le pagara al fabricante por el credito es "  + ConceptoIntereses)

}

else if (MontoTotal>500000)
{
val PagoEmpresa=(MontoTotal*.55)
val PagoBanco=(MontoTotal*.30)
val PagoFabricante=(MontoTotal*.15)
val ConceptoIntereses=PagoFabricante*.20
println ("El pago que  efectuara la empresa es " + PagoEmpresa )
println ("El banco prestara   " + PagoBanco  )
println ("El credito que se le solicitara al fabricante es " + PagoFabricante)
println ("El interes que se le pagara al fabricante por el credito es "  + ConceptoIntereses)
}

else 
{
("Valores Fuera de rango")
}

}

def  Descuento () {
	
	println ("Introduce la cantidad de tu compra")
val CompraRealizada=readFloat()


println ("Los colores de las bolas son: ")
println ("1.Blanca")
println ("2.Verde")
println ("3.Amarilla")
println ("4.Azul")
println ("5.Roja")																															
println ("Elige el numero que corresponda al color de la bola obtenida:")
val Bola = readInt()
 
 Bola match {

 case 1  => println("No se le hara ningun descuento :(, su total a pagar es: " + CompraRealizada)
 


 case 2 =>{ 
 	println("Usted tiene un descuento del 10% de su compra, su total a pagar es: " )
 	val descuento=CompraRealizada*.10
     val total=CompraRealizada - descuento
     println (" " + total)
}    
 case 3 => {
 	println("Usted tiene un descuento del 25% de su compra, su total a pagar es: " )
 	val descuento=CompraRealizada*.25
     val total=CompraRealizada - descuento
     println (" " + total)
}
 case 4 => {
 	println("Usted tiene un descuento del 50% de su compra, su total a pagar es: " )
 	val descuento=CompraRealizada*.50
     val total=CompraRealizada - descuento 
     println (" " + total)
 }

 case 5 => {
 	println("Usted tiene un descuento del 100% de su compra, su total a pagar es: ")
     val descuento=CompraRealizada*.100
     val total=CompraRealizada - descuento
     println (" " + total)
   } 

 case default => println("Color de bola no existente") }

}

