<!doctype html>
<html>
    <meta charset="utf-8">
    <title>Documento sin título</title>
    <head>
        <style>
            .resaltar{
                color: red;
                font-font-weight: bold;
            }
        </style>

    </head>
    <body>
        <?php
            $x = "Casa";
            $y = "CASA";

            $resultado = strcasecmp($x, $y);//Devuelve un verdadero (0) o falso (1) según el caso
            
            if(!$resultado){
                echo "Si coincide";
            }else{
                echo "No coincide";
            }
        ?>
    </body>
</html>