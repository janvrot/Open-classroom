var Contact = {
	create: function (prenom, nom) {
		this.nom = nom;
		this.prenom = prenom;
	},
	identity : function () {
		var oneContact = this.prenom + " " + this.nom;
		return oneContact;
	}
};

var contact1 = Object.create(Contact);
contact1.create("Carole", "Lévisse");

var contact2 = Object.create(Contact);
contact2.create("Mélodie", "Nelsonne");

var contacts = [];

contacts.push(contact1);
contacts.push(contact2);

var choice = 0;
var contactList = "";
var nom = "";
var prenom = "";
var contact3;


alert("Bienvenue dans cette activité de gestion de contact !");
console.log("Bienvenue dans cette activité de gestion de contact !");

while (choice != 3) {
	choice = prompt('Choisissez une option :\n1 pour afficher tous les contacts\n2 pour ajouter un contact\n3 pour quitter');
	if (choice == 1) {
		contactList = "";
		contacts.forEach(function (contact) {
			contactList = contactList + contact.identity() + "\n";
		});
		alert("Liste des contacts :\n\n" + contactList);
		console.log("Liste des contacts :\n\n" + contactList);
	}
	else if (choice == 2) {
		prenom = prompt('Ajoutez un prénom :');
		nom = prompt('Ajoutez un nom :');
		contact3 = Object.create(Contact);
		contact3.create(prenom, nom);
		contacts.push(contact3);
		alert("Contact ajouté : " + prenom + " " + nom);
		console.log("Contact ajouté : " + prenom + " " + nom);
	}
	else if (choice == 3) {
		alert("Vous avez quitté le programme, rechargez la page pour le redémarrer !");
		console.log("Vous avez quitté le programme, rechargez la page pour le redémarrer !");
	}
	else {
		alert("Cette option n'est pas reconnue :(");
		console.log("Cette option n'est pas reconnue :(");
	}
}