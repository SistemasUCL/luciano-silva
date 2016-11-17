$(function() {
  return populaCarrinho();
});
 
window.populaCarrinho = function() {
	return $.get("/carrinho", function(data) {
		var k, results, textoCarrinho, textos, v;
		textos = [];
		results = [];
		for (k in data) {
			v = data[k];
			textos.push('Produto:[' + v['nome'] + ', Quantidade: ' + v['quantidade'] + ']');
			textoCarrinho = textos.join(',');
			results.push($("#carrinho").text(textoCarrinho));
		}
		return results; 
	});
}; 

window.addToCarrinho = function(id) {
	  var json;
	  json = void 0;
	  json = void 0;
	  json = JSON.stringify({
	    'idProduto': id
	  });
	  return $.ajax('/carrinho', {
	    type: 'POST',
	    data: json,
	    contentType: 'application/json',
	    dataType: 'json',
	    success: function(result) {
	      console.log('Adicionado!');
	      return window.populaCarrinho();
	    },
	    error: function() {
	      return alert('Erro!');
	    }
	  });
	};
