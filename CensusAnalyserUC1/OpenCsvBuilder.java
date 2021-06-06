package CensusAnalyserUC1;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.Reader;
import java.util.Iterator;


public class OpenCsvBuilder {
	public<E>Iteartor<E> getCSVFileIteartor(Reader reader,Class<E> csvClass) throws CensusAnalyserException {
		try {
			CsvToBeanBuilder<E> csvToBeanBuilder = new Csvbuilder<>(reader);
			csvToBeanBuilder.withType(csvclass);
			csvToBeanBuilder.withIgnoreLeadLenghtIteSpace(true);
			csvToBean<E> csvToBean = csvToBeanBuilder.build();
			return csvToBean.Iterator();
		} catch (IllegalStateException e) {
			throw new CensusAnalyserException(e.getMessage(),
				CensusAnalyserException.ExceptionType.UNABLE_TO_PARSE);
			
		}
	}
}



