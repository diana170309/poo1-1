var nombres = new Array[String](50)
var precios = new Array[Float](50)
var codigos = new Array[String](50)
var cantidadProductos = 0

puntoDeVenta()

def puntoDeVenta() {
  var opcion = 3
  do {
    mostrarMenuPrincipal()
    opcion = readInt()
    opcion match {
      case 1 => catalogo()
      case 2 => nota()
      case default => println("Adios...")
    }
  } while (opcion != 3)
}

def mostrarMenuPrincipal() {
  println("1) Agregar productos")
  println("2) Nota")
  println("3) Salir")
}

def catalogo() {
  var continuar = 'N'
  do {
    capturarDatosProducto()
    cantidadProductos += 1
    mostrarCatalogoProductos()
    print("¿Quieres agregar otro producto (S/N)? ")
    continuar = readChar()
  } while (continuar == 'S')
}

def capturarDatosProducto() {
  println("Ingresa los datos del producto")
  print("Nombre: ")
  nombres(cantidadProductos) = readLine()
  print("Precio: ")
  precios(cantidadProductos) = readFloat()
  print("Código de barras: ")
  codigos(cantidadProductos) = readLine()
}

def mostrarCatalogoProductos() {
  println("# | Nombre | Precio | Código")
  for (i <- 0 to cantidadProductos - 1) {
    println((i + 1) + " | " + nombres(i) + " | " +  precios(i) + " | " + codigos(i))
  }
}

def nota() {
  var otro = 'N'
  var totalNota = 0.0
  do {
    mostrarCatalogoProductos()
    print("Ingresa el # del producto: ")
    var producto = readInt()
    print("Cantidad de productos: ")
    var cantidad = readInt()
    totalNota += precios(producto - 1) * cantidad
    print("Agregar otro producto (S/N): ")
    otro = readChar()
  } while (otro != 'N')
  println("Total a pagar " + totalNota)
}
