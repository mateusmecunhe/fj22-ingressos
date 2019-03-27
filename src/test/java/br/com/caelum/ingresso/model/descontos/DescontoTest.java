package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.Ingresso;
import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;

public class DescontoTest {
	@Test
	public void NaoDeveConcederDescontoParaIngressoNormal() {
		Sala sala = new Sala("IMAX", new BigDecimal("10.0"));
		Filme filme = new Filme("Frozen", Duration.ofMinutes(90), "infantil", new BigDecimal("10.0"));
		Sessao sessao = new Sessao(LocalTime.parse("10:00:00"), sala, filme);
		
		Ingresso ingresso = new Ingresso(sessao, new SemDesconto());
		
		BigDecimal precoEsperado = new BigDecimal("20.00");
		

		Assert.assertEquals(precoEsperado, ingresso.getPreco());
	}

}
