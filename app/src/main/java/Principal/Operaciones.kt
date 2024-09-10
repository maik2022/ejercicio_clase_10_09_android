package Principal


class Operaciones(var banda1:String, var banda2:String, var banda3:String, var banda4:String ) {

    fun calculo():String{
        var resultado:Int = 0
        var calculo:Int = 0

        var valor1:Int = 0
        var valor2:Int = 0
        var valor3:Int = 0
        var valor4:Int = 0
        var lista = mutableListOf<String>()
        var lista2 = mutableListOf<Int>()

        lista.add(banda1)
        lista.add(banda2)
        lista.add(banda3)
        lista.add(banda4)

        lista.forEach {opcion ->

            when(opcion){
                "Negro"->{
                    lista2.add(0)
                }

                "Marron"->{
                    lista2.add(1)
                }

                "Rojo"->{
                    lista2.add(2)
                }

                "Naranja"->{
                    lista2.add(3)
                }

                "Amarillo"->{
                    lista2.add(4)
                }

                "Verde"->{
                    lista2.add(5)
                }

                "Azul"->{
                    lista2.add(6)
                }

                "Violeta"->{
                    lista2.add(7)
                }

                "Gris"->{
                    lista2.add(8)
                }

                "Blanco"->{
                    lista2.add(9)
                }

                "Dorado"->{
                    lista2.add(5)
                }

                "Plateado"->{
                    lista2.add(10)
                }

                "Ninguno"->{
                    lista2.add(20)
                }
            }

        }

        val valores: Pair<Int, Int> = Pair(lista2[0], lista2[1])
        val concatenado = "${valores.first}${valores.second}".toInt()

        when(lista2[2]){
            0-> {
                calculo = concatenado*1
                resultado = calculo
            }

            1-> {
                calculo = concatenado*10
                resultado = calculo
            }

            2->{
                calculo = concatenado*100
                resultado = calculo
            }

            3->{
                calculo = concatenado*1000
                resultado = calculo
            }

            4->{
                calculo = concatenado*10000
                resultado = calculo
            }

            5->{
                calculo = concatenado*100000
                resultado = calculo
            }

            6->{
                calculo = concatenado*1000000
                resultado = calculo
            }

            7->{
                calculo = concatenado*10000000
                resultado = calculo
            }

            8->{

                calculo = concatenado*100000000
                resultado = 0 //Porque se desborda

            }

            9->{

                calculo = concatenado*1000000000
                resultado = 0 //Porque se desborda


            }
        }

        return "El resultado es $resultado +/- ${lista2[3]} Ohms"
    }
}