class Racional(n: Int, d: Int) {
  val numerador = n
  val denominador = d

  def resta (b: Racional): Racional = {
    new Racional(
      numerador * b.denominador - denominador * b.numerador,
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

val resta = fraccion1.resta(fraccion2)

println ("Resultado:   " + resta.numerador + "/" + resta.denominador)

//println(resta.numerador + "/" + resta.denominador)
