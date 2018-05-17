<?php

session_start();

include 'pdo.php';

$req = $bdd->prepare('INSERT INTO minichat (pseudo, message, m_date) VALUES(?, ?, NOW())');
$req->execute(array(
	securite_bdd($_POST['pseudo']), 
	securite_bdd($_POST['message'])
));

$_SESSION["pseudo"] = securite_bdd($_POST['pseudo']);

header('Location: minichat.php');
?>