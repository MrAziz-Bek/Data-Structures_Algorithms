public class Main {
    public static void main(String[] args) {
        var trie = new Trie();
        // trie.insert("cat");
        // trie.insert("can");
        // trie.traverse();
        // System.out.println(trie.contains("care"));
        // System.out.println(trie.contains("car"));
        trie.insert("card");
        trie.insert("careful");
        trie.insert("egg");
        trie.remove(null);
        System.out.println(trie.findWords(null));
    }
}
