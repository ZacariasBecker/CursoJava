package oo.heranca;

public class Jogador {

	int vida = 100;
	int x;
	int y;

	boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(this.x - oponente.x);
		int deltaY = Math.abs(this.y - oponente.y);

		if ((deltaX == 0 && deltaY == 1) || (deltaX == 1 && deltaY == 0)) {
			oponente.vida -= 10;
			return true;
		}

		return false;
	}

	boolean andar(Direcao direcao) {
//		if (direcao == Direcao.NORTE) {			
//			this.y++;
//		}

		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}

		return true;
	}

}
