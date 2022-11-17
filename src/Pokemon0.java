import java.util.Random;

public class Pokemon0 {
	 private String nom;
	    private int niveau;
	    private int hp;
	    private float atk;
	    private static Random r = new Random();
	    private static final int niveauMax = 10;
	    
	    public Pokemon0(String nom, int niveau) {
	        this.nom = nom;
	        this.niveau = r.nextInt(1, niveauMax+1);
	        this.hp = 2*this.niveau;
	        this.atk = (this.niveau/2) + 1;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public int getNiveau() {
	        return niveau;
	    }

	    public void setNiveau(int niveau) {
	        this.niveau = niveau;
	    }

	    public int getHp() {
	        return hp;
	    }

	    public void setHp(int hp) {
	        this.hp = hp;
	    }

	    public float getAtk() {
	        return atk;
	    }

	    public void setAtk(float atk) {
	        this.atk = atk;
	    }

	    public static Random getR() {
	        return r;
	    }

	    public static void setR(Random r) {
	        Pokemon0.r = r;
	    }

	    public static int getNiveaumax() {
	        return niveauMax;
	    }
	    
	    public Boolean isKo() {
	        return this.hp == 0;
	    }
	    
	    public void soigner() {
	        this.hp = 2*niveau;
	    }
	    
	    public void attaquer(Pokemon0 p) {
	        System.out.println("J'attaque "+ p.nom);
	        p.hp -= this.atk;
	    }

	    //@Override ToString du pokemon A ARRANGER
	    public String toString() {
	        return "\nPokemon "+getNom()+": Je m'appelle "+getNom()+"\nje suis de niveau "+getNiveau()+"\nj'ai "+getHp()+" points de vie\n mon attaquee de base est de "+getAtk();
	    }
	    
}
