println ("Elige el Ejercicio que deseas: ")
println ("1. Salario ")
println ("2. Compra  ")
println ("3. Descuento ")
println ("4. Jubilaciones ")
println ("5. Salir ")

var Opcion = readInt ()

Opcion match {
	case 1 =>Salario
	case 2 =>Compra
	case 3 =>Descuento
	case 4 =>Jubilaciones
	case 5 => println ("Adios....")     
}

def Salario () {
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
}
def Compra () {
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

def Descuento ()  {
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
 
 def Jubilaciones () {
 	println("Edad de la persona adscrita a jubilarse")
val Edad=readInt()
println("Antiguedad en su empleo de la persona adscrita a jubilarse")
val Antiguedad=readInt()
 if (Edad>= 60 && Antiguedad < 25){
 	println("El adscrito se jubilara por edad")
 } 
 else if(Edad < 60 && Antiguedad >= 25){
 	println("El adscrito se jubilara por antiguedad joven ")
 	}
 	else if (Edad>= 60 && Antiguedad >= 25) {
 		println("usted se jubilara por antiguedad adulta")

 	} 
 }