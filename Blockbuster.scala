class Pelicula (
	n:string)
	{
	val Nombre = n
	val Clasificacion = null
	val precioDia = null 
}
def Clasificar (c:string){
	clasificacion = c 
	clasificacion match {
		case Niños => precioDia = 10
		case Estrenos => precioDia = 25
		case default => precioDia = 15
	}

}
}
class PeliculaRentada (p:Pelicula, d:Int){
	val pelicula = p
	val diasRentada =d

	def precio ():Double = {
		var descuento = 0.0
		match pelicula.clasificacion {
			case "Niños" => {
				if (diasRentada >= 3){
					descuento = 0.15
				}
			}
            case "Regular"=> {
            	if (diasRentada >=2){
            		descuento = 0.1
            	}
            }
				
				case default  => descuento = 0
			}
		}

		var precio = pelicula.precioPorDia * diasRentada
       return precio - precio*descuento
	}
}

class Renta  {
	val peliculas = new Array [Pelicula](50)

	def rentar  (pelicula:Pelicula,dias:Int){
		peliculas (peliculasRentadas)=new peliculasRentadas (pelicula,dias)
		peliculasRentadas+=1

		def total (): Double = {
			var Total = 0.0
			for(i <-0 to peliculasRentadas - 1){
      Total += peliculas(i).precio()
    }
    return total
  }
}

var respuesta='n'
val renta= new Renta()
do{
	
	println ("----------* Bienvenido a Blockbuster *----------")
	println ("                                                ")
  val pelicula = new Pelicula("")
  println("Titulo de la pelicula que desea rentar  : ")
  var titulo = readLine()
	//println (titulo)
  println("La clasificacion que manejamos es: ")
	 println ("1.Estrenos")
	 println ("2.Niños")
	 println ("3.Regular")
  var clasificacion = readLine()
	//println (clasificacion)
  println("Dias a rentar: ")
  var dias = readInt()
	//println (dias)
  pelicula.Clasificar(clasificacion)
  Renta.rentar(pelicula, dias)

  println("Desea rentar otra pelicula: (s/n) ")
  respuesta = readChar()

}
	while (respuesta!='n')
	println("Total a pagar: " + renta.totalAPagar())