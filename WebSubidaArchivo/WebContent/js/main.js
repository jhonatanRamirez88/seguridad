/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

window.addEventListener('load', function(){
    document.getElementById('botoninicio').addEventListener('click', function(){
    var username=document.getElementById('username').value;
    var pass=document.getElementById('pass').value;
    var bandera=false;
    if(username.length>0 && pass.length>0){
        bandera=true;
    }
    if(bandera){
        document.getElementById('formincio').submit();
    }else{
        alert('Ingresa Todos los Campos');
    } 
    });
});


