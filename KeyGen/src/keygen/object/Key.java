package keygen.object;

import java.util.Random;

public class Key {

	private int id;
	private String key;

	public Key(String key, int id) {
		setKey(key);
		setId(id);
	}
	
	public Key(){
		newKey();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public void newKey() {
		String key = "";
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random r = new Random();
		for (int i = 0; i < 15; i++) {
			if (i % 5 == 0 && i > 0) {
				key += "-";
			}
			if (i < 3) {
				key += "" + alphabet.charAt(r.nextInt(26));
			} else {
				key += "" + r.nextInt(10);
			}
		}
		setKey(key);
		//System.out.println(key);
	}

	public boolean equals(Key key) {
		if (getKey() == key.getKey())
			return true;
		return false;
	}
}
