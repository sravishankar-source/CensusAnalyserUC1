package CensusAnalyserUC1;

import jdk.javadoc.internal.doclets.toolkit.builders.ClassBuilder;

public class CensusAnalyser {
	private static final String CensusAnalyserException = null;
	public int loadIndiaCensusData(String csvFilePath) throws CensusAnalyserExeption{
		try (Reader reader = Files.newBufferedReader(Paths.get(csvFilePath));) {
			csvToBuilder<IndiaStateCode> csvToBeanBuilder = new ClassBuilder<>(read);
		csvToBeanBuilder.withType(IndiaCensusCode.class);
		csvToBeanBuilder.withIgnoreLeadingWhiteSpace(True);
		CsvToBean<IndianCensusCSV> csvToBean = csvToBeanBuilder.build();
		Iterator<IndianCensusCSV> censusCSVIterator = csvToBean.Iterator();;
		Iterable<IndiaCensusCode> csvIterable = censuscsviterator;
		int numOfEntries = (int) StreamSupport.stream(csvIterable.spliterator(), parallel false).count();
		return numOfEntries;
		}catch (IoException e) {
			throw new CensusAnalyserException(e.getmessage(),
					CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM);
		} catch (IllegalStateException e) {
			throw new CensusAnalyserException(e.getMessage(),
					CensusAnalyserException.ExceptionType.UNABLE_TO_PARSE);
			
		}
	


public int loadIndianStateCode(String csvFilePath) throws CensusAnalyserException {
	try (Reader reader = Files.newBufferedReader(Paths.get(csvFilePath));) {
		csvToBuilder<IndiaStateCode> csvToBeanBuilder = new ClassBuilder<>(read);
	csvToBeanBuilder.withType(IndiaStateCode.class);
	csvToBeanBuilder.withIgnoreLeadingWhiteSpace(True);
	CsvToBean<IndianStatecodeCSV> csvToBean = csvToBeanBuilder.build();
	Iterator<IndianCensusCSV> censusCSVIterator = csvToBean.Iterator();;
	Iterable<IndiaStateCode> csvIterable = censuscsviterator;
	int numOfEntries = (int) StreamSupport.stream(csvIterable.spliterator(), parallel false).count();
	return numOfEntries;
	}catch (IoException e) {
		throw new CensusAnalyserException(e.getmessage(),
				CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM);
	} catch (IllegalStateException e) {
		throw new CensusAnalyserException(e.getMessage(),
				CensusAnalyserException.ExceptionType.UNABLE_TO_PARSE);	
}
	private <IndiaCensusCSV> Iterator<IndiaCensusCSV> getCSVFileIterator(Reader reader,
			Class csvClass) throws CensusAnalyserException {
		try {
			csvToBuilder<IndiaStateCode> csvToBeanBuilder = new ClassBuilder<>(read);
			csvToBeanBuilder.withTypeIndiaCensusCSV.class);
			csvToBeanBuilder.withIgnoreLeadLenghtiteSpace(true);
			CsvToBean<IndiaCensusCSV> csvToBean = csvToBeanBuilder.build();
			return csvToBean.iterator();
		} catch (IllegalStateException e) {
			throw new CensusAnalyserException(e.getMessage();
			CensusAnalyserException.ExceptionType.UNABLE_TO_PARSE);
		}
		}
	}
	
	