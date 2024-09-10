package Principal

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Build
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejercicio_clase_10_09.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun pantalla1(){

    val context = LocalContext.current

    // Lista de opciones del menu
    val opciones = listOf("Negro", "Marron", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco")

    val opciones1 = listOf("Dorado", "Plateado", "Ninguno")

    //Estado para manejar la opcion seleccionada
    var opcionSeleccionada1 by remember { mutableStateOf(opciones[0]) }

    var opcionSeleccionada2 by remember { mutableStateOf(opciones[0]) }

    var opcionSeleccionada3 by remember { mutableStateOf(opciones[0]) }

    var opcionSeleccionada4 by remember { mutableStateOf(opciones1[0]) }

    // Estado para manejar la visibilidad del menu desplegable
    var expanded by remember { mutableStateOf(false) }
    var expanded1 by remember { mutableStateOf(false) }
    var expanded2 by remember { mutableStateOf(false) }
    var expanded3 by remember { mutableStateOf(false) }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp)
            .background(Color.DarkGray),

    ) {
        item {
            Text(
                text = "CALCULADORA DE RESISTENCIAS",
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 5.dp),
                color = Color.White,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center

            )

            Spacer(modifier = Modifier.height(10.dp))

            Image(
                modifier = Modifier
                    .fillMaxWidth(),
                painter = painterResource(id = R.drawable.resistencia1),
                contentDescription = "Imagen"
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "PRIMERA BANDA",
                modifier = Modifier.fillMaxSize(),
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            ExposedDropdownMenuBox(
                expanded = expanded,
                onExpandedChange = {expanded = !expanded},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)

            ) {
                TextField(
                    value = opcionSeleccionada1,
                    onValueChange = {},
                    readOnly = true,
                    label = {Text("Seleccione opción")},
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)
                    },
                    modifier = Modifier
                        .menuAnchor()
                        .fillMaxWidth()
                )

                ExposedDropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {
                    opciones.forEach { option ->
                        DropdownMenuItem(
                            text = { Text(option) },
                            onClick = {
                                opcionSeleccionada1 = option
                                expanded = false
                            })
                    }
                }
            }

            Text(
                text = "SEGUNDA BANDA",
                modifier = Modifier.fillMaxSize(),
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            ExposedDropdownMenuBox(
                expanded = expanded1,
                onExpandedChange = {expanded1 = !expanded1},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)

            ) {
                TextField(
                    value = opcionSeleccionada2,
                    onValueChange = {},
                    readOnly = true,
                    label = {Text("Seleccione opción")},
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)
                    },
                    modifier = Modifier
                        .menuAnchor()
                        .fillMaxWidth()
                )

                ExposedDropdownMenu(
                    expanded = expanded1,
                    onDismissRequest = { expanded1 = false }
                ) {
                    opciones.forEach { option ->
                        DropdownMenuItem(
                            text = { Text(option) },
                            onClick = {
                                opcionSeleccionada2 = option
                                expanded1 = false
                            })
                    }
                }
            }

            Text(
                text = "TERCERA BANDA",
                modifier = Modifier.fillMaxSize(),
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            ExposedDropdownMenuBox(
                expanded = expanded2,
                onExpandedChange = {expanded2 = !expanded2},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)

            ) {
                TextField(
                    value = opcionSeleccionada3,
                    onValueChange = {},
                    readOnly = true,
                    label = {Text("Seleccione opción")},
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)
                    },
                    modifier = Modifier
                        .menuAnchor()
                        .fillMaxWidth()
                )

                ExposedDropdownMenu(
                    expanded = expanded2,
                    onDismissRequest = { expanded2 = false }
                ) {
                    opciones.forEach { option ->
                        DropdownMenuItem(
                            text = { Text(option) },
                            onClick = {
                                opcionSeleccionada3 = option
                                expanded2 = false
                            })
                    }
                }
            }

            Text(
                text = "CUARTA BANDA (TOLERANCIA)",
                modifier = Modifier.fillMaxSize(),
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            ExposedDropdownMenuBox(
                expanded = expanded3,
                onExpandedChange = {expanded3 = !expanded3},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)

            ) {
                TextField(
                    value = opcionSeleccionada4,
                    onValueChange = {},
                    readOnly = true,
                    label = {Text("Seleccione opción")},
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)
                    },
                    modifier = Modifier
                        .menuAnchor()
                        .fillMaxWidth()
                )


                ExposedDropdownMenu(
                    expanded = expanded3,
                    onDismissRequest = { expanded3 = false }
                ) {
                    opciones1.forEach { option ->
                        DropdownMenuItem(
                            text = { Text(option) },
                            onClick = {
                                opcionSeleccionada4 = option
                                expanded3 = false
                            })
                    }
                }
            }

            Button(
                border = BorderStroke(2.dp, Color.Black),

                onClick = {

                    var objeto = Operaciones(opcionSeleccionada1, opcionSeleccionada2, opcionSeleccionada3, opcionSeleccionada4)
                    var resultado = objeto.calculo()
                    Toast.makeText(context, "$resultado", Toast.LENGTH_SHORT).show()

                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                ),
                modifier = Modifier.fillMaxWidth(),

                ) {

                Text(
                    text = "Calcular",
                    fontSize = 20.sp
                )

                Icon(
                    imageVector = Icons.Default.Build,
                    contentDescription = "Add",
                    modifier = Modifier.size(30.dp)
                )

            }
        }
    }
}
