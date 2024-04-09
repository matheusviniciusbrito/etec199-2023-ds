
public class Main {

	public static void main(String[] args) {
		
		Filme filme1 = new Filme();
		filme1.setTitulo("Os vingadores");
		filme1.setDuracaoEmMinutos(142);
		System.out.printf(filme1.exibirDuracaoEmHoras());
		
		Filme filme2 = new Filme();
		filme2.setTitulo("Hotel Transilvânia");
		filme2.setDuracaoEmMinutos(93);
		System.out.printf(filme2.exibirDuracaoEmHoras());
		
		System.out.println("Os filmes em cartaz são "+ filme1.getTitulo() + " e " + filme2.getTitulo() + ".");
		System.out.println();
		
		Filme filme3 = new Filme();
		filme3.setTitulo("Interestelar");
		filme3.setDuracaoEmMinutos(169);
		System.out.printf(filme3.exibirDuracaoEmHoras());

		Filme filme4 = new Filme();
		filme4.setTitulo("Harry Potter e as Relíquias da Morte Parte 1");
		filme4.setDuracaoEmMinutos(145);
		System.out.printf(filme4.exibirDuracaoEmHoras());
		
		Filme filme5 = new Filme();
		filme5.setTitulo("Matrix");
		filme5.setDuracaoEmMinutos(136);
		System.out.printf(filme5.exibirDuracaoEmHoras());
		
		System.out.println("Os filmes em cartaz são "+ filme3.getTitulo() + ", " + filme4.getTitulo() + " e " + filme5.getTitulo() + ".");
	}

}
