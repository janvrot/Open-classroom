<?php
try
{
	$bdd = new PDO('mysql:host=localhost;dbname=minichat;charset=utf8', 'root', 'root');
}
catch(Exception $e)
{
	die('Erreur : '.$e->getMessage());
}

function securite_bdd($string) {
	if(ctype_digit($string))
	{
		$string = intval($string);
	}
	else
	{
		$string = addcslashes($string, '%_');
	}
	return $string;
}
?>