package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

import java.math.BigDecimal;

public class ReajusteService {
    public void concederReajuste(Funcionario func, Desempenho desempenho) {

        BigDecimal percentual = desempenho.percentualReajuste();
        BigDecimal reajuste = func.getSalario().multiply(percentual);
        func.reajustarSalario(reajuste);

    }
}
