/* 
Activité 2
*/

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

function createBlock(i) {
    var linkBlock = document.createElement("p");

    linkBlock.id = "linkBlock" + i;
    linkBlock.className = "lien";
    document.getElementById("contenu").appendChild(linkBlock);
}

function destroyBlock(i) {
    var linkBlock = document.getElementById("linkBlock" + i);

    document.getElementById("contenu").removeChild(linkBlock);
}

function createUrl(i) {
    var linkUrl = document.createElement("a");

    linkUrl.href = listeLiens[i].url;
    linkUrl.textContent = listeLiens[i].titre;
    linkUrl.style.cssText = "text-decoration: none;color: #428bca;font-size: large;";
    document.getElementById("linkBlock" + i).appendChild(linkUrl);
}

function showUrl(i) {
    var linkTitle = document.createElement("span");

    linkTitle.textContent = " " + listeLiens[i].url;
    document.getElementById("linkBlock" + i).appendChild(linkTitle);
    document.getElementById("linkBlock" + i).appendChild(document.createElement("br"));
}

function createAuthor(i) {
    var linkAuthor = document.createElement("span");
    linkAuthor.textContent = "Ajouté par : " + listeLiens[i].auteur;

    document.getElementById("linkBlock" + i).appendChild(linkAuthor);
}

function showInputs() {
    var inputs = document.getElementById("addInputs");

    inputs.style.cssText = "display: block;";
}

function hideInputs() {
    var inputs = document.getElementById("addInputs");

    inputs.style.cssText = "display: none;";
}

function showLinks() {
    for (var i = 0; i < listeLiens.length; i++) {
        createBlock(i);
        createUrl(i);
        showUrl(i);
        createAuthor(i);
    }
}

function requiredInput(object, j) {
    if(object.checkValidity() == false) {
        object.style.cssText = "border-color: red;";
        j++;
    }
    else {
        object.style.cssText = "border-color: inherit;";
    }
    return j;
}

function getHttp(url) {
    var re = new RegExp("^(http|https)://", "i");
    var match = re.test(url);
    if (match == false) {
        url = "http://" + url;
    }
    return url;
}

function hideMessage() {
    var message = document.getElementById("validMessage");

    message.style.cssText = "display: none;";
}

function showMessage(titre) {
    var validBlock = document.getElementById("validMessage");
    validBlock.style.cssText = "color: blue;background-color: skyblue;padding: 10px;border-radius: 10px;";
    validBlock.textContent = 'Le lien "' + titre + '" a bien été ajouté !';
}

function showTime(titre) {
    showMessage(titre);
    setTimeout(function(){ hideMessage(); }, 2000);
}

function addLink() {
    var obj = {};
    var j = 0;
    var auteur = document.getElementById("auteur");
    var titre = document.getElementById("titre");
    var url = document.getElementById("url");

    j =+ requiredInput(auteur, j);
    j =+ requiredInput(titre, j);
    j =+ requiredInput(url, j);

    if (j == 0) {
        obj.auteur = auteur.value;
        obj.titre = titre.value;
        obj.url = getHttp(url.value);
        for (var i = 0; i < listeLiens.length; i++) {
            destroyBlock(i);
        }
        listeLiens.unshift(obj);
        showTime(titre.value);
        showLinks();
        hideInputs();
        auteur.value = "";
        titre.value = "";
        url.value = "";
    }
    else {
        alert("Certains champs n'ont pas été remplis correctement !");
    }
}

showLinks();
hideInputs();
hideMessage();

