import com.petland.domain.cadastro.Cadastro;
import com.petland.domain.cadastro.Endereco;
import com.petland.domain.cadastro.Perfil;

public class Main {
    public static void main(String[] args) throws Exception {
        Cadastro cadastro = new Cadastro();

        cadastro.setId(1);
        cadastro.setNome("José da Silva");

        Perfil perfil = new Perfil();
        perfil.setCliente(true);

        cadastro.setPerfil(perfil);

        Endereco endereco = new Endereco();
        endereco.setLougadouro("Rua 1");
        endereco.setNumero("123");

        cadastro.setEndereco(endereco);

        System.out.println("Cadastro criado, Nome: " + cadastro.getNome());
        System.out.println("Endereco: " + cadastro.getEndereco().getLougadouro() + ", "
                + cadastro.getEndereco().getNumero());

        
    }
}
