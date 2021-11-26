package main;

import proxyMethod.Desenhos;
import proxyMethod.ImagemProxy;

public class Main {
	
	public static void main(String[] args) {
		
		Desenhos desenhos = new ImagemProxy("MIRANHA");
		
		desenhos.desenha();
		System.out.println();
		
		desenhos.desenha();
		System.out.println();
		
	}

}
