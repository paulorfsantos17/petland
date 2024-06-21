import java.time.LocalTime;
import java.util.Date;

import com.petland.domain.atendimento.Atendimento;
import com.petland.domain.atendimento.AtendimentoStatus;
import com.petland.domain.atendimento.AtendimentoTipo;
import com.petland.domain.cadastro.Animal;
import com.petland.domain.cadastro.Cadastro;
import com.petland.domain.cadastro.Endereco;
import com.petland.domain.cadastro.Especie;
import com.petland.domain.cadastro.Perfil;
import com.petland.domain.cadastro.ProdutoServico;

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

        Animal animal = new Animal();

        animal.setId(1);
        animal.setNome("Rex");
        animal.setAniversario(new Date());
        animal.setEspecie(Especie.CACHORRO);

        ProdutoServico servico = new ProdutoServico();

        servico.setId(1);
        servico.setNome("Tosa");
        servico.setValor(100.0);
        servico.setServico(true);

        Atendimento atendimento = new Atendimento();
        atendimento.setId(1);
        atendimento.setData(new Date());
        atendimento.setHora(LocalTime.now());
        atendimento.setEmergencia(false);
        atendimento.setDescription(servico.getNome());
        atendimento.setValor(servico.getValor());
        atendimento.setStatus(AtendimentoStatus.REALIZANDO);
        atendimento.setTipo(AtendimentoTipo.HIGIENIZACAO);
        atendimento.setServico(servico);
        atendimento.setPaciente(animal);
        atendimento.setSolictante(cadastro);

        System.out.println(atendimento);

    }
}
