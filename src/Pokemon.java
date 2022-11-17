import java.util.Random;

public abstract class Pokemon {
	 	private String nom;
	    private int niveau;
	    private int hp;
	    private float atk;
	    private static Random r = new Random();
	    private static final int niveauMax = 10;
	    
	    public Pokemon(String nom) {
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
	        Pokemon.r = r;
	    }

	    public static int getNiveaumax() {
	        return niveauMax;
	    }
	    
	    public Boolean isKo() {
	        return this.hp == 0;
	    }
	    /**
	     * 
	     */
	    public void soigner() {
	        this.hp = 2*niveau;
	    }
	    
	    /**
	     * 
	     * @param p
	     */
	    
	    public abstract void attaquer(Pokemon p);
	    //ToString du pokemon A ARRANGER
	    public String toString() {
	        return "Je m'appelle "+getNom()+"\n   je suis de niveau "+getNiveau()+"\n   j'ai "+getHp()+" points de vie\n   mon attaquee de base est de "+getAtk();
	    }
	    
	    public void log(String msg) {
	    	System.out.println("[Pokemon " + getNom() + "] : " + msg);
	    	
	    }
	    public abstract void subir(Pokemon p);
	    public static void main(String[] args) {
	    	// test Pokemon
			System.out.println("\nTEST POKEMON0 \n");
			/*Pokemon p1 = new Pokemon("Rhinolove");
			Pokemon p2 = new Pokemon("Chovsourir");
			p1.log(p1.toString());
			p2.log(p2.toString());
			p1.attaquer(p2);
			p2.log(p2.toString()); */
		}
	    
}
