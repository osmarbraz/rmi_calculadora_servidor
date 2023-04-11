
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Programa servidor do objeto calculadora.
 * 
 * Instancia o objeto e registra no binder.
 * 
 * @author osmar
 */
public class Principal {

    public static void main(String args[]) {
        try {
            // Este é o nome pelo qual o serviço será posteriormente localizado
            String nomeServico = "calculadora"; 
            //Cria o objeto a ser servido
            Calculadora calculadora = new CalculadoraImpl(); 
            //Cria o stub dinamicamente do objeto a ser servido
            Calculadora stub = (Calculadora) UnicastRemoteObject.exportObject(calculadora, 0);
            //Referência para rmiregistry na porta 1099
            Registry registro = LocateRegistry.getRegistry(); 
            //Registra o objeto no rmiregistry
            registro.bind(nomeServico, calculadora);             
            System.out.println("Servidor no ar. Nome do objeto no servidor: \'" + nomeServico + "\'");
        } catch (Exception ex) {            
            System.out.println("Excecao: " + ex.getMessage());
        }
    }
}
