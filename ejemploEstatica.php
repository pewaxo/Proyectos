<!doctype html>
<html>
    <meta charset="utf-8">
    <title>Documento sin título</title>
    <head>

    </head>
    <body>
        <?php
            function incrementaVariable(){
                static $contador = 0;
                $contador ++;

                echo $contador . "<br>";
            }

            incrementaVariable();
            incrementaVariable();

            incrementaVariable();
            incrementaVariable();
        ?>
    </body>
</html>