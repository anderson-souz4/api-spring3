package med.voll.api.medico;

import med.voll.api.endereco.DadosDeEndereco;
import med.voll.api.model.Endereco;

public record DadosAtualizacaoMedico(Long id, String nome, String telefone, DadosDeEndereco endereco) {
}
