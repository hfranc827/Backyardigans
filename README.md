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
