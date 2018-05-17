<?php

session_start();
include 'pdo.php';

?>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>Mini-chat</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>

<body>

    <h1>Mini-chat</h1>

    <form action="minichat_post.php" method="post">
        <p>
            <label for="pseudo">Pseudo</label> : <input type="text" name="pseudo" id="pseudo" value="<?php echo $_SESSION["pseudo"]; ?>" /><br><br>
            <label for="message">Message</label> :  <input type="text" name="message" id="message" /><br><br>

            <input type="submit" value="Envoyer" />
        </p>
    </form>

    <?php

    $reponse = $bdd->query('SELECT pseudo, message, m_date FROM minichat ORDER BY ID DESC LIMIT 0, 10');

    while ($donnees = $reponse->fetch())
    {
        $date = $donnees['m_date'];
        $result = date("d/m/Y", strtotime($date));
        echo '<p class="show"><strong>' . htmlentities($donnees['pseudo']) . '</strong> : ' . htmlentities($donnees['message']) . ' ' . htmlentities($result) . '</p><br>';
    }

    $reponse->closeCursor();

    ?>
</body>
</html>