package keygen.logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import keygen.object.Key;
import keygen.object.User;
import keygen.persistence.KGPersist;

public class KGLogic {

	protected KGPersist kgp;
	private ArrayList<Key> keys;
	private ArrayList<User> users;
	protected ResultSet rs;

	public KGLogic() {
		kgp = new KGPersist();
		keys = new ArrayList<Key>();
		users = new ArrayList<User>();
		getKeysFromDb();
		getUsersFromDb();
	}

	public String generateKey(String username) {
		Key key = new Key();
		while (keys != null && !isOriginal(key)) {
			key = new Key();
		}
		return key.getKey();
		// System.out.println(key.getKey());

	}

	private void getKeysFromDb() {
		rs = kgp.getKeys();
		try {
			if (rs == null) {

			} else {
				while (rs.next()) {
					keys.add(new Key(rs.getString("key"), rs.getInt("id")));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void getUsersFromDb() {
		rs = kgp.getUsers();
		try {
			if (rs == null) {

			} else {
				while (rs.next()) {
					int id = rs.getInt("id");
					String username = rs.getString("username");
					users.add(new User(id, username));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private boolean isOriginal(Key k) {
		for (Key key : keys) {
			if (key.equals(k))
				return false;
		}
		return true;
	}
	
	public ArrayList<Key> getKeys(){
		return keys;
	}

}
