package org.kitcheck.standalone.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.kitcheck.standalone.utils.VanityUtil;

public class Trie {

	Set<String> entries = new HashSet<>();
	Map<Integer, Trie> map = new HashMap<>();
	
	
	
	
	public Trie addEntry(String entryPart, String entry){
		if (entryPart.length() == 1) {
			this.entries.add(entry);
			return this;
		}
		
		else if(entryPart.length() > 1) {
			int key = VanityUtil.getKeyByCharacter(entryPart.charAt(0));
			
			
			if (!map.containsKey(key)) {
				map.put(key, new Trie());
			}
			
			Trie trie = map.get(key);
			return trie.addEntry(entryPart.substring(1), entry);
			
		}
		
		else 
			return new Trie();
	}
	
	public Set<String> getTrieByNumber(String number) {
		
		if (number.length() == 1) {
			return entries;
		}
		else {
			int key = (number.charAt(0) - '0');
			Trie trie = map.get(key);
			if (trie == null) {
				System.err.println("No entries found for given number");
				return null;
			}
			return trie.getTrieByNumber(number.substring(1));
					
		}
	}
}
