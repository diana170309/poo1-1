class Racional(n: Int, d: Int) {
  val numerador = n
  val denominador = d

  def Multiplicacion (b: Racional): Racional = {
    new Racional(
      numerador * b.numerador ,
      denominador * b.denominador
    )
  }
}
print("Numerador de la primera fraccion: ")
val n1 = readInt()
print("Denominador de la primera fraccion: ")
val d1 = readInt()
val fraccion1 = new Racional(n1, d1)

print("Numerador de la primera fraccion: ")
val n2 = readInt()
print("Denominador de la primera fraccion: ")
val d2 = readInt()
val fraccion2 = new Racional(n2, d2)

val Multiplicacion = fraccion1.Multiplicacion (fraccion2)

println ("Resultado:   " + Multiplicacion.numerador + "/" + Multiplicacion.denominador)