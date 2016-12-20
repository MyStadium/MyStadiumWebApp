package mystadium


class LoginController {

    def index() {
        def user = Utilisateur.findByNom("Admin")
        [nom : user.nom, prenom:user.prenom, mail: user.adresseMail]
    }
}
