package jmauriciorlima.com.github.certificacao_nlw.modules.students.controllers.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CertificacaoEntidadeEstudante {

    private UUID id;
    private UUID idEstudante;
    private String tecnologia;
    private int nota;
    List<EntidadeDeCertificacoesDeResposta> entidadeDeCertificacoesDeRespostaList;
}
