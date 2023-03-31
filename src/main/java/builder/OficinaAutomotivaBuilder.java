package builder;

import java.util.Date;

public class OficinaAutomotivaBuilder {

    private OficinaAutomotiva oficinaAutomotiva;

    public OficinaAutomotivaBuilder() {
        oficinaAutomotiva = new OficinaAutomotiva();
    }

    public OficinaAutomotiva build() {
        if (oficinaAutomotiva.getMatricula() == 0) {
            throw new IllegalArgumentException("Matrícula inválida");
        }
        if (oficinaAutomotiva.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return oficinaAutomotiva;
    }

    public OficinaAutomotivaBuilder setMatricula(int matricula) {
        oficinaAutomotiva.setMatricula(matricula);
        return this;
    }

    public OficinaAutomotivaBuilder setNome(String nome) {
        oficinaAutomotiva.setNome(nome);
        return this;
    }

    public OficinaAutomotivaBuilder setDataFundacao(Date dataFundacao) {
        oficinaAutomotiva.setDataFundacao(dataFundacao);
        return this;
    }

    public OficinaAutomotivaBuilder setCnpj(String cnpj) {
        oficinaAutomotiva.setCnpj(cnpj);
        return this;
    }

    public OficinaAutomotivaBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        oficinaAutomotiva.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public OficinaAutomotivaBuilder setEnderecoNumero(int enderecoNumero) {
        oficinaAutomotiva.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public OficinaAutomotivaBuilder setEnderecoComplemento(String enderecoComplemento) {
        oficinaAutomotiva.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public OficinaAutomotivaBuilder setEnderecoBairro(String enderecoBairro) {
        oficinaAutomotiva.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public OficinaAutomotivaBuilder setEnderecoCidade(String enderecoCidade) {
        oficinaAutomotiva.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public OficinaAutomotivaBuilder setEnderecoUF(String enderecoUF) {
        oficinaAutomotiva.setEnderecoUF(enderecoUF);
        return this;
    }

    public OficinaAutomotivaBuilder setCep(String cep) {
        oficinaAutomotiva.setCep(cep);
        return this;
    }

    public OficinaAutomotivaBuilder setEmail(String email) {
        oficinaAutomotiva.setEmail(email);
        return this;
    }

    public OficinaAutomotivaBuilder setTelefone(String telefone) {
        oficinaAutomotiva.setTelefone(telefone);
        return this;
    }

}

