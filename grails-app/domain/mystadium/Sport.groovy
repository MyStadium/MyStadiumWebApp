package mystadium

class Sport {

    Integer id;
    String nom;
    Integer nbrPeriodes;
    Integer tempsPeriode;
    Integer nbrJoueurs;

    static constraints = {
        id nullable: false;
        nom blank: false;
        nbrPeriodes nullable: false;
        tempsPeriode nullable: false;
        nbrJoueurs nullable:false;
    }

    static mapping = {
        table "sport"
        version false
        columns {
            id column:'IdSport'
            nom column: 'Nom'
            nbrPeriodes column: 'NbrPeriodes'
            tempsPeriode column: 'TempsPeriode'
            nbrJoueurs column: 'NbrJoueurs'
        }
    }
}
