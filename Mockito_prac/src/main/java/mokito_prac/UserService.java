package mokito_prac;

//Bussiness Logic

public class UserService {
	UsersDao dao;

	public UserService(UsersDao dao) {
		this.dao = dao;
	}

	public String typeOfCustomer(int id) {

		Users user = dao.findById(id);

		if (user.getBalance() > 0 && user.getBalance() <= 1000) {
			return "new User";
		} else if (user.getBalance() > 1001 && user.getBalance() <= 2000) {
			return "regular user";
		} else {
			return "premium user";
		}

	}

}
