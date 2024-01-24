package classe;

public class Usuario {
	String nome;
	String email;

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Usuario) {

			Usuario outro = (Usuario) obj;

			return outro.nome.equals(this.nome) && outro.email.equals(this.email);
		} else {
			return false;
		}
	}

}
