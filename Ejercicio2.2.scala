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