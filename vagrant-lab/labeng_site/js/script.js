let cliques = 0;

function naoClique() {
  if (cliques == 0) {
    alert("Falei para não clicar... 😛");
    alert("Agora você receberá 250 alertas motivacionais...");
    alert("...Mentira 😁 mas não clique novamente.... ou clique...... 🧐");
  } else if (cliques == 1) {
    alert("Mas que teimosia...");
    alert("A próxima vez serão 1000 alertas... 😎");
  } else {
    alert("Eu avisei....");
    for (i = 1; i <= 5; i++) {
      alert("Alerta " + i + "...");
    }
    alert("Brincaderinha.. acabou... ⛔️");
    alert("Ou não......? 🤔");
    window.location.href = "meme.html";
  }
  cliques++;
}
