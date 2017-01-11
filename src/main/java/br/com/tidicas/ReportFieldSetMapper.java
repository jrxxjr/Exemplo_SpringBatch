package br.com.tidicas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import br.com.tidicas.dados.Report;

/**
 * Classe responsável pelas informações de saída do SpringBatch.
 * 
 * @author Evaldo Junior
 *
 */
public class ReportFieldSetMapper implements FieldSetMapper<Report> {

	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	@Override
	public Report mapFieldSet(FieldSet fieldSet) throws BindException {
		
		Report report = new Report();
		report.setId(fieldSet.readInt(0));
		report.setNomeUsuario(fieldSet.readString(1));
		String data = fieldSet.readString(2);
		
		try {
			report.setData(dateFormat.parse(data));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return report;
		
	}

}