class TrieNode {
    TrieNode[] children;
    boolean isWordCompleted;

    public TrieNode() {
        children = new TrieNode[26];
        isWordCompleted = false;
    }
}

class Trie {
    TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode newRoot = root;
        for (char ch : word.toCharArray()) {
            int alphabetIndex = ch - 'a';
            if (newRoot.children[alphabetIndex] == null) {
                newRoot.children[alphabetIndex] = new TrieNode();
            } 
            newRoot = newRoot.children[alphabetIndex];
        }
        newRoot.isWordCompleted = true;
    }
    
    public boolean search(String word) {
        TrieNode newRoot = root;
        for (char ch : word.toCharArray()) {
            int alphabetIndex = ch - 'a';
            if (newRoot.children[alphabetIndex] == null) {
                return false;
            } 
            newRoot = newRoot.children[alphabetIndex];
        }
        if (newRoot.isWordCompleted == true) {
            return true;
        }
        return false;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode newRoot = root;
        for (char ch : prefix.toCharArray()) {
            int alphabetIndex = ch - 'a';
            if (newRoot.children[alphabetIndex] == null) {
                return false;
            } 
            newRoot = newRoot.children[alphabetIndex];
        }
        return true;
    }
}
