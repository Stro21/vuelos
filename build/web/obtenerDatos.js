
'use strict';

function obtener( )
{
  var fecha = document.getElementById("fecha").value;
  var cliente = document.getElementById("cliente").value;
  var origen = document.getElementById("origen").value;
  var destino = document.getElementById("destino").value;
  
  
  pasarParametros( fecha, cliente, origen, destino );
  
  //alert(fecha);
  //alert(cliente);
  //alert(origen);
  //alert(destino);
}


function pasarParametros (fecha, cliente, origen, destino )
{
     $.ajax({
      url: "http://localhost:8080/vuelos/con/vuelo?fecha="+fecha+"&tipo_cliente="+cliente+"&origen="+origen+"&destino="+destino,
      type: 'GET',
      
      success : function(json) {
          //console.log('El usuario se logeo correctamente');
         alert('datos correctos : '+ json);
      },
      error : function(xhr, status) {
          alert('Error al acceder al servicio');
      }

    });
    
}


