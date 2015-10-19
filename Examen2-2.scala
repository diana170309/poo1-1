var pino = 0.0
var oyamel = 0.0
var cedro = 0.0
var cantidadpino = 0.0
var cantidadoyamel = 0.0
var cantidadcedro = 0.0

println ("Reforestacion del Bosque")

println ("Ingresa la superficie del Bosque")
val SuperficieBosque = readFloat()

if (SuperficieBosque > 1000000){
println ("El bosque sera sembrado de la siguiente manera:    ")
 println ("70% de Pino")
 println ("20% de Oyameles")
 println ("10% de Cedro")

 pino = (SuperficieBosque*70/100)
 println ("La superficie en metros que sera sembrada de Pinos es: " + pino )
 oyamel = (SuperficieBosque*20/100)
 println ("La superficie en metros que sera sembrada de Oyameles es:  " + oyamel )
 cedro = (SuperficieBosque*10/100)
 println ("La superficie en metros que sera sembrada de Cedros es:  " + cedro )

 cantidadpino = pino *8 / 10
 println ("La cantidad de Pinos que se necesitan para sembrar el bosque son : " + cantidadpino)
 cantidadoyamel = oyamel * 15 / 15
 println ("La cantidad de Oyameles que se necesitan para sembrar el bosque son: " + cantidadoyamel )
 cantidadcedro = cedro * 10 / 18
 println ("La cantidad de Cedros que se necesitan para sembrar el bosque son: " + cantidadcedro)
}

if (SuperficieBosque <= 1000000) {
	
	println ("El bosque sera sembrado de la siguiente manera:    ")
 println ("50% de Pino")
 println ("30% de Oyameles")
 println ("20% de Cedro")

 pino = (SuperficieBosque*50/100)
 println ("La superficie en metros que sera sembrada de Pinos es: " + pino )
 oyamel = (SuperficieBosque*30/100)
 println ("La superficie en metros que sera sembrada de Oyameles es:  " + oyamel )
 cedro = (SuperficieBosque*20/100)
 println ("La superficie en metros que sera sembrada de Cedros es:  " + cedro )

 cantidadpino = pino*8/10
 println ("La cantidad de Pinos que se necesitan para sembrar el bosque son : " + cantidadpino)
 cantidadoyamel = oyamel*15/15
 println ("La cantidad de Oyameles que se necesitan para sembrar el bosque son: " + cantidadoyamel )
 cantidadcedro = cedro*10/18
 println ("La cantidad de Cedros que se necesitan para sembrar el bosque son: " + cantidadcedro)
}

else {
	println ("Valoresfuera de rango")
}