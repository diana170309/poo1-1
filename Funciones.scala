class Racional(n: Int, d: Int)  {
  var numerador = n
  var denominador = d
 
def Suma(b: Racional): Racional = {
    new Racional(
      numerador * b.denominador + denominador * b.numerador,
      denominador * b.denominador
    ) 
}
 def Resta (b: Racional): Racional = {
    new Racional(
      numerador * b.denominador - denominador * b.numerador,
      denominador * b.denominador
    )
  }
def Multiplicacion (b: Racional): Racional = {
    new Racional(
      numerador * b.numerador ,
      denominador * b.denominador
    )
  }

  def Division (b: Racional): Racional = {
    new Racional(
      numerador * b.denominador,
        denominador * b.numerador
      
    )
  }
}
var Opcion = 5

do {
  
  println("Numerador de la primera fraccion: ")
val n1 = readInt()
println("Denominador de la primera fraccion: ")
val d1 = readInt()
val fraccion1 = new Racional(n1, d1)

println("Numerador de la primera fraccion: ")
val n2 = readInt()
println("Denominador de la primera fraccion: ")
val d2 = readInt()
val fraccion2 = new Racional(n2, d2)


  println ("Elige la operacion de fracciones que deseas realizar:  ")
  println ("1. Suma")
  println ("2. Resta")
  println ("3.  Multiplicacion")
  println ("4.  Division") 
  println ("5.  Salir")

  Opcion = readInt ()



   Opcion match {

	case 1 =>  {

 val Suma = fraccion1.Suma(fraccion2)

println ("Resultado:   " + Suma.numerador + "/" + Suma.denominador)
}
  	
  	case 2 =>  {
 val Resta = fraccion1.Resta(fraccion2)

println ("Resultado:   " + Resta.numerador + "/" + Resta.denominador)
	}

		case 3 => {
 val Multiplicacion = fraccion1.Multiplicacion(fraccion2)

println ("Resultado:   " + Multiplicacion.numerador + "/" + Multiplicacion.denominador)
	
}

  	case 4 =>  {
val Division = fraccion1.Division(fraccion2)

println ("Resultado:   " + Division.numerador + "/" + Division.denominador)
 }

 case default => println ("Hasta Pronto")


}
}

while (Opcion != 5)
println("Hasta Pronto")


  

