var CantidadNeutros = 0
var CantidadPositivos = 0
var CantidadNegativos = 0

for (i <- 1 to 20 ) {
	println ("Ingresa un numero: ")
	numero = readInt ()

	if ( numero > 0 ){
    CantidadPositivos += 1
    }

    if (numero < 0 ){
    CantidadNegativos += 1
    }

    else {
    CantidadNeutros += 1
     }

      }

      println ("Ingresaste:  " + CantidadPositivos + "numeros positivos") 
      println ("Ingresaste:  " + CantidadNegativos + "numeros negativos")
      println ("Ingresaste:  " +  CantidadNeutros  + "numeros neutros")