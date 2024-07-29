package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;
/* Aqui é um DTO (Data Transfer Object)
*/

public record DadosCadastroMedicos(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco ) {
}
