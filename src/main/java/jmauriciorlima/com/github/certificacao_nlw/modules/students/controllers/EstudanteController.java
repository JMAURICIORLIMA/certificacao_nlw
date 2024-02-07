package jmauriciorlima.com.github.certificacao_nlw.modules.students.controllers;

import jmauriciorlima.com.github.certificacao_nlw.modules.students.dto.VerificaExistenciaCertificacaoDTO;
import jmauriciorlima.com.github.certificacao_nlw.modules.students.useCases.VerificaSeTemCertificacaoUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {

    @Autowired
    private VerificaSeTemCertificacaoUseCase verificaSeTemCertificacaoUseCase;
    @PostMapping("/verificaSeTemCertificacao")
    public String verificaSeTemCertificacao
            (@RequestBody VerificaExistenciaCertificacaoDTO verificaExistenciaCertificacaoDTO) {
        boolean resultado = this.verificaSeTemCertificacaoUseCase.executar(verificaExistenciaCertificacaoDTO);
        if (resultado) {
            return "Usuário já fez a prova";
        }
        return "Usuário pode fazer a prova";
    }
}
