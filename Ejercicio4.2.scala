var Edad1=0
var Edad2=0
var Edad3=0


//println ("Clasificacion de animales en un zoologico")


println  ("Elige el numero de los animales que deseas clasificar:  ")

println ("1.Elefantes")
println ("2.Jirafas") 
println ("3.Chimpances")

println ("Elige el numero del animal que deseas analizar:  ")
val NumeroAnimal=readInt ()

NumeroAnimal match {

	case 1 =>{
		for (i <- 1 to 20){
		println ("Ingresa la edad de los Elefantes a Clasificar:   ")
   var Elefantes = readInt ()	
    if ( Elefantes <= 1){
    	Edad1+=1 }
    	
    if (Elefantes > 1 && Elefantes <3){
       Edad2 +=1 }
    if (Elefantes >= 3){
        Edad3+=1 }
    }
    println ("El numero de Elefantes menores o igual a 1 año son:  "  + Edad1)
    println ("El numero de Elefantes mayores de un año y menores de 3 son: " + Edad2)
    println ("El numero de Elefantes mayores a 3 años son:  "  + Edad3)
}

case 2 =>{
        for (i <- 1 to 15){
        println ("Ingresa la edad de las Jirafas a clasificar:   ")
   var Jirafas = readInt ()   
    if ( Jirafas <= 1){
        Edad1+=1 }
        //println ("Los elefantes menores o igual a un año: " + Edad1)}
    if (Jirafas > 1 && Jirafas <3){
       Edad2 +=1 }
    if (Jirafas >= 3){
        Edad3+=1 }
    }
    println ("El numero de Jirafas menores o igual a 1 año son:  "  + Edad1)
    println ("El numero de Jirafas mayores de un año y menores de 3 son: " + Edad2)
    println ("El numero de Jirafas mayores a 3 años son:  "  + Edad3)
}

case 3 =>{
        for (i <- 1 to 40){
        println ("Ingresa la edad de los Chimpances a clasificar:   ")
   var Chimpances = readInt ()   
    if ( Chimpances <= 1){
        Edad1+=1 }
        //println ("Los elefantes menores o igual a un año: " + Edad1)}
    if (Chimpances > 1 && Chimpances <3){
       Edad2 +=1 }
    if (Chimpances >= 3){
        Edad3+=1 }
    }
    println ("El numero de Chimpances menores o igual a 1 año son:  "  + Edad1)
    println ("El numero de Chimpances mayores de un año y menores de 3 son: " + Edad2)
    println ("El numero de Chimpances mayores a 3 años son:  "  + Edad3)
}


//println ("   ")

//if (NumeroAnimal=1){
	//for (i <- 1 to 20){
	//println ("Ingresa la edad de los Elefantes a estudiar:   ")
    //Elefantes = readFloat ()


	}

