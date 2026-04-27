<table width='99%'>
<tr>
<td bgcolor='#FF6600'>

## **<font color="#FFFFFF">Hola Mundo</font>**

</td>
</tr>
</table>


La función DAX **CALCULATE** es una de las funciones más potentes en Power BI, utilizada para modificar el contexto de evaluación en el que se evalúan las expresiones.


<table border=1 width='99%'>
<td bgcolor='#4a235a'>

# **<font color="#FFFFFF">El operador o Lógico: ||</font>**

</td>
</tr>
</table>



```
Cantidad de productos vendidos de color rojo, azul y negro 2 =
CALCULATE
(
    [Total de Unidades Vendidas],
    DimProduct[ColorName] = "Red" || DimProduct[ColorName] = "Azul"  || DimProduct[ColorName] = "blue" || DimProduct[ColorName] = "Negro"
)
```
**negrita**
*itálica*
`código`

<font color="red">Texto rojo</font>

<span style="color:red; font-size:20px;">Texto personalizado</span>

<table>
<tr>
<td style="background-color:#4a235a; color:white;">
Título
</td>
</tr>
</table>

<font color="#FFFFFF">

<span style="color:#FFFFFF; font-weight:bold;">
    
>* Tabla: La tabla que deseas filtrar.
>* **<Condición>**: Una expresión que devuelve un valor booleano (TRUE o FALSE) que determinará si una fila se incluirá en el resultado.
                                                                
