var kilos = 0.0
var TotalCliente = 0.0
var TotalTienda = 0.0


println ("¿Cual es el precio del kilo de naranja?")
var kilonaranja = readFloat ()

for (i <- 1 to 15) {

println ("¿Cuantos kilos de naranja compraste?")

kilos = readFloat ()

TotalCliente = kilonaranja * kilos


if (kilos > 10){
	TotalCliente = TotalCliente * 0.85
}

TotalTienda += TotalCliente

println ("Usted va a pagar: " + TotalCliente)

}
println ("La tienda ganara: " + TotalTienda)
