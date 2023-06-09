package APS2Teste;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteAPS2 {

    static WebDriver driver = null;
      
      private static String namePaginaPrincipal;  
      
    public TesteAPS2() {
    }
    
    @BeforeAll
   public static void setUp() {
         System.setProperty("webdriver.chrome.driver", 
	                "C:\\chromedriver_win32\\chromedriver.exe");
	        
         driver = new ChromeDriver();

        driver.get("C:\\Users\\fatec.senai\\Desktop\\APS2\\src\\main\\java\\APS2\\trabalho2-1.html");
    
        namePaginaPrincipal = driver.getWindowHandle();
    }
    @Test
    public void testTituloPagina(){
      driver.get("C:\\Users\\fatec.senai\\Desktop\\APS2\\src\\main\\java\\APS2\\trabalho2-1.html");
      String tituloExperado ="Trabalho 2-1"; 
        
      assertEquals(tituloExperado,driver.getTitle());
    }
    @Test
    public void testNomeValido(){
    driver.get("C:\\Users\\fatec.senai\\Desktop\\APS2\\src\\main\\java\\APS2\\trabalho2-1.html");        
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoIdade = driver.findElement(By.id("idade"));
         WebElement salvar = driver.findElement(By.id("botao_somar"));
         campoNome.sendKeys("Maria");
         campoEndereco.sendKeys("Assis Brasil");
         campoSexo.sendKeys("f");
         campoIdade.sendKeys("10");
         salvar.click();
          Alert alert = driver.switchTo().alert();
          assertTrue(alert.getText().equals("Cadastro realizado com sucesso"));
         alert.accept();
    }
    @Test
    public void testNomeInvalido(){
    driver.get("C:\\Users\\fatec.senai\\Desktop\\APS2\\src\\main\\java\\APS2\\trabalho2-1.html");        
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoIdade = driver.findElement(By.id("idade"));
         WebElement salvar = driver.findElement(By.id("botao_somar"));
         campoNome.sendKeys("");
         campoEndereco.sendKeys("Assis Brasil");
         campoSexo.sendKeys("f");
         campoIdade.sendKeys("10");
         salvar.click();
         String codigProximaPagina =  driver.getPageSource();
        assertTrue(codigProximaPagina.contains("Preencha o campo nome"));
    }
     @Test
    public void testEnderecoValido(){
   driver.get("C:\\Users\\fatec.senai\\Desktop\\APS2\\src\\main\\java\\APS2\\trabalho2-1.html");        
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoIdade = driver.findElement(By.id("idade"));
         WebElement salvar = driver.findElement(By.id("botao_somar"));
         campoNome.sendKeys("Maria");
         campoEndereco.sendKeys("Assis Brasil");
         campoSexo.sendKeys("f");
         campoIdade.sendKeys("10");
         salvar.click();
          Alert alert = driver.switchTo().alert();
          assertTrue(alert.getText().equals("Cadastro realizado com sucesso"));
         alert.accept();
    }
    @Test
    public void testEnderecoInvalido(){
    driver.get("C:\\Users\\fatec.senai\\Desktop\\APS2\\src\\main\\java\\APS2\\trabalho2-1.html");        
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoIdade = driver.findElement(By.id("idade"));
         WebElement salvar = driver.findElement(By.id("botao_somar"));
         campoNome.sendKeys("Maria");
         campoEndereco.sendKeys("");
         campoSexo.sendKeys("f");
         campoIdade.sendKeys("10");
         salvar.click();
         String codigProximaPagina =  driver.getPageSource();
        assertTrue(codigProximaPagina.contains("Preencha o campo endereco"));
    }
    @Test
    public void testSexoValido(){
   driver.get("C:\\Users\\fatec.senai\\Desktop\\APS2\\src\\main\\java\\APS2\\trabalho2-1.html");        
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoIdade = driver.findElement(By.id("idade"));
         WebElement salvar = driver.findElement(By.id("botao_somar"));
         campoNome.sendKeys("Maria");
         campoEndereco.sendKeys("Assis Brasil");
         campoSexo.sendKeys("f");
         campoIdade.sendKeys("10");
         salvar.click();
          Alert alert = driver.switchTo().alert();
          assertTrue(alert.getText().equals("Cadastro realizado com sucesso"));
         alert.accept();
    }
    @Test
    public void testSexoInvalido(){
    driver.get("C:\\Users\\fatec.senai\\Desktop\\APS2\\src\\main\\java\\APS2\\trabalho2-1.html");        
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoIdade = driver.findElement(By.id("idade"));
         WebElement salvar = driver.findElement(By.id("botao_somar"));
         campoNome.sendKeys("Maria");
         campoEndereco.sendKeys("Assis Brasil");
         campoSexo.sendKeys("");
         campoIdade.sendKeys("10");
         salvar.click();
         String codigProximaPagina =  driver.getPageSource();
        assertTrue(codigProximaPagina.contains("Selecione um valor para o campo sexo"));
    }
    @Test
    public void testIdadeValido(){
   driver.get("C:\\Users\\fatec.senai\\Desktop\\APS2\\src\\main\\java\\APS2\\trabalho2-1.html");        
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoIdade = driver.findElement(By.id("idade"));
         WebElement salvar = driver.findElement(By.id("botao_somar"));
         campoNome.sendKeys("Maria");
         campoEndereco.sendKeys("Assis Brasil");
         campoSexo.sendKeys("f");
         campoIdade.sendKeys("10");
         salvar.click();
          Alert alert = driver.switchTo().alert();
          assertTrue(alert.getText().equals("Cadastro realizado com sucesso"));
         alert.accept();
    }
    @Test
    public void testIdadeInvalidoEmBranco(){
    driver.get("C:\\Users\\fatec.senai\\Desktop\\APS2\\src\\main\\java\\APS2\\trabalho2-1.html");        
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoIdade = driver.findElement(By.id("idade"));
         WebElement salvar = driver.findElement(By.id("botao_somar"));
         campoNome.sendKeys("Maria");
         campoEndereco.sendKeys("Assis Brasil");
         campoSexo.sendKeys("f");
         campoIdade.sendKeys("");
         salvar.click();
         String codigProximaPagina =  driver.getPageSource();
        assertTrue(codigProximaPagina.contains("Preencha o campo idade, somente com numeros"));
    }
    @Test
    public void testIdadeInvalidoMenorQueZero(){
    driver.get("C:\\Users\\fatec.senai\\Desktop\\APS2\\src\\main\\java\\APS2\\trabalho2-1.html");        
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoEndereco = driver.findElement(By.id("endereco"));
        WebElement campoSexo = driver.findElement(By.id("sexo"));
        WebElement campoIdade = driver.findElement(By.id("idade"));
         WebElement salvar = driver.findElement(By.id("botao_somar"));
         campoNome.sendKeys("Maria");
         campoEndereco.sendKeys("Assis Brasil");
         campoSexo.sendKeys("f");
         campoIdade.sendKeys("-1");
         salvar.click();
         String codigProximaPagina =  driver.getPageSource();
        assertTrue(codigProximaPagina.contains("Preencha o campo idade com valores acima de 0"));
    }
    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
    
}
