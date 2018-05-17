console.log("Bienvenue dans ce jeu de devinette !");

var solution = Math.floor(Math.random() * 100) + 1;

console.log("(La solution est " + solution + ")");

console.log("Un nombre entre 0 et 100 a été sélectionné, à vous de le retrouver !");

var choice = 0;
var limit = 6;

while (choice != solution && limit > 0) {
	var choice = prompt("Entrez un nombre entre 1 et 100 :");
	var choiceNumber = parseInt(choice);
	if (choiceNumber) {
		if (choiceNumber < 1 || choiceNumber > 100) {
			console.log("Veuillez entrer un nombre compris entre 1 et 100 !");
		}
		else if (choiceNumber > solution) {
			limit--;
			console.log(choiceNumber + " est trop grand ! Il vous reste " + limit + " essais :)");
		}
		else if (choiceNumber < solution) {
			limit--;
			console.log(choiceNumber + " est trop petit ! Il vous reste " + limit + " essais :)");
		}
	}
	else {
		console.log("Veuillez entrer un nombre !");
	}
}

if (limit === 0) {
	console.log("Vous avez perdu la réponse était : " + solution + " !");
}
else {
	console.log("Bravo ! La réponse est bien " + solution + " ! Et il vous restait " + (limit-1) + " essais.");
}

