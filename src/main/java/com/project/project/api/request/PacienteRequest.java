package com.project.project.api.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PacienteRequest {

        @NotBlank(message = "Nome do paciente é obrigatório")
        private String nome;

        @NotBlank(message = "Sobrenome do paciente é obrigatório")
        private String sobrenome;

        private String email;

        @NotBlank(message = "CPF do paciente é obrigatório")
        private String cpf;

}
