package jmauriciorlima.com.github.certificacao_nlw.modules.students.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VerificaExistenciaCertificacaoDTO {

    private String email;
    private String tecnologia;

}
