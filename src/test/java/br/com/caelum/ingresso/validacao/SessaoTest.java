package br.com.caelum.ingresso.validacao;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.Ingresso;
import br.com.caelum.ingresso.model.Lugar;
import br.com.caelum.ingresso.model.Sala;
import br.com.caelum.ingresso.model.Sessao;
import br.com.caelum.ingresso.model.TipoDeIngresso;

public class SessaoTest {
//	
//	@Test
//	public void garanteQueOLugarA1EstaOcupadoEOsLugaresA2EA3Disponiveis() {
//		Lugar a1 = new Lugar("A", 1);
//		Lugar a2 = new Lugar("A", 2);
//		Lugar a3 = new Lugar("A", 3);
//		
//		Filme filme = new Filme("Avengers", Duration.ofMinutes(78), "acao", new BigDecimal("10.0"));
//		Sala sala = new Sala("sala 1", new BigDecimal("11.0"));
//		Sessao sessao = new Sessao(LocalTime.parse("10:00:00"), sala, filme);
//		
//		Ingresso ingresso = new Ingresso(sessao, TipoDeIngresso.INTEIRO, a1);
//		
//		Set<Ingresso> ingressos = Stream.of(ingresso).collect(Collectors.toSet());
//		
//		sessao.setIngresso(ingressos);
		
//	}

}
