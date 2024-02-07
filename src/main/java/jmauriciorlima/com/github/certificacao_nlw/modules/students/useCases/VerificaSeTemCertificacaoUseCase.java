package jmauriciorlima.com.github.certificacao_nlw.modules.students.useCases;

import jmauriciorlima.com.github.certificacao_nlw.modules.students.dto.VerificaExistenciaCertificacaoDTO;
import org.springframework.stereotype.Service;

@Service
public class VerificaSeTemCertificacaoUseCase {

    public boolean executar(VerificaExistenciaCertificacaoDTO dto) {
        if(dto.getEmail().equals("mauricio.rodriguesdelima@gmail.com") && dto.getTecnologia().equals("Java")) {
            return true;
        }
        return false;
    }

}
