var NombreProducto= new Array[String](60)
var Precio= new Array[Float](60)
var Codigos= new Array[String](60)
var opcion = 3
var i=0
 Catalogo()
def Catalogo(){
	do{
		MenuPrincipal()
		opcion= readInt()
		opcion match 
                        {
			case 1 => AnexarProductos()
			case 2 => println("Aun no esta listo el programa")
			case default =>println("Hasta Pronto")
		}
		} while (opcion!=3)
        }
        def MenuPrincipal(){
        	println("1) Anexar Productos ")
        	println("2) Nota ")
        	println("3) Salir ")
        	
        }
        def AgregarProductos() {
        	var continuar='N'
        	do{
        		i+=1
        		DatosProducto()
        		CatalogoProductos()
        		println("Quieres agregar otro producto al catalogo (S/N")
        			Continuar=readChar()
        } while (continuar== 'S')
        	
        }
        def capturarDatosProducto() {
        	println("Capturar datos del producto")
        	println("Nombre")
        	nombre(i)=readLine()
        	println("precio")
            precio(i)=readFloat()
            println("codigo de barras")
            codigos(i)=readLine()


        	
        }
        def mostrarCatalogoProductos()  {
        	println("Nombre |  Precio  | Codigo ")
        	for( j <- 1 to i) {
        		println(nombre(j) + " | " + precio(j) + " | " + codigos(j))
        		
        	}

        	
        }


