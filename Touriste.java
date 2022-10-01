 class Touriste{

	String nom , prenom, nationalite;
	int age;
	String pays_visites = " " ;
	String Commentaires;
	public void AjouterPays(String p){
		pays_visites += p +" ";
	
	}
	
	public void AfficherListPays(){

		if(pays_visites== " ")
		System.out.println(" le touriste ne pas visite un pays");
		else
		System.out.println(" List de pays :" + pays_visites);
	
	
	}
	
	
public Touriste(String nom, String prenom, String nationalite, int age) {
	this.nom = nom;
	this.prenom = prenom;
	this.nationalite = nationalite;
	this.age = age;
}
public  void LaisserCommentaires(String c){
Commentaires= c;

}

   public void AfficherCommentaires(){
		System.out.println(Commentaires);
	}


	public static void main(String [] args){

		Touriste A = new Touriste("zoubir", "remmache", "algerain", 19);
		A.AjouterPays("france");
		A.AfficherListPays();

		

	}}
