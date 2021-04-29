$(function(){
        $("#title-header").typed({
          strings: ["Transformamos personas para cambiar organizaciones."],
          typeSpeed: 50,//Velocidad
          backDelay: 3000,//espera 
          //backSpeed: 1000,//Velocidad de regreso
          loop: true,
          loopCount: false,
          cursorChar: '|',
          callback: function(){ foo(); }
        });
        function foo(){}
});