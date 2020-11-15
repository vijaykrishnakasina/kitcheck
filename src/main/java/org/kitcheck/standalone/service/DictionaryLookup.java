package org.kitcheck.standalone.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DictionaryLookup {

	public void createDictionaryAndFindMatchingEntries(String dictionaryName, String number) {

		List<String> numbers = new ArrayList<>();
		numbers.add(number.replace("-", ""));
		Trie trie = new Trie();

		addEntriedToTrie(dictionaryName, trie);

		findEntriesInTrie(numbers, trie);

	}

	private void findEntriesInTrie(List<String> numbers, Trie trie) {
		for(String number : numbers) {
			System.out.println("Entries for "+ number + " => " +  trie.getTrieByNumber(number));
		}
		
	}

	private void addEntriedToTrie(String dictionaryName, Trie trie) {
		BufferedReader br = null;
		try {
			
			
			File file = new File(getClass().getClassLoader().getResource(dictionaryName).getFile()); 
			FileReader fr = new FileReader(file); 
			br = new BufferedReader(fr); 
			String line;
			while ((line = br.readLine()) != null) {
				trie.addEntry(line, line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
