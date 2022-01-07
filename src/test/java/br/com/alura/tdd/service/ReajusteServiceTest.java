package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteServiceTest {

    @Test
    public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar(){

        ReajusteService service = new ReajusteService();
        Funcionario func = new Funcionario("João", LocalDate.now(),new BigDecimal(1000));

        service.concederReajuste(func, Desempenho.A_DESEJAR);

        Assertions.assertEquals(new BigDecimal("1030.00"),func.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeQuinzePorcentoQuandoDesempenhoForBom(){

        ReajusteService service = new ReajusteService();
        Funcionario func = new Funcionario("João", LocalDate.now(),new BigDecimal(1000));

        service.concederReajuste(func, Desempenho.BOM);

        Assertions.assertEquals(new BigDecimal("1150.00"),func.getSalario());
    }

    @Test
    public void reajusteDeveriaSerDeVintePorcentoQuandoDesempenhoForOtimo(){

        ReajusteService service = new ReajusteService();
        Funcionario func = new Funcionario("João", LocalDate.now(),new BigDecimal(1000));

        service.concederReajuste(func, Desempenho.OTIMO);

        Assertions.assertEquals(new BigDecimal("1200.00"),func.getSalario());
    }

}
