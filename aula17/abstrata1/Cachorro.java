package aula17.abstrata1;

public class Cachorro extends Animal {
    
    // Chama o contrutor da super classe (classe mãe)
    public Cachorro(String nome){
        super(nome);
    }

    // Implementação obrigatoria do método abstrato
    @Override
    public void emitirSom(){
        System.out.println(getNome() + " está latindo: AuAuAu!");
    }
    
}
