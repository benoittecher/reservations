import fr.doranco.reservations.control.IUserControl;
import fr.doranco.reservations.control.UserControl;
import fr.doranco.reservations.entity.User;

public class TestSeConnecter {

	public static void main(String[] args) {

		try {
			IUserControl userControl = new UserControl();
			
			if (userControl.seConnecter("existe", "existe"))
				System.out.println("Utilisateur connecté");
			else
				System.out.println("Login et/ou Mot de passe incorrect(s)");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
