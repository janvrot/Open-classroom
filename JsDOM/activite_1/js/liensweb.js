/* 
Activité 1
*/

// Liste des liens Web à afficher. Un lien est défini par :
// - son titre
// - son URL
// - son auteur (la personne qui l'a publié)
var listeLiens = [
    {
        titre: "So Foot",
        url: "http://sofoot.com",
        auteur: "yann.usaille"
    },
    {
        titre: "Guide d'autodéfense numérique",
        url: "http://guide.boum.org",
        auteur: "paulochon"
    },
    {
        titre: "L'encyclopédie en ligne Wikipedia",
        url: "http://Wikipedia.org",
        auteur: "annie.zette"
    }
];

function createBlock() {
    var linkBlock = document.createElement("p");
    linkBlock.id = "linkBlock" + i;
    linkBlock.className = "lien";
    document.getElementById("contenu").appendChild(linkBlock);
}

function createUrl() {
    var linkUrl = document.createElement("a");
    linkUrl.href = listeLiens[i].url;
    linkUrl.textContent = listeLiens[i].titre;
    linkUrl.style.cssText = "text-decoration: none;color: #428bca;font-size: large;";
    document.getElementById("linkBlock" + i).appendChild(linkUrl);
}

function showUrl() {
    var linkTitle = document.createElement("span");
    linkTitle.textContent = " " + listeLiens[i].url;
    document.getElementById("linkBlock" + i).appendChild(linkTitle);
    document.getElementById("linkBlock" + i).appendChild(document.createElement("br"));
}

function createAuthor() {
    var linkAuthor = document.createElement("span");
    linkAuthor.textContent = "Ajouté par : " + listeLiens[i].auteur;
    document.getElementById("linkBlock" + i).appendChild(linkAuthor);
}

for (var i = 0; i < listeLiens.length; i++) {
    createBlock();
    createUrl();
    showUrl();
    createAuthor();
}

