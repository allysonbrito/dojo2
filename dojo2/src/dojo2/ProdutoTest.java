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
	
	

}
