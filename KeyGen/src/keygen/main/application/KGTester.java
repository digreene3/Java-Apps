package keygen.main.application;

import java.util.ArrayList;

import keygen.logic.KGLogic;
import keygen.object.Key;

public class KGTester {

	public static void main(String[] args){
		//Key key = new Key();
		//System.out.println(key.getKey());
		KGLogic l = new KGLogic();
		ArrayList<Key> keys = l.getKeys();
		for(Key key: keys){
			System.out.println(key);
		}
	}
}
