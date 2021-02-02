package Esercizio4;

public class SalutoInformale implements ISalutatore {

	@Override
	public String salutaMattino(String name) {

		return "Ciao " + name + " ben svegliato!";
	}

	@Override
	public String salutaNotte(String name) {

		return "Ciao " + name + " buona notte!";
	}

	@Override
	public String salutaSera(String name) {

		return "Ciao " + name + " buona sera!";
	}

}
