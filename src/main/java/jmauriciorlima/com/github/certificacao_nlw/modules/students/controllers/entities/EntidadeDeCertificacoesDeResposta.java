package jmauriciorlima.com.github.certificacao_nlw.modules.students.controllers.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntidadeDeCertificacoesDeResposta {

    private UUID id;
    private UUID idCertificado;
    private UUID idEstudante;
    private UUID idPergunga;
    private UUID idResposta;
    private boolean estaCorreto;
}
