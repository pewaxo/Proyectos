
<?php
    if(isset($_POST["button"])){
        
        $numero1 = $_POST["num1"];
        $numero2 = $_POST["num2"];
        $operacion = $_POST["operacion"];
        calcular();
    }

    function calcular(){
        if(!strcmp("Suma", $operacion)){
            echo "El resultado es: " . ($numero1 + $numero2);
        }

        if(!strcmp("Resta", $operacion)){
            echo "El resultado es: " . ($numero1 - $numero2);
        }

        if(!strcmp("Multiplicación", $operacion)){
            echo "El resultado es: " . ($numero1 * $numero2);
        }

        if(!strcmp("Divisón", $operacion)){
            echo "El resultado es: " . ($numero1 / $numero2);
        }

        if(!strcmp("Módulo", $operacion)){
            echo "El resultado es: " . ($numero1 % $numero2);
        }
    }
    
    
?>