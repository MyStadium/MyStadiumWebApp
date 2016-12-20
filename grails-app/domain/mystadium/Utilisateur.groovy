package mystadium

class Utilisateur {

    Integer id;
    String nom;
    String prenom;
    String login;
    String motDePasse;
    String adresseMail;
    Integer nbrBonScore;

    static constraints = {
        id nullable: false
        adresseMail unique: true, email:true
        motDePasse blank: false, nullable: false
        nom blank : false
        prenom blank: false
        login unique: true, blank: false
        nbrBonScore nullable: false
    }

    static mapping = {
        table "utilisateur"
        version false
        columns {
            id column:'IdUtilisateur'
            nom column: 'Nom'
            prenom column: 'Prenom'
            login column: 'Login'
            motDePasse column: 'MotDePasse'
            adresseMail column: 'AdresseMail'
            nbrBonScore column: 'NbrBonScore'
        }
    }
}
