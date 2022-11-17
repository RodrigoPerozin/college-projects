// NOTE: consVEE() - consultar valor em estoque.
// NOTE: consQEE() - consultar quantidade em estoque.
// NOTE: consVEQEE() - consultar valor e quantidade em estoque.

// NOTE: resetar() - limpa os campos.
// NOTE: enviar() - adiciona a variavel quantidade o valor de dentro do campo 'quantidade'.
// NOTE:  enviar() - adiciona a variavel valorT o valor de dentro do campo 'valor unitário'.

// NOTE: zerarValores() - zera todos os valores das variáveis.

function resetar(){
  document.getElementById('qntdE').value = "";
  document.getElementById('valorU').value = "";
}

var valorT = 0;
var qntdEE = 0;

function zerarValores(){

  valorT = 0;
  qntdEE = 0;

}

function enviar(){
  if (document.getElementById('qntdE').value == "") {
    alert('Preencha o campo Quantidade corretamente!\n \nObs: Não deixe o campo vazio!');
    document.getElementById('qntdE').focus()
  }else if (document.getElementById('qntdE').value.includes('.')) {
    alert('Preencha o campo Quantidade corretamente!\n \nObs: Não use "." !');
    document.getElementById('qntdE').focus()
  }else if (document.getElementById('qntdE').value.includes(',')) {
    alert('Preencha o campo Quantidade corretamente!\n \nObs: Não use "," !');
    document.getElementById('qntdE').focus()
  }else if (document.getElementById('qntdE').value<1) {
    alert('Preencha o campo Quantidade corretamente!\n \nObs: Não coloque valores negativos ou 0!');
    document.getElementById('qntdE').focus()
  }else if (document.getElementById('valorU').value == "") {
    alert('Preencha o campo Valor unitário corretamente!\n \nObs: Não deixe o campo vazio!');
    document.getElementById('valorU').focus()
  }else if (document.getElementById('valorU').value.includes(',')) {
    alert('Preencha o campo Valor unitário corretamente!\n \nObs: Não use "," !');
    document.getElementById('valorU').focus()
  }else if (document.getElementById('valorU').value<=0) {
    alert('Preencha o campo Valor unitário corretamente!\n \nNão coloque valores negativos ou 0!');
    document.getElementById('valorU').focus()
  }else if(document.getElementById('valorU').value.length>4){
    alert("Nós trabalhamos com até 2 casas depois do ' . ' , não mais!")
  }else{
    qntdEE += parseInt(document.getElementById('qntdE').value);
    valorT += parseFloat(document.getElementById('valorU').value);
    document.getElementById('qntdE').value = "";
    document.getElementById('valorU').value = "";

  }
}

function consVEE(){
  if (valorT == 0) {
    alert("Ainda não há valor no estoque!");
  }else {
    alert("Valor em estoque: " + valorT);
  }
}

function consQEE(){
  if (qntdEE == 0) {
    alert("Ainda não há matrioskas no estoque!");
  }else {
    alert("Quantidade de matrioskas em estoque: " + qntdEE);
  }
}

function consVEQEE(){
  if (qntdEE==0 && valorT==0){
    alert("Não há nenhum valor em estoque, e em nenhuma matrioska em estoque!");
  }else if(qntdEE == 0) {
    alert("Ainda não há matrioskas no estoque!");
  }else if (valorT == 0) {
    alert("Ainda não há valor no estoque!");
  }else{
    alert("Valor em estoque: " + valorT + "\n \nQuantidade de matrioskas em estoque: " + qntdEE)
  }
}
