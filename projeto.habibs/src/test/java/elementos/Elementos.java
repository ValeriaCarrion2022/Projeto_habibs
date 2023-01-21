package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	
	public By btncookies= By.xpath ("//button[@id='acceptCookies']");
	public By btnperfil=By.xpath("//a[@title='Perfil']");
	public By btncadastro=By.xpath("//*[@id=\"modal-login\"]/div/div[2]/a");
	public By cep=By.xpath("//*[@id=\"box-search-cep\"]/form/input[1]");
	public By numero=By.xpath("//*[@id=\"box-search-cep\"]/form/input[2]");
	public By encontrarcep=By.xpath("//*[@id=\"box-search-cep\"]/form/div/a");
	public By btnsim=By.xpath("//a[@ title='Sim']");
	public By email=By.xpath("//input[@name='email-sign-up']");
	public By confirmarEmail=By.xpath("//input[@placeholder='Confirmação de E-mail']");
	public By senha=By.xpath("//input[@name='password-sign-up']");
    public By nomecompleto=By.xpath("//input[@placeholder='Nome completo']");
    public By cpf=By.xpath("//input[@placeholder='CPF / CNPJ']");
    public By telefone=By.xpath("//input[@placeholder='Telefone']");
    public By datanascimento=By.xpath("//input[@placeholder='Data Nascimento']");
    public By btncontinuar=By.xpath("//*[@id=\"modal-register\"]/div/div/div/form/div[4]/a");
    
    
    public By emaillogin=By.xpath("//input[@id='form-input-email-login']");
    public By senhalogin=By.xpath("//*[@id=\"modal-login\"]/div/div[1]/div/form/div[1]/input");
    public By continuar =By.xpath("//a[@class='btn-continue js-btn-login']");
    
    
    
}
