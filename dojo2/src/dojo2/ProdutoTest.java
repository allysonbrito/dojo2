package dojo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProdutoTest {

	@Test
    public void TesteAddProduto() {
    
	
    Produto prd = new Produto("Arroz",20,10);
   
    assertEquals("Arroz",prd.getName());
    assertEquals(10,prd.getPreco(),0.00001);
    assertEquals(20,prd.getQuant());

    }
	
	@Test
    public void TesteRemoverProduto() {
    
	Loja loja = new Loja();
    Produto prd = new Produto("Arroz",20,10);
    
    loja.addProduto(prd);
    loja.RemoveProduto("Arroz");
    
    assertEquals(false,loja.Busca("Arroz"));
    
	}
	
    @Test
    public void TesteListarProdutos() {
    
	Loja loja = new Loja();
    Produto prd1 = new Produto("Arroz",20,10);
    Produto prd2 = new Produto("Feijão",5,15);
    Produto prd3 = new Produto("Macarrão",4,10);
    
    loja.addProduto(prd1);
    loja.addProduto(prd2);
    loja.addProduto(prd3);
    
    
    assertEquals(3,loja.Quantidade());

    }

	
	@Test
    public void TesteBuscarProduto() {
    
	Loja loja = new Loja();
    Produto prd = new Produto("Arroz",20,10);
    
    loja.addProduto(prd);
    
    assertEquals(true,loja.Busca("Arroz"));
//    assert.AssertTrue(loja.Busca("Arroz"));
//    
//    assert.assertTrue(loja.Busca("Arroz"));
   // assert.
	}

	
//	@Test(expected = IllegalArgumentException.class)
//	public void TesteExcecaoProduto() {
//	
//		Loja loja = new Loja();
//	    Produto prd1 = new Produto("Arroz",0,10);
//	    
//	    loja.addProduto(prd1);
//	    
//		
//	}



}
