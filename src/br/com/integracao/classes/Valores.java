package br.com.integracao.classes;

import java.util.ArrayList;
import java.util.List;

import br.com.integracao.interfaces.ValoresITF;

public class Valores implements ValoresITF{
	
	List<Integer> valores = new ArrayList<Integer>();

	@Override
	public boolean ins(int v) {
		if (v > 0) {
			valores.add(v);
			return true;
		}

		return false;
	}

	@Override
	public int del(int i) {
		
		if (valores.isEmpty()) {
			return -1;
		}
		for (Integer item : valores) {
			if (i == item) {
				valores.remove(item);
				return i;
			}

		}

		return 0;
	}

	@Override
	public int size() {

		return valores.size();
	}

	@Override
	public double mean() {
		
		if (valores.isEmpty()) {
			return 0;
		} else {
			return size();
		}

	}

	@Override
	public int greater() {
		if (valores.isEmpty()) {
			return -1;
		}
		return size();
	}

	@Override
	public int lower() {
		if (valores.isEmpty()) {
			return -1;
		}
		return size();
	}
	

}
