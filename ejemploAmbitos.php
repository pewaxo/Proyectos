<!doctype html>
<html>
    <meta charset="utf-8">
    <title>Documento sin título</title>
    <head>

    </head>
    <body>
        <?php
            $nombre = "Juan";

            function getDatos(){
                $nombre = "María";
            }

            getDatos();

            echo $nombre;
        ?>
    </body>
</html>