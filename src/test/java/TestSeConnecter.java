import fr.doranco.reservations.control.IUserControl;
import fr.doranco.reservations.control.UserControl;
import fr.doranco.reservations.entity.User;

public class TestSeConnecter {

	public static void main(String[] args) {

		try {
			IUserControl userControl = new UserControl();
			
			if (userControl.seConnecter("Denzton3", "Denzton3"))
				System.out.println("Utilisateur connecté");
			else
				System.out.println("Login et/ou Mot de passe incorrect(s)");
			System.out.println(userControl.seConnecter("Denzton3", "Denzton3"));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
