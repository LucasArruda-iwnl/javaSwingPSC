

public class CarroAcesso {
    public static void main(String[] args) {
        Carro uno = new Carro("Uno"); 
        uno.setCor("vermelho"); 
        uno.setMarca("fiat"); 

        Carro renegade = new Carro("Renagede", "Jeep", "Prata"); 

        System.out.println("Modelo:" + uno.getModelo());
        System.out.println("Cor:" + renegade.getCor());
    }
    
}
