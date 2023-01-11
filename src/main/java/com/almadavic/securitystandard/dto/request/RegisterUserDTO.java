package com.almadavic.securitystandard.dto.request;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor //Usado na parte de TESTES -> Para instanciar um DTO!
@Getter
// A classe não precisa de setter nem construtor personalisado, pois o spring já injeta os dados do Json. Foi criada essa linha por causa dos testes.
public class RegisterUserDTO { // DTO que representa o cadastro do usuário no sistema

    @NotBlank // --> Campo obrigatorio!
    private String nickname; // apelido , username para ser cadastrado

    @NotBlank // --> Campo obrigatorio!
    @Email // --> Validação se está em formato de e-mail
    private String email; // email do usuario

    @NotBlank // --> Campo obrigatorio!
    @Size(min = 6, max = 18) // --> Validação do tamanho da senha
    private String password; // nova senha para ser cadastrada

    @NotBlank // --> Campo obrigatorio!
    private String confirmationPassword; // confirmação de senha

}
