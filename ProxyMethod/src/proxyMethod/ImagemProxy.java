package proxyMethod;

public class ImagemProxy implements Desenhos {

	private Imagem minhaImagem;
	private String nomeArquivo = "MIRANHA";
	
	public ImagemProxy(String nomeArquivo){
		this.nomeArquivo = nomeArquivo;
	}
	
	@Override
	public void desenha() {
		if(minhaImagem == null) {
			System.out.println("\nImagem inexistente... Criando Imagem...\n");
			minhaImagem = new Imagem(nomeArquivo);
		}else{
			System.out.println("\nRecuperando Imagem " + nomeArquivo + " criada anteriormente...\n");
		}
		
		minhaImagem.desenha();
	}


}
