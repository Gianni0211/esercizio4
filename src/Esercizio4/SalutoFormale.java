package Esercizio4;

public class SalutoFormale implements ISalutatore {

	@Override
	public String salutaMattino(String name) {

		return "Buongiorno " + name + " ben svegliato!";
	}

	@Override
	public String salutaNotte(String name) {

		return "Buonanotte " + name + ", le auguro una buona notte";
	}

	@Override
	public String salutaSera(String name) {

		return "Buonasera " + name + ", le auguro una buona serata";
	}

}
