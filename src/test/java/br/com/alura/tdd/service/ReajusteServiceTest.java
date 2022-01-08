package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteServiceTest {

    private ReajusteService service;
    private Funcionario func;

    @BeforeEach // Essa notação serve para que o Junit chame  esse método antes de executar cada um desses métodos
    public  void inicializar(){
        this.service = new ReajusteService();
        this.func = new Funcionario("João", LocalDate.now(),new BigDecimal(1000));
    }

    @Test
    public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar(){
        service.concederReajuste(func, Desempenho.A_DESEJAR);
        Assertions.assertEquals(new BigDecimal("1030.00"),func.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeQuinzePorcentoQuandoDesempenhoForBom(){
        service.concederReajuste(func, Desempenho.BOM);
        Assertions.assertEquals(new BigDecimal("1150.00"),func.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeVintePorcentoQuandoDesempenhoForOtimo(){
        service.concederReajuste(func, Desempenho.OTIMO);
        Assertions.assertEquals(new BigDecimal("1200.00"),func.getSalario());
    }

}
