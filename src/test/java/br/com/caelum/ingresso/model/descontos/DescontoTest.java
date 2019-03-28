package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;

import org.junit.Assert;
import org.junit.Test;

import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.Ingresso;
import br.com.caelum.ingresso.model.Lugar;
import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;
import br.com.caelum.ingresso.model.TipoDeIngresso;

public class DescontoTest {
	@Test
	public void NaoDeveConcederDescontoParaIngressoNormal() {
		Lugar lugar = new Lugar("A", 1);
		Sala sala = new Sala("IMAX", new BigDecimal("10.0"));
		Filme filme = new Filme("Frozen", Duration.ofMinutes(90), "infantil", new BigDecimal("10.0"));
		Sessao sessao = new Sessao(LocalTime.parse("10:00:00"), sala, filme);
		
		Ingresso ingresso = new Ingresso(sessao, TipoDeIngresso.INTEIRO, lugar);
		
		BigDecimal precoEsperado = new BigDecimal("20.00");
		

		Assert.assertEquals(precoEsperado, ingresso.getPreco());
	}
	
	@Test
	public void garanteQueIngressosComDescontoDeBancoEstejamSendoCalculadosComTrintaPorcentoDeDesconto() {
		Lugar lugar = new Lugar("A", 1);
		Sala sala = new Sala("IMAX", new BigDecimal("10.0"));
		Filme filme = new Filme("Frozen", Duration.ofMinutes(90), "infantil", new BigDecimal("10.0"));
		Sessao sessao = new Sessao(LocalTime.parse("10:00:00"), sala, filme);
		
		Ingresso ingresso = new Ingresso(sessao, TipoDeIngresso.BANCO, lugar);		
		BigDecimal precoEsperado = new BigDecimal("14.00");
		

		Assert.assertEquals(precoEsperado, ingresso.getPreco());
	}
	
	@Test
	public void garanteQueEstudantesPaguemMeiaEntrada() {
		Lugar lugar = new Lugar("A", 1);
		Sala sala = new Sala("IMAX", new BigDecimal("10.0"));
		Filme filme = new Filme("Frozen", Duration.ofMinutes(90), "infantil", new BigDecimal("10.0"));
		Sessao sessao = new Sessao(LocalTime.parse("10:00:00"), sala, filme);
		
		Ingresso ingresso = new Ingresso(sessao, TipoDeIngresso.ESTUDANTE, lugar);		
		BigDecimal precoEsperado = new BigDecimal("10.00");
		

		Assert.assertEquals(precoEsperado, ingresso.getPreco());
	}

}
