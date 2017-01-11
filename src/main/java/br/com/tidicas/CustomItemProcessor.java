package br.com.tidicas;

import org.springframework.batch.item.ItemProcessor;

import br.com.tidicas.dados.Report;

/**
 * Classe responsável pelo processo do job de teste do SpringBatch
 * 
 * @author Evaldo Junior
 *
 */
public class CustomItemProcessor implements ItemProcessor<Report, Report> {

	@Override
	public Report process(Report item) throws Exception {
		
		System.out.println("Processando: " + item);
		return item;
	}

}