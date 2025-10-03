package aula16.exercicio;

public class NotificacaoEmail implements Notificacao {

    @Override
    public void enviar(String destinatario, String mensagem){
        System.out.println("Enviando e-mail para " +
        destinatario + ": " + mensagem);
    }

    
}
